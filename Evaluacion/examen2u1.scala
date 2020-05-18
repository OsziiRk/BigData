//Test 2 Unit 1
//Zamorano Garcia Osvaldo Arturo
//Barraza Sierra Alexis Fernando

//1 Start a Spark session

import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()

//2 Load the Netflix Csv file, make spark infer the data types

val df = spark.read.option("header", "true").option("inferSchema","true")csv("Netflix_2011_2016.csv")

//3 What are the names of the columns

df.columns

//4 How is the scheme?

df.printSchema()

//5 Print the first 5 columns

//Show the first 5 rows
for(row <- df.head(5)){
    println(row)
}

//Print the first 5 columns
df.select($"Date",$"Open",$"High",$"Low",$"Close").show()

//6 Use describe () to learn about the dataframe

df.describe().show()

//7 Create a new dataframe with a new column called "HV Ratio" which is the relationship between
// High and volume of shares traded per day

val df1 = df.withColumn("HV Ratio", df("High")/df("Volume"))
df1.show()

//8 What day had the highest peak the column close

//The date is taken out and added to the dataframe
val df5 = df.withColumn("Day", dayofmonth(df("Date")))
//A dataframe is created with only the days and close
val df5n = df5.select($"Day", $"Close")
//The maximum close value is obtained
val df5max= (df5n.select(max("Close")))
//The maximum value is stored in a variable
val closemax=df5max.first().getDouble(0)
// The maximum close value is filtered in the dataframe showing the day and value
df5n.filter($"Close"=== closemax).show()


//9 What is the meaning of the column close
//Answer the closure of netflix in the bag

//10 What is the maximum and minimum of the volume column

df.select(max("Volume")).show()
df.select(min("Volume")).show()

//11. With Scala / Spark $ syntax answer the following:

//11a How many days was the Close column less than $ 600

df.filter($"Close" < 600).count()

//11b What percentage of the time was the high column greater than 500

val highx=df.filter($"High" > 500).count()
//Operation is performed to get percentage
val per=(highx*100)/(df.count())+"%"

//11c What is the correlation of pearson between the column high and volume

df.select(corr("High", "Volume")).show()

//11d What is the maximum of the high column per year

//The year is obtained and added in a new column
val df2 = df.withColumn("Year", year(df("Date")))
//It is grouped to the years
val dfmax = df2.groupBy("Year").max()
//The maximum highs per year ordered are taken out
dfmax.select($"Year", $"max(High)").orderBy("Year").show()


//11e What is the average of the close column for each calendar month

//The month is taken from the date and added as a new column
val df3 = df.withColumn("Month", month(df("Date")))
//The month is grouped with close
val df3prom = df3.select($"Month",$"Close").groupBy("Month").mean()
//The average is taken out and shown in order by month
df3prom.select($"Month",$"avg(Close)").orderBy("Month").show()
