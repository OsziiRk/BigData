//Practice 4
// Add 20 basic functions for the variable "df"

import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()
val df = spark.read.option("header", "true").option("inferSchema","true")csv("CitiGroup2006_2008")

//1
df.printSchema()
//2
df.show()
//3
df.columns
//4
df.select("Volume").show()
//5
df.first()
//6
df.head(10)
//7
df.describe()
//8
df.count()
//9
df.sort()
//10
df.filter($"Close" < 490 && $"low" < 300).show()
//11
df.select(corr("High", "Low")).show()
//12
df.select(sum("High")).show()
//13
df.select(mean("Low")).show()
//14
df.select(max("High")).show()
//15
df.select(min("Low")).show()
//16
df.select(variance("Low")).show()
//17
df.filter($"High" === 487.0).show()
//18
df.filter($"High" > 480).count()
//19
df.select(month(df("Date"))).show()
//20
df.select(year(df("Date"))).show()