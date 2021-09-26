//Practice 5
// Add 20 basic functions for the variable "df"

import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()
val df = spark.read.option("header", "true").option("inferSchema","true")csv("CitiGroup2006_2008")

//1.sumDistinct
df.select(sumDistinct("Sales")).show()

//2.last
df.select(last("Company")).show() //last data in company

//3.first
df.select(first("Person")).show() first data in person

//4.var_pop
df.select(var_pop("Sales")).show()

//5.avg
df.select(avg("Sales")).show()

//6.collect_list
df.select(collect_list("Sales")).show()

//7.var_samp
df.select(var_samp("Sales")).show()

//8.sum
df.select(sum("Sales")).show()

//9.stddev_pop
df.select(stddev_pop("Sales")).show()

//10.skewness
df.select(skewness("Sales")).show()

//11.min
df.select(min("Sales")).show()

//12.kurtosis
df.select(kurtosis("Sales")).show()

//13.collect_set
df.select(collect_set("Sales")).show()

//14.approx_count_distinct
df.select(approx_count_distinct("Company")).show()

//15.mean
df.select(mean("Sales")).show()

//16
df.first //   return the first column of the dataframe
//17
df.columns // Returns the dataframe columns
//18 
val df2 = df.withColumn("HV Ratio", df("High")+df("Volume")) // Add a column that derives from the high and Volume column
//19
df.select(min("Volume")).show() // Choose the volume column min
//20
df.select(max("Volume")).show() // Choose the volume column max