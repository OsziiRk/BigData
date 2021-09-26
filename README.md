
<h1>BigData - Unit 1</h1>
<p align="center">
<br><strong>Tecnológico Nacional de México</strong>
<br><strong>Instituto Tecnológico de Tijuana</strong>
<br><strong>Subdirección académica</strong>
<br><strong>Departamento de Sistemas y Computación</strong>
<br><strong>Semestre: ENERO - JUNIO 2020</strong>
<br><strong>Ingeniería en Tecnologías de la Información y Comunicaciones</strong>
<br><strong>Materia: Datos Masivos</strong>
<br><strong>Zamorano Garcia Osvaldo Arturo 15211707</strong>
<br><strong>Barraza Sierra Alexis Fernando 16212532</strong>
<br><strong>Docente: Dr. Jose Christian Romero Hernandez</strong>
</p>

<h1>Index</h1>
<ol>
<li><a href = "#Practica1" target="_self"> Practice 1 </a>
<li><a href = "#Practica2" target="_self"> Practice 2 </a>
<li><a href = "#Practica3" target="_self"> Practice 3 </a>
<li><a href = "#Practica4" target="_self"> Practice 4 </a>
<li><a href = "#Practica5" target="_self"> Practice 5 </a>
<li><a href = "#Tarea1" target="_self"> Homework #1 </a>
<li><a href = "#Tarea2" target="_self"> Homework #2 </a>
<li><a href = "#Examen1" target="_self"> Test 1 </a>
<li><a href = "#Examen2" target="_self"> Test 2 </a>
</ol>


<h1>Practices</h1>
<a name = "Practica1"> <h3>Practice 1</h3> </a>
<h4>Instructions</h4>
<ol>
<li>Develop an algorithm in scala that calculates the radius of a circle.
<li>Develop an algorithm in scala that tells me if a number is a prime number.
<li>Given the variable bird = "tweet", use string interpolation to print "I am writing a tweet".
<li>Given the variable message = "Hola Luke soy tu padre!" use slilce to extract the sequence "Luke".
<li>What is the difference of a value and a variable in scala?.
<li>Given the tuple (2,4,5,1,2,3,3.1416,23) return the number 3.1416.
</ol>
<h4>Description</h4>
<p align="justify">In this practice, in the first point we calculate the radius of a circle to perform these calculations, we use variables for the circumference and one to draw the radius where the mathematical formula is used, in point 2 we use two functions, one to calculate if is prime and another to ask for the number and show the result, to know if it is prime, we use a cycle for the operation and only go to the root of the number to avoid doing too many calculations,
for point 3 we only use the interpolation with the sign $, in point 4 we use slice to extract the luke part, the function (slice) allows us to print data of a variable, giving its coordinates, in point 5 the question was answered, in point 6 we extracted the part of the tuple that requires us with the (variable position).</p>
<h4>Code</h4>

```scala

// Practice 1

//1. Develop an algorithm in scala that calculates the radius of a circle.

print("Enter the circle circumference: ")
var circumference:Double = scala.io.StdIn.readLine.toDouble
var radius: Double=(circumference/(2*3.1416))
println(s"\n\nthe radius of the circle is $radius")


//2. Develop an algorithm in scala that tells me if a number is a prime number.

def isprime(num:Int):Boolean={
if(num <= 1)
return false
else if(num==2)
return true
else{
    var i:Int=0
    var root:Int=math.sqrt(num: Double).toInt
for (i <- 2 to root){
    if (num % i == 0){
        return false;
   }
}
return true;
}
}
def numprime(){
    println("Enter a number")
    var num:Int=scala.io.StdIn.readLine.toInt
    val Outcome=isprime(num)
    if (Outcome == true){
        println(s"The number $num is a prime number")
    }
    else{
        println(s"The number $num is not a prime number")
    }
}
numprime()

//3. Given the variable bird = "tweet", use string interpolation to print "I am writing a tweet".

    var bird="tweet"
    println(s"I am writing a $bird")


//4. Given the variable message = "Hola Luke soy tu padre!" use slilce to extract the sequence "Luke".

    var variable = "Hola Luke soy tu padre!"
    var res=variable.slice(5,9)
    println(res)


//5. What is the difference of a value and a variable in scala?.
// Answer: Value (val) is a type of variable that when assigned a value cannot be changed, and a variable (var)
// you can change its value at any time.

//6. Given the tuple (2,4,5,1,2,3,3.1416,23) return the number 3.1416.

    var x = (2,4,5,1,2,3,3.1416,23)
    println(x._7)

```

<a name = "Practica2"> <h3>Practice 2</h3> </a>

<h4>Instructions</h4>
<ol>
<li>Create a list called "list" with the elements "rojo", "blanco", "negro".
<li>Add 5 more items to "list": "verde" ,"amarillo", "azul", "naranja", "perla".
<li>Bring the elements of "list" "verde", "amarillo", "azul".
<li>Create a number array in the 1-1000 range in 5-in-5 steps.
<li>What are the unique elements of the List (1,3,3,4,6,7,3,7) use conversion to sets.
<li>Create a mutable map called "names" that contains the following  "Jose", 20, "Luis", 24, "Ana", 23, "Susana", "27".
<li>Print all map keys.
<li>Add the following value to the map ("Miguel", 23).
</ol>
<h4>Description</h4>
<p align="justify">In this practice we use lists arrays and mutable maps, lists are declared as a variable of type list, to the lists you can add more elements and can be ordered in different ways when you call them, to create arrangements they are declared as variables of type array and can be declared with values ​​or generated with ranges of numerical values ​​for example as in point 4 from 5 in 5 to 1000, mutable maps are lists that have a key for each value declared as mutable collections.</p>
<h4>Code</h4>

```scala

// Practice 2

// 1. Create a list called "list" with the elements "rojo", "blanco", "negro"
var list =List("rojo","blanco","negro")

// 2. Add 5 more items to "list": "verde" ,"amarillo", "azul", "naranja", "perla"
list = "verde" ::"amarillo" ::"azul" ::"naranja" ::"perla" :: list

// 3. Bring the elements of "list" "verde", "amarillo", "azul"
list slice (0,3)

// 4. Create a number array in the 1-1000 range in 5-in-5 steps
Array.range(1, 1000, 5)

// 5. What are the unique elements of the List (1,3,3,4,6,7,3,7) use conversion to sets
var list2=List(1,3,3,4,6,7,3,7)
list2.toSet

// 6. Create a mutable map called "names" that contains the following
//   "Jose", 20, "Luis", 24, "Ana", 23, "Susana", "27"
val names = collection.mutable.Map(("Jose", 20), ("Luis", 24), ("Ana", 23),("Susana",27))

// 7. Print all map keys
names.keys

// 8. Add the following value to the map ("Miguel", 23)
names += ("Miguel" -> 23)

```

<a name = "Practica3"> <h3>Practice 3</h3> </a>
<h4>Instructions</h4>
<p>Develop the 5 algorithms of the Fibonacci sequence.</p>
<h4>Description</h4>
<p align="justify">In this practice 6 algorithms of the Fibonacci sequence were performed.
The Fibonacci sequence is done by always adding the last 2 numbers (All the numbers present in the sequence are called Fibonacci numbers) and existing mathematical algorithms are used.</p>
<h4>Code</h4>

```scala

// Practice 3

// Develop the 5 algorithms of the Fibonacci sequence.

//Algorithm 1 Downward recursive version
def  function(n: Int): Int =  
{  
// If the number entered in the function is less than 2, the number entered will be returned
if (n<2)  
{  
return n  
}  
// if it is not less than 2, the function will do a series of sums, and the result returns 
else  
{  
return function(n-1) + function(n-2)  
}  
}  
function(10) 

//Algorithm 2 Version with explicit formula

def  function1(n: Double): Double =  
{  
// If the number entered in the function is less than 2, the number entered will be returned  
if (n<2)  
{
return n
}  
//  if it is not less than 2, the following will be done 
else  
{  
// the formula is divided into parts to finally create the result
var p = ((1+(Math.sqrt(5)))/2)  
var a = Math.pow(p,n)  
var b = Math.pow((1-p),n)  
var j = ((a-(b)))/(Math.sqrt(5))  
return(j)  
}  
}  
function1(10)
// Third Algorithm
// In this third algorithm a function was added that after having performed
// the corresponding operations the function will give us a result (return)
// this must be an integer value (Int)
def function2 (n: Int): Int = {
var a = 0
var b = 1
var c = 0
// A cycle (for) starts where k = 1, will start cycling until it becomes (n)
// (n) represents the value that will be entered into the function
for (k <- 1 to n)
{
// Depending on the cycle (for) the variables (c, a, b) will begin to change **
// your result
// until the end of the cycle (for)
c = b + a
a = b
b = c
}
// The result will be returned with (return)
return (a)
}
function2 (10)


// Fourth Algorithm
// In this fourth quarter a function was added that after having performed
// the corresponding operations the function will give us a result (return)
// this must be an integer value (Int)

def function3 (n: Int): Int = {
var a = 0
var b = 1
// A cycle (for) starts where k = 1, will start cycling until it becomes (n)
// (n) represents the value that will be entered into the function
for (k <- 1 to n)
{
b = b + a
a = b - a
// Depending on the cycle (for) the variables (b, a) will begin to change their result
// until the end of the cycle (for)
}
// The result will be returned with (return)
return (a)
}
function3 (10)

// Fifth Algorithm
// In this fifth algorithm a function is performed that asks for an integer value (Int)
// then return an integer value with decimals (Double)

def function4 (n: Int): Double =
{
// An array is created that starts from 0 to (n + 1)
val vector = Array.range (0, n + 1)
// If the variable (n) is less than 2, that same variable is returned as a result
if (n <2)
{
return (n)
}
// Otherwise the vector with space (0) will have a value of zero (0)
// and the vector with space (1) will have a value of one (1)
else
{
vector (0) = 0
vector (1) = 1
// Start cycling with a for the vector
for (k <- 2 to n)
{
vector (k) = vector (k-1) + vector (k-2)
}
// The result will be the variable (n) according to the established vector
return vector (n)
}
}
function4 (10)


// Sixth Algorithm
// In this sixth algorithm a function was added that after having performed
// the corresponding operations the function will give us a result (return)
// this must be an integer value with decimal points (Double)

def function5 (n: Double): Double =
{
// If the value entered is less than or equal to 0, then that value will be returned
if (n <= 0)
{
return (n)
}
// Otherwise you will have to make a series of operations
else
{
var i: Double = n - 1
var auxOne: Double = 0
var auxTwo: Double = 1
var a: Double = auxTwo
var b: Double = auxOne
var c: Double = auxOne
var d: Double = auxTwo
// Start a cycle (while) where the variables will begin to change value
// depending on the cycle iteration
while (i> 0)
{
// If variable (i) is odd, different operations will be done
if (i% 2 == 1)
{
auxOne = (d * b) + (c * a)
auxTwo = ((d + (b * a)) + (c * b))
a = auxOne
b = auxTwo
}
// If variable (i) is even, different operations will be done
else
{
var pow1 = Math.pow (c, 2)
var pow2 = Math.pow (d, 2)
auxOne = pow1 + pow2
auxTwo = (d * ((2 * (c)) + d))
c = auxOne
d = auxTwo
}
// Variable (i) will begin to change value each time the cycle is entered
// until you exit the cycle, and the sum of (a + b) is returned
i = (i / 2)
}
return (a + b)
}
}
Function5 (9)

```

<a name = "Practica4"> <h3>Practice 4</h3> </a>
<h4>Instructions</h4>
<p>Add 20 basic functions for the variable "df".</p>
<h4>Description</h4>
<p align="justify">In this practice we import a spark sql session we create a variable for the spark session and then load a dataset to later use basic functions in the dataset obtaining very interesting results</p>
<h4>Code</h4>

```scala

//Practice 4
// Add 20 basic functions for the variable "df"

import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()
val df = spark.read.option("header", "true").option("inferSchema","true")csv("CitiGroup2006_2008")

//1 print schema
df.printSchema()
//2 show the dataset
df.show()
//3 show the columns the dataset has
df.columns
//4 show the volume data
df.select("Volume").show()
//5 show the first record of the dataset
df.first()
//6 show the 10 records that head the data set
df.head(10)
//7 show interesting facts about the data
df.describe()
//8 count the total data the data set has
df.count()
//9 order the data
df.sort()
//10 show data that is between the conditions
df.filter($"Close" < 490 && $"low" < 300).show()
//11 draw the correlation
df.select(corr("High", "Low")).show()
//12 sum all data of high
df.select(sum("High")).show()
//13 mean of data
df.select(mean("Low")).show()
//14 max of data
df.select(max("High")).show()
//15 min of data
df.select(min("Low")).show()
//16 variance of data
df.select(variance("Low")).show()
//17 look for an exact data in the column
df.filter($"High" === 487.0).show()
//18 count the values ​​that meet the condition
df.filter($"High" > 480).count()
//19 sample for months
df.select(month(df("Date"))).show()
//20 sample for years
df.select(year(df("Date"))).show()

```



<a name = "Practica5"> <h3>Practice 5</h3> </a>
<h4>Instructions</h4>
<p>Add 20 basic functions for the Groups.</p>
<h4>Description</h4>
<p align="justify">In this practice we import a spark sql session we create a variable for the spark session and then load a dataset to later use basic functions in the dataset obtaining very interesting results</p>
<h4>Code</h4>

```scala

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

//16 return the first column of the dataframe
df.first 

//17 Returns the dataframe columns
df.columns 

//18 Add a column that derives from the high and Volume column
val df2 = df.withColumn("HV Ratio", df("High")+df("Volume")) 

//19 Choose the volume column min
df.select(min("Volume")).show() 

//20 Choose the volume column max
df.select(max("Volume")).show() 


```


<h1>Homework</h1>
<a name = "Tarea1"> <h3>Homework 1</h3> </a>
<h4>Investigate on the subject of Pearson correlation</h4>


<p align="justify">The Pearson product-moment correlation coefficient (or Pearson correlation coefficient, for short) is a measure of the strength of a linear association between two variables and is denoted by r. Basically, a Pearson product-moment correlation attempts to draw a line of best fit through the data of two variables, and the Pearson correlation coefficient, r, indicates how far away all these data points are to this line of best fit (i.e., how well the data points fit this new model/line of best fit).</p><p align="justify">
A Pearson correlation is a number between -1 and 1 that indicates the extent to which two variables are linearly related.
The Pearson correlation is also known as the “product moment correlation coefficient” (PMCC) or simply “correlation”.
Pearson correlations are suitable only for metric variables (which include dichotomous variables).
Can you use any type of variable for Pearson's correlation coefficient?</p><p align="justify">
No, the two variables have to be measured on either an interval or ratio scale. However, both variables do not need to be measured on the same scale (e.g., one variable can be ratio and one can be interval). Further information about types of variable can be found in our Types of Variable guide. If you have ordinal data, you will want to use Spearman's rank-order correlation or a Kendall's Tau Correlation instead of the Pearson product-moment correlation.</p>
<p align="center"><img src="https://raw.githubusercontent.com/OsziiRk/Recursos_Bigdata/master/correlacion2.png" style="max-width:100%;"></p>
<br>
<p align="center"><img src="https://raw.githubusercontent.com/OsziiRk/Recursos_Bigdata/master/correlacion1.png" style="max-width:100%;"></p>


<a name = "Tarea2"> <h3>Homework 2</h3> </a>
<h4>Investigate on the subject of variance formula </h4>


<p align="justify">The variance or variance is a measure of the dispersion of a random variable (values that are required randomly). The variability of said dispersion is specifically specific in the area of express statistics.
The variance of a sample or a set of values is the sum of the squared deviations from the average or the average, all this divided by the total number of observations minus 1. In a very general way it can be said that the variance is the standard deviation squared.</p>
    
<p align="justify">The variance, together with the standard deviation, are measures of data dispersion or observations. The dispersion of these data indicates the variety that they present, that is, if all the values in a set of data are equal, then there is no dispersion, but instead, if not all are equal then there is dispersion.</p>

<p align="justify">This dispersion can be large or small, depending on how close the average values are. he variance of a sample is symbolized as S2, while the variance of a population symbolizes as σ2. he variance of a sample is used to estimate the variance of a population, which is often unknown. This is why S2 is also commonly considered as a statistic and σ2 as a parameter.

The variance of a sample has the following formula:</p>

<p align="center"><img src="https://raw.githubusercontent.com/OsziiRk/Recursos_Bigdata/master/formulavariance.jpg" style="max-width:100%;"></p>

<p align="justify">Where, represents the sum of the subtraction between each of the sampled values () and the mean (), squared. 
    
In turn, it represents the total number of observations or sampled data. For very large values the variance is minimal or even negligible.
</p>
<br>


<h1>Tests</h1>
<a name = "Examen1"> <h3>Test 1</h3> </a>
<h4>Instructions:</h4>
<p>Develop a function called diagonal DIfference in a script with the programming language scala. It must return an integer that represents the difference of the absolute diagonal.</p>
<h4>Description</h4>
<p>Here is the first test performed in unit 1 in which basic instructions are used in scala</p>
<h4>Code</h4>

```scala

//Test 1
//Zamorano Garcia Osvaldo Arturo
//Barraza Sierra Alexis Fernando

// Matrix is declared as tuple
val arr = ((11,2,4),(4,5,6),(10,8,-12))

//The function is created to make the difference of the diagonals
def diagonaldifference(arr:((Int, Int, Int), (Int, Int, Int), (Int, Int, Int))): Int = {
//The sum of the first diagonal is taken using its positions
    val diagonal_1 =(arr._1._1)+(arr._2._2)+(arr._3._3)
//The sum of the second diagonal is taken using its positions
    val diagonal_2 =(arr._1._3)+(arr._2._2)+(arr._3._1)
//The difference between the diagonals is obtained.
    var diferencia = diagonal_1-diagonal_2
//We obtain the absolute value of the difference between the diagonals
    var resul= math.abs(diferencia)
//We return the result obtained
    return resul
}
// We send the arr to the script to get the result
diagonaldifference(arr)

```

<a name = "Examen2"> <h3>Test 2</h3> </a>
<h4>Instructions:</h4>
<p>Perform the following actions with spark dataframe using csv netflix</p>
<h4>Description</h4>
<p>Here is the second test performed on unit 1 in which instructions for DataFrame are used in Spark Scala</p>
<h4>Code</h4>

```scala
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


```


<h1>Unit 2</h1>
<p align="center">
<br><strong>Tecnológico Nacional de México</strong>
<br><strong>Instituto Tecnológico de Tijuana</strong>
<br><strong>Subdirección académica</strong>
<br><strong>Departamento de Sistemas y Computación</strong>
<br><strong>Semestre: ENERO - JUNIO 2020</strong>
<br><strong>Ingeniería en Tecnologías de la Información y Comunicaciones</strong>
<br><strong>Materia: Datos Masivos</strong>
<br><strong>Zamorano Garcia Osvaldo Arturo 15211707</strong>
<br><strong>Barraza Sierra Alexis Fernando 16212532</strong>
<br><strong>Docente: Dr. Jose Christian Romero Hernandez</strong>
</p>

<h1>Index</h1>
<ol>
<li><a href = "#Tarea1u2" target="_self"> Homework #1 </a>
<li><a href = "#Tarea2u2" target="_self"> Homework #2 </a>
<li><a href = "#Tarea3u2" target="_self"> Homework #3 </a>
<li><a href = "#Practica1u2" target="_self"> Practice 1 Linear Regression</a>
<li><a href = "#Practica2u2" target="_self"> Practice 2 Logistic Regression</a>
<li><a href = "#Practica3u2" target="_self"> Practice 3 Decision tree classifier</a>
<li><a href = "#Practica4u2" target="_self"> Practice 4 Random forest classifier</a>
<li><a href = "#Practica5u2" target="_self"> Practice 5 Gradient-boosted tree classifier</a>
<li><a href = "#Practica6u2" target="_self"> Practice 6 Multilayer perceptron classifier</a>
<li><a href = "#Practica7u2" target="_self"> Practice 7 Linear Support Vector Machine</a>
<li><a href = "#Practica8u2" target="_self"> Practice 8 One-vs-Rest classifier</a>
<li><a href = "#Practica9u2" target="_self"> Practice 9 Naive Bayes</a>
<li><a href = "#Examen1u2" target="_self"> Test 1</a>
</ol>

<h1>Homework</h1>

<a name = "Tarea1u2"> <h2>Homework 1</h2> </a>
<h3>Investigate Models for machine learning</h3>
<p align="justify">Algorithms used in machine learning fall roughly into three categories: supervised, unsupervised, and reinforcement learning. Supervised learning involves feedback to indicate when a prediction is right or wrong, whereas unsupervised learning involves no response: The algorithm simply tries to categorize data based on its hidden structure. Reinforcement learning is similar to supervised learning in that it receives feedback, but it’s not necessarily for each input or state.</p>

<p align="justify">Machine-learning algorithms continue to grow and evolve. In most cases, however, algorithms tend to settle into one of three models for learning. The models exist to adjust automatically in some way to improve their operation or behavior.</p>

#### Figure 1. Three learning models for algorithms

<p align="center"><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/figure01models.png" style="max-width:100%;"></p>

<p align="justify">In supervised learning, a data set includes its desired outputs (or labels) such that a function can calculate an error for a given prediction. The supervision comes when a prediction is made and an error produced (actual vs. desired) to alter the function and learn the mapping.</p>

<p align="justify">In unsupervised learning, a data set doesn’t include a desired output; therefore, there’s no way to supervise the function. Instead, the function attempts to segment the data set into “classes” so that each class contains a portion of the data set with common features.</p>

<p align="justify">Finally, in reinforcement learning, the algorithm attempts to learn actions for a given set of states that lead to a goal state. An error is provided not after each example (as is the case for supervised learning) but instead on receipt of a reinforcement signal (such as reaching the goal state). This behavior is similar to human learning, where feedback isn’t necessarily provided for all actions but when a reward is warranted.</p>

### Supervised learning
<p align="justify">Supervised learning is the simplest of the learning models to understand. Learning in the supervised model entails creating a function that can be trained by using a training data set, then applied to unseen data to meet some predictive performance. The goal is to build the function so that it generalizes well over data it has never seen.</p>

<p align="justify">You build and test a mapping function with supervised learning in two phases (see image below). In the first phase, you segment a data set into two types of samples: training data and test data. Both training and test data contain a test vector (the inputs) and one or more known desired output values. You train the mapping function with the training data set until it meets some level of performance (a metric for how accurately the mapping function maps the training data to the associated desired output). In the context of supervised learning, this occurs with each training sample, where you use the error (actual vs. desired output) to alter the mapping function. In the next phase, you test the trained mapping function against the test data. The test data represents data that has not been used for training and provides a good measure for how well the mapping function generalizes to unseen data.</p>

#### Figure 2. The two phases of building and testing a mapping function with supervised learning
<p align="center"><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/figure02supervised.png"></p>

#### The most common algorithms that apply to supervised learning are
* Support vector machines
* Naïve Bayes
* Neural networks 
* Decision trees
* Logistic regression

### Unsupervised learning

<p align="justify">Unsupervised learning is also a relatively simple learning model, but as the name suggests, it lacks a critic and has no way to measure its performance. The goal is to build a mapping function that categorizes the data into classes based on features hidden within the data.</p>

<p align="justify">As with supervised learning, you use unsupervised learning in two phases. In the first phase, the mapping function segments a data set into classes. Each input vector becomes part of a class, but the algorithm cannot apply labels to those classes.</p>

#### Figure 3. The two phases of using unsupervised learning
<p align="center"><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/figure03unsupervised.png"></p>

<p align="justify">The segmentation of the data into classes may be the result (from which you can then draw conclusions about the resulting classes), but you can use these classes further depending on the application. One such application is a recommendation system, where the input vector may represent the characteristics or purchases of a user, and users within a class represent those with similar interests who can then be used for marketing or product recommendations.</p>

#### The most common algorithms that apply to unsupervised learning are
* k-means clustering
* adaptive resonance theory
* ART

### Reinforcement learning
<p align="justify">Reinforcement learning is an interesting learning model, with the ability not just to learn how to map an input to an output but to map a series of inputs to outputs with dependencies (Markov decision processes, for example). Reinforcement learning exists in the context of states in an environment and the actions possible at a given state. During the learning process, the algorithm randomly explores the state–action pairs within some environment (to build a state–action pair table), then in practice of the learned information exploits the state–action pair rewards to choose the best action for a given state that lead to some goal state.</p> 

#### Figure 4. The reinforcement learning model
<p align="center"><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/figure04reinforcement.png"></p>

#### The most common algorithms that apply to Reinforcement learning are
* Dynamic programming
* Q-learning
* SARSA

<br>
<a name = "Tarea2u2"> <h2>Homework 2</h2> </a>
<h3>Investigate Vectorassembler, RootmeansquaredError</h3>

### VectorAssembler Library
<p align="justify">VectorAssembler is a transformer that combines a given list of columns into a single vector column. It is useful for combining raw features and features generated by different feature transformers into a single feature vector, in order to train ML models like logistic regression and decision trees. VectorAssembler accepts the following input column types: all numeric types, boolean type, and vector type. In each row, the values of the input columns will be concatenated into a vector in the specified order.</p> 

#### Examples
<p>Assume that we have a DataFrame with the columns id, hour, mobile, userFeatures, and clicked:</p> 
<pre><code> id | hour | mobile | userFeatures     | clicked
----|------|--------|------------------|---------
 0  | 18   | 1.0    | [0.0, 10.0, 0.5] | 1.0
</code></pre>

<p align="justify">UserFeatures is a vector column that contains three user features. We want to combine hour, mobile, and userFeatures into a single feature vector called features and use it to predict clicked or not. If we set VectorAssembler’s input columns to hour, mobile, and userFeatures and output column to features, after transformation we should get the following DataFrame:</p> 

<pre><code> id | hour | mobile | userFeatures     | clicked | features
----|------|--------|------------------|---------|-----------------------------
 0  | 18   | 1.0    | [0.0, 10.0, 0.5] | 1.0     | [18.0, 1.0, 0.0, 10.0, 0.5]
</code></pre>

### RootMeanSquareError
<p align="justify">The Mean Squared Error (MSE) is a measure of how close a fitted line is to data points. For every data point, you take the distance vertically from the point to the corresponding y value on the curve fit (the error), and square the value. Then you add up all those values for all data points, and, in the case of a fit with two parameters such as a linear fit, divide by the number of points minus two. The squaring is done so negative values do not cancel positive values. The smaller the Mean Squared Error, the closer the fit is to the data. The MSE has the units squared of whatever is plotted on the vertical axis.</p> 

<p align="justify">Another quantity that we calculate is the Root Mean Squared Error (RMSE). It is just the square root of the mean square error. That is probably the most easily interpreted statistic, since it has the same units as the quantity plotted on the vertical axis.</p>

<a name = "Tarea3u2"> <h2>Homework 3</h2> </a>
<h3>Investigate Pipeline, Matriz of confusion</h3>

### Pipeline in Machine Learning

<p align="justify">A machine learning pipeline is used to help automate machine learning workflows. They operate by enabling a sequence of data to be transformed and correlated together in a model that can be tested and evaluated to achieve an outcome, whether positive or negative.
Machine learning (ML) pipelines consist of several steps to train a model. Machine learning pipelines are iterative as every step is repeated to continuously improve the accuracy of the model and achieve a successful algorithm.</p>

<p align="center"><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/Pipiline1.png"></p>
<p align="justify">It’s not just about storing data any longer, but capturing, preserving, accessing and transforming it to take advantage of its possibilities and the value it can deliver.</p>

* The main objective of having a proper pipeline for any ML model is to exercise control over it. A well-organised pipeline makes the implementation more flexible.

* The main objective of having a proper pipeline for any ML model is to exercise control over it. A well-organised pipeline makes the implementation more flexible.
* The learning algorithm finds patterns in the training data that map the input data attributes to the target
* model can have many dependencies and to store all the components to make sure all features available both offline and online for deployment
* A pipeline consists of a sequence of components which are a compilation of computations.

### Challenges Associated with ML Pipelines

<p align="justify" > A typical machine learning pipeline would consist of the following processes:</p>

* Data collection
* Data cleaning
* Feature extraction (labelling and dimensionality reduction)
* Model validation
* Visualisation
<p align="center"><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/pipeline2.png"></p>
<p align="justify"> Data collection and cleaning are the primary tasks of any machine learning engineer who wants to make meaning out of data. But getting data and especially getting the right data is an uphill task in itself.
Data quality and its accessibility are two main challenges one will come across in the initial stages of building a pipeline.
The captured data should be pulled and put together and the benefits of collection should outweigh the costs of collection and analysis. </p>

### Confusion matrix

<p  align="justify" >In the field of machine learning and specifically the problem of statistical classification, a confusion matrix, also known as an error matrix, is a specific table layout that allows visualization of the performance of an algorithm, typically a supervised learning one (in unsupervised learning it is usually called a matching matrix). Each row of the matrix represents the instances in a predicted class while each column represents the instances in an actual class (or vice versa). </p>

### Example

<p align="justify" > If a classification system has been trained to distinguish between cats and dogs, a confusion matrix will summarize the results of testing the algorithm for further inspection. Assuming a sample of 13 animals — 8 cats and 5 dogs — the resulting confusion matrix could look like the table below:</p>

<p align="center"><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/table1.JPG"></p>\

<p align="justify" >In this confusion matrix, of the 8 actual cats, the system predicted that three were dogs, and of the five dogs, it predicted that two were cats. All correct predictions are located in the diagonal of the table (highlighted in bold), so it is easy to visually inspect the table for prediction errors, as they will be represented by values outside the diagonal.

In abstract terms, the confusion matrix is as follows: </p>

<p align="center"><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/tabla2.JPG"></p>

<p align="justify"  > where: P = positive; N = Negative; TP = True Positive; FP = False Positive; TN = True Negative; FN = False Negative. </p>














<h1>Practices</h1>

<a name = "Practica1u2"> <h2>Practice 1 Linear Regression</h2> </a>
<h3>Instructions</h3>
<h3>Description</h3>
<p align="justify">In statistics, linear regression is a linear approach to modeling the relationship between a scalar response (or dependent variable) and one or more explanatory variables (or independent variables). The case of one explanatory variable is called simple linear regression. For more than one explanatory variable, the process is called multiple linear regression. This term is distinct from multivariate linear regression, where multiple correlated dependent variables are predicted, rather than a single scalar variable.</p>

<img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/330px-Linear_regression.svg.png">

Linear regression has many practical uses. Most applications fall into one of the following two broad categories:

* If the goal is prediction, forecasting, or error reduction,[clarification needed] linear regression can be used to fit a predictive model to an observed data set of values of the response and explanatory variables. After developing such a model, if additional values of the explanatory variables are collected without an accompanying response value, the fitted model can be used to make a prediction of the response.
* If the goal is to explain variation in the response variable that can be attributed to variation in the explanatory variables, linear regression analysis can be applied to quantify the strength of the relationship between the response and the explanatory variables, and in particular to determine whether some explanatory variables may have no linear relationship with the response at all, or to identify which subsets of explanatory variables may contain redundant information about the response.


<h3>Code</h3>

```scala
import org.apache.spark.ml.regression.LinearRegression

// Load training data
val training = spark.read.format("libsvm")
  .load("data/mllib/sample_linear_regression_data.txt")

val lr = new LinearRegression()
  .setMaxIter(10)
  .setRegParam(0.3)
  .setElasticNetParam(0.8)

// Fit the model
val lrModel = lr.fit(training)

// Print the coefficients and intercept for linear regression
println(s"Coefficients: ${lrModel.coefficients} Intercept: ${lrModel.intercept}")

// Summarize the model over the training set and print out some metrics
val trainingSummary = lrModel.summary
println(s"numIterations: ${trainingSummary.totalIterations}")
println(s"objectiveHistory: [${trainingSummary.objectiveHistory.mkString(",")}]")
trainingSummary.residuals.show()
println(s"RMSE: ${trainingSummary.rootMeanSquaredError}")
println(s"r2: ${trainingSummary.r2}")


```

<a name = "Practica2u2"><h2> Practice 2 Logistic Regression</h2></a>
<h3>Instructions</h3>
<p align="justify">Describe and check the instructions necessary to perform a logistic regression</p>
<h3>Description</h3>
<p align="justify">In this project we will be working with a fake advertising data set, indicating whether or not a particular internet user clicked on an Advertisement. We will try to create a model that will predict whether or not they will click on an ad based off the features of that user.
<br><br>This data set contains the following features:</p>

* 'Daily Time Spent on Site': consumer time on site in minutes
* 'Age': cutomer age in years
* 'Area Income': Avg. Income of geographical area of consumer
* 'Daily Internet Usage': Avg. minutes a day consumer is on the internet
* 'Ad Topic Line': Headline of the advertisement
* 'City': City of consumer
* 'Male': Whether or not consumer was male
* 'Country': Country of consumer
* 'Timestamp': Time at which consumer clicked on Ad or closed window
* 'Clicked on Ad': 0 or 1 indicated clicking on Ad

<h3>Code</h3>

```scala

// Take the data

// Import a SparkSession with the Logistic Regression library
import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.sql.SparkSession

// Optional: Use the Error reporting code
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)

// Create a Spark session
val spark = SparkSession.builder().getOrCreate()

// Use Spark to read the csv Advertising file
val data  = spark.read.option("header","true").option("inferSchema", "true").format("csv").load("advertising.csv")

// Print the Schema of the DataFrame
data.printSchema()


// Display the data

// Print an example line
data.head(1)

val colnames = data.columns
val firstrow = data.head(1)(0)
println("\n")
println("Example data row")
for(ind <- Range(1, colnames.length)){
    println(colnames(ind))
    println(firstrow(ind))
    println("\n")
}


// Prepare the DataFrame for Machine Learning

// Create a new column called "Hour" of the Timestamp containing "Hour of the click"
val timedata = data.withColumn("Hour",hour(data("Timestamp")))

// Rename the column "Clicked on Ad" to "label"
// Take the following columns as features "Daily Time Spent on Site", "Age", "Area Income", "Daily Internet Usage", "Hour", "Male"
val logregdata = timedata.select(data("Clicked on Ad").as("label"), $"Daily Time Spent on Site", $"Age", $"Area Income", $"Daily Internet Usage", $"Hour", $"Male")

// Import VectorAssembler and Vectors
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors

// Create a new VectorAssembler object called assembler for the features
val assembler = (new VectorAssembler()
                  .setInputCols(Array("Daily Time Spent on Site", "Age","Area Income","Daily Internet Usage","Hour","Male"))
                  .setOutputCol("features"))

// Use randomSplit to create train and test data divided by 70/30
val Array(training, test) = logregdata.randomSplit(Array(0.7, 0.3), seed = 12345)


//Set up a Pipeline

// Import Pipeline
import org.apache.spark.ml.Pipeline

// Create a new LogisticRegression object called lr
val lr = new LogisticRegression()

// Create a new pipeline with the elements: assembler, lr
val pipeline = new Pipeline().setStages(Array(assembler, lr))

// Adjust (fit) the pipeline for the training set
val model = pipeline.fit(training)

// Take the Results in the Test set with transform
val results = model.transform(test)


// Model evaluation

// For Metrics and Evaluation import MulticlassMetrics
import org.apache.spark.mllib.evaluation.MulticlassMetrics

// Convert test results to RDD using .as and .rdd
val predictionAndLabels = results.select($"prediction",$"label").as[(Double, Double)].rdd

// Initialize a MulticlassMetrics object
val metrics = new MulticlassMetrics(predictionAndLabels)

// Print the Confusion Matrix
println("Confusion matrix:")
println(metrics.confusionMatrix)

// Print the model Accuracy value
metrics.accuracy


```


<a name = "Practica3u2"><h2> Practice 3 Decision tree classifier</h2></a>
<h3>Description</h3>
<p align="justify">A decision tree is a diagram or chart that people use to determine a course of action or show a statistical probability. A decision tree is a graphical depiction of a decision and every potential outcome or result of making that decision. Individuals deploy decision trees in a variety of situations, from something simple and personal ("Should I go out for dinner?") to more complex industrial, scientific or microeconomic undertakings.</p>

<img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/decision%20tree.png" alt="Title" width="50%">



####  How does the Decision Tree algorithm work?
The basic idea behind any decision tree algorithm is as follows:

Select the best attribute using Attribute Selection Measures(ASM) to split the records.
Make that attribute a decision node and breaks the dataset into smaller subsets.
Starts tree building by repeating this process recursively for each child until one of the condition will match:
All the tuples belong to the same attribute value.
There are no more remaining attributes.
There are no more instances.

<h3>Code</h3>

```scala
import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.classification.DecisionTreeClassificationModel
import org.apache.spark.ml.classification.DecisionTreeClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorIndexer}

// Load the data stored in LIBSVM format as a DataFrame.
val data = spark.read.format("libsvm").load("data/mllib/sample_libsvm_data.txt")

// Index labels, adding metadata to the label column.

val labelIndexer = new StringIndexer().setInputCol("label").setOutputCol("indexedLabel").fit(data)
// Automatically identify categorical features, and index them.
val featureIndexer = new VectorIndexer().setInputCol("features").setOutputCol("indexedFeatures").setMaxCategories(4).fit(data)

// Split the data into training and test sets (30% held out for testing).
val Array(trainingData, testData) = data.randomSplit(Array(0.7, 0.3))

// Train a DecisionTree model.
val dt = new DecisionTreeClassifier().setLabelCol("indexedLabel").setFeaturesCol("indexedFeatures")

// Convert indexed labels back to original labels.
val labelConverter = new IndexToString().setInputCol("prediction").setOutputCol("predictedLabel").setLabels(labelIndexer.labels)

// Chain indexers and tree in a Pipeline.
val pipeline = new Pipeline().setStages(Array(labelIndexer, featureIndexer, dt, labelConverter))

// Train model. This also runs the indexers.
val model = pipeline.fit(trainingData)

// Make predictions.
val predictions = model.transform(testData)

// Select example rows to display.
predictions.select("predictedLabel", "label", "features").show(5)

// Select (prediction, true label) and compute test error.
val evaluator = new MulticlassClassificationEvaluator().setLabelCol("indexedLabel").setPredictionCol("prediction").setMetricName("accuracy")
val accuracy = evaluator.evaluate(predictions)
println(s"Test Error = ${(1.0 - accuracy)}")

val treeModel = model.stages(2).asInstanceOf[DecisionTreeClassificationModel]
println(s"Learned classification tree model:\n ${treeModel.toDebugString}")

```


<a name = "Practica4u2"><h2> Practice 4 Random forest classifier</h2></a>
<h3>Description</h3>

#### Random forest classifier was presented by team 2

<p align="justify">In the Random Forest Classifier, multiple decision tree algorithms are run instead of just one. To rank a new attribute-based object, each decision tree gives a ranking, and ultimately the decision with the most "votes" is the algorithm's prediction. For regression, the average of the outputs (predictions) of all the trees is taken.</p>

<img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/rfc1.png" alt="Title" width="50%">

<p align="justify">Random Forest is a versatile machine learning method capable of performing both regression and classification tasks. It also performs dimensional reduction methods, addresses missing values, outliers, and other essential data exploration steps. It is a type of ensemble learning method, where a group of weak models combine to form a powerful model.</p>

#### How does Random Forest Classifier work?

First, the data for the different trees is divided:
* The sampling process of the data with replacement is called bootstrap.
* One third of the data is not used for training and can be used for testing.
* This set is called out of bag (OOB) samples.

<img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/traningandtest.PNG" 
alt="Title" width="70%">
<br>

* After dividing the data, the decision trees are created using the previously divided data, the bootstraps (Training set) with their OOB (Test set) until each tree returns a result.
* After the results of each tree are converted into one vote, by having several equal votes from different trees we will have our prediction.

<img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/diagram.PNG" 
alt="Title" width="70%">

<h3>Code</h3>

```scala

//Random forest classifier
// $example on$
import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.classification.{RandomForestClassificationModel, RandomForestClassifier}
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorIndexer}
// $example off$
import org.apache.spark.sql.SparkSession


  def main(): Unit = {
    val spark = SparkSession.builder.appName("RandomForestClassifierExample").getOrCreate()

    // $example on$
  
    // Load and parse the data file, converting it to a DataFrame.
    val data = spark.read.format("libsvm").load("./sample_libsvm_data.txt")

    // Index labels, adding metadata to the label column.
    // Fit on whole dataset to include all labels in index.
    val labelIndexer = new StringIndexer().setInputCol("label").setOutputCol("indexedLabel").fit(data)
    
    // Automatically identify categorical features, and index them.
    // Set maxCategories so features with > 4 distinct values are treated as continuous.
    val featureIndexer = new VectorIndexer().setInputCol("features").setOutputCol("indexedFeatures").setMaxCategories(4).fit(data)
    
    // Split the data into training and test sets (30% held out for testing).
    val Array(trainingData, testData) = data.randomSplit(Array(0.7, 0.3))

    // Train a RandomForest model.
    val rf = new RandomForestClassifier().setLabelCol("indexedLabel").setFeaturesCol("indexedFeatures").setNumTrees(10)

    // Convert indexed labels back to original labels.
    val labelConverter = new IndexToString().setInputCol("prediction").setOutputCol("predictedLabel").setLabels(labelIndexer.labels)
    
    // Chain indexers and forest in a Pipeline.
    val pipeline = new Pipeline().setStages(Array(labelIndexer, featureIndexer, rf, labelConverter))

    // Train model. This also runs the indexers.
    val model = pipeline.fit(trainingData)

    // Make predictions.
    val predictions = model.transform(testData)

    // Select example rows to display.
    predictions.select("predictedLabel", "label", "features").show(5)

    //Select (prediction, true label) and compute test error.
    val evaluator = new MulticlassClassificationEvaluator().setLabelCol("indexedLabel").setPredictionCol("prediction").setMetricName("accuracy")
    val accuracy = evaluator.evaluate(predictions)
    println(s"Test Error = ${(1.0 - accuracy)}")

    val rfModel = model.stages(2).asInstanceOf[RandomForestClassificationModel]
    println(s"Learned classification forest model:\n ${rfModel.toDebugString}")
    // $example off$

    spark.stop()
  }
main()


```


<a name = "Practica5u2"><h2> Practice 5 Gradient-boosted tree classifier</h2></a>
<h3>Description</h3>
Gradient boosting classifiers are a group of machine learning algorithms that combine many weak learning models together to create a strong predictive model. Decision trees are usually used when doing gradient boosting. Gradient boosting models are becoming popular because of their effectiveness at classifying complex datasets, and have recently been used to win many Kaggle data science competitions.</p>

<img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/practica%20%235.png" alt="Title" width="50%">

In order to implement a gradient boosting classifier, we'll need to carry out a number of different steps. We'll need to:

* Fit the model
* Tune the model's parameters and Hyperparameters
* Make predictions
* Interpret the results

<img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/gradient-boosting-classifiers-in-python-with-scikit-learn-4.png" alt="Title" width="50%">








<h3>Code</h3>

```scala
import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.classification.{GBTClassificationModel, GBTClassifier}
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorIndexer}

// Load and parse the data file, converting it to a DataFrame.
val data = spark.read.format("libsvm").load("data/mllib/sample_libsvm_data.txt")

// Index labels, adding metadata to the label column.
// Fit on whole dataset to include all labels in index.
val labelIndexer = new StringIndexer().setInputCol("label").setOutputCol("indexedLabel").fit(data)
// Automatically identify categorical features, and index them.
// Set maxCategories so features with > 4 distinct values are treated as continuous.
val featureIndexer = new VectorIndexer().setInputCol("features").setOutputCol("indexedFeatures").setMaxCategories(4).fit(data)

// Split the data into training and test sets (30% held out for testing).
val Array(trainingData, testData) = data.randomSplit(Array(0.7, 0.3))

// Train a GBT model.
val gbt = new GBTClassifier().setLabelCol("indexedLabel").setFeaturesCol("indexedFeatures").setMaxIter(10).setFeatureSubsetStrategy("auto")

// Convert indexed labels back to original labels.
val labelConverter = new IndexToString().setInputCol("prediction").setOutputCol("predictedLabel").setLabels(labelIndexer.labels)

// Chain indexers and GBT in a Pipeline.
val pipeline = new Pipeline().setStages(Array(labelIndexer, featureIndexer, gbt, labelConverter))

// Train model. This also runs the indexers.
val model = pipeline.fit(trainingData)

// Make predictions.
val predictions = model.transform(testData)

// Select example rows to display.
predictions.select("predictedLabel", "label", "features").show(5)

// Select (prediction, true label) and compute test error.
val evaluator = new MulticlassClassificationEvaluator().setLabelCol("indexedLabel").setPredictionCol("prediction").setMetricName("accuracy")
val accuracy = evaluator.evaluate(predictions)
println(s"Test Error = ${1.0 - accuracy}")

val gbtModel = model.stages(2).asInstanceOf[GBTClassificationModel]
println(s"Learned classification GBT model:\n ${gbtModel.toDebugString}")



```


<a name = "Practica6u2"><h2> Practice 6 Multilayer perceptron classifier</h2></a>
<h3>Description</h3>

#### Multilayer perceptron classifier was presented by team 4

<p align="justify">MLPs are forward-directed networks with one or more node layers between the input nodes and the output nodes (Hidden). Each neuron is a perceptron type. Each layer is fully connected to the next layer in the network.</p>

* Perceptron: Artificial neuron or basic unit of inference in the form of a linear discriminator, from which an algorithm is developed capable of generating a criterion to select a sub-group from a larger group of components.

<img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/perceptron.png" alt="Title" width="50%">

#### LAYERS

Layers can be classified into three types:

* Input layer: Made up of those neurons that introduce input patterns into the network. No processing occurs in these neurons.
* Hidden Layers: Formed by those neurons whose inputs come from previous layers and whose outputs pass to neurons from later layers.
* Output layer: Neurons whose output values ​​correspond to the outputs of the entire network.

<img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/RedNeuronal.png" alt="Title" width="50%">

#### CHARACTERISTICS

* An MLP consists of at least three node layers.
* MLP uses a supervised learning technique called backpropagation for training.
* You can distinguish data that is not linearly separable.
* It is one of the architectures most used to solve real problems.
* It tends to work best with deeper architectures and larger networks.


<h3>Code</h3>

```scala

package org.apache.spark.examples.ml

// Step 1: Import libraries and package
import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.sql.SparkSession
 
object MultilayerPerceptronClassifierExample
 {

// Step 2: create a Spark session
// Where the class is as follows:

    def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.appName("MultilayerPerceptronClassifierExample").getOrCreate()

// Step 3: load and analyze the dataset
// Load the stored data in LIBSVM format as a DataFrame.

val data = spark.read.format("libsvm").load("/usr/local/spark-2.3.4-bin-hadoop2.6/data/mllib/sample_multiclass_classification_data.txt")

// Step 4: Split the data into train and test
// Prepare the train and the test set: training => 60%, test => 40% and seed => 12345

    val splits = data.randomSplit(Array(0.6, 0.4), seed = 1234L)
    val train = splits(0)
    val test = splits(1)
 
// Step 5: specify the layers for the neural network    
 
    val layers = Array[Int](4, 5, 4, 3)

// Step 6: create the MultilayerPerceptronClassifier trainer and set its parameters
    
    val trainer = new MultilayerPerceptronClassifier().setLayers(layers).setBlockSize(128).setSeed(1234L).setMaxIter(100)
    
// Step 7: Train the multilayer perceptron classification model 

    val model = trainer.fit(train)
    
// Step 8: calculate the accuracy on the test set

    val result = model.transform(test)
    val predictionAndLabels = result.select("prediction", "label")
    
// Step 9: evaluate the model for prediction performance
    val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")
    

// Step 10 Print result
    println(s"Test set accuracy = ${evaluator.evaluate(predictionAndLabels)}")

    spark.stop()
  }
}


```


<a name = "Practica7u2"><h2> Practice 7 Linear Support Vector Machine</h2></a>
<h3>Description</h3>
<p align="justify">A support vector machine constructs a hyperplane or set of hyperplanes in a high- or infinite-dimensional space, which can be used for classification, regression, or other tasks. Intuitively, a good separation is achieved by the hyperplane that has the largest distance to the nearest training-data points of any class (so-called functional margin), since in general the larger the margin the lower the generalization error of the classifier. LinearSVC in Spark ML supports binary classification with linear SVM. Internally, it optimizes the Hinge Loss using OWLQN optimizer.</p>

<img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/300px-SVM_margin.png" alt="Title" width="50%">


<h3>Code</h3>

```scala

import org.apache.spark.ml.classification.LinearSVC

// Load training data
val training = spark.read.format("libsvm").load("data/mllib/sample_libsvm_data.txt")

val lsvc = new LinearSVC().setMaxIter(10).setRegParam(0.1)

// Fit the model
val lsvcModel = lsvc.fit(training)

// Print the coefficients and intercept for linear svc
println(s"Coefficients: ${lsvcModel.coefficients} Intercept: ${lsvcModel.intercept}")
```


<a name = "Practica8u2"><h2> Practice 8 One-vs-Rest classifier</h2></a>
<h3>Description</h3>

#### One-vs-Rest classifier was presented by team 6

<p align="justify">OneVsRest is an example of a machine learning reduction to perform a multiclass classification given a base classifier that can efficiently perform binary classification. It is also known as "One against all".</p>

<p align="justify">OneVsRest is implemented as an Estimator. For the base classifier, take Instances of Classifier and create a binary classification problem for each of the k classes. The classifier for class i is trained to predict whether the label is i or not, distinguishing class i from all other classes. Predictions are made by evaluating each binary classifier and the index of the safest classifier is generated as a label.</p>

<h3>Code</h3>

```scala

// All necessary libraries are imported
import org.apache.spark.ml.classification.{LogisticRegression, OneVsRest}
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator

// Load the data into the variable "inputData" in a "libsvm" format
val inputData = spark.read.format("libsvm").load("data/mllib/sample_multiclass_classification_data.txt")

// Information is divided into training data and test data
val Array(train, test) = inputData.randomSplit(Array(0.8, 0.2))

// The variable "classifier" is declared that will do the regression
val classifier = new LogisticRegression().setMaxIter(10).setTol(1E-6).setFitIntercept(true)

// Model "OneVsRest" is declared
val ovr = new OneVsRest().setClassifier(classifier)

// Model is trained with training data
val ovrModel = ovr.fit(train)

// Predictions are made with test data
val predictions = ovrModel.transform(test)

//The evaluator is declared to take the precision of the model and save it in a metric variable called "accuracy"
val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")

// Calculate the model error with a simple subtraction
val accuracy = evaluator.evaluate(predictions)

// Print test error
println(s"Test Error = ${1 - accuracy}")


```


<a name = "Practica9u2"><h2> Practice 9 Naive Bayes</h2></a>
<h3>Description</h3>
<p align="justify">Naive Bayes classifiers are a family of simple probabilistic, multiclass classifiers based on applying Bayes’ theorem with strong (naive) independence assumptions between every pair of features.

Naive Bayes can be trained very efficiently. With a single pass over the training data, it computes the conditional probability distribution of each feature given each label. For prediction, it applies Bayes’ theorem to compute the conditional probability distribution of each label given an observation.

MLlib supports both multinomial naive Bayes and Bernoulli naive Bayes.

Input data: These models are typically used for document classification. Within that context, each observation is a document and each feature represents a term. A feature’s value is the frequency of the term (in multinomial Naive Bayes) or a zero or one indicating whether the term was found in the document (in Bernoulli Naive Bayes). Feature values must be non-negative. The model type is selected with an optional parameter “multinomial” or “bernoulli” with “multinomial” as the default. For document classification, the input feature vectors should usually be sparse vectors. Since the training data is only used once, it is not necessary to cache it.

Additive smoothing can be used by setting the parameter λ (default to 1.01.0).</p>

<img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/1_39U1Ln3tSdFqsfQy6ndxOA.png" width="50%">



<h3>Code</h3>

```scala
import org.apache.spark.ml.classification.NaiveBayes
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator

// Load the data stored in LIBSVM format as a DataFrame.
val data = spark.read.format("libsvm").load("sample_libsvm_data.txt")

// Split the data into training and test sets (30% held out for testing)
val Array(trainingData, testData) = data.randomSplit(Array(0.7, 0.3), seed = 1234L)

// Train a NaiveBayes model.
val model = new NaiveBayes().fit(trainingData)

// Select example rows to display.
val predictions = model.transform(testData)
predictions.show()

// Select (prediction, true label) and compute test error
val evaluator = new MulticlassClassificationEvaluator().setLabelCol("label").setPredictionCol("prediction").setMetricName("accuracy")
val accuracy = evaluator.evaluate(predictions)
println(s"Test set accuracy = $accuracy")


```


<h1>Tests</h1>

<a name = "Examen1u2"><h2> Test 1</h2></a>
<h3>Instructions</h3>
<p align="justify">Develop the following instructions in Spark with the Scala programming language,
using only Spark Machine Learning Mllib library documentation, uses the Machine Learning algorithm called
multilayer perceptron</p>
<h3>Description</h3>
<p align="justify">This is the test performed in unit 2, using the Iris.csv dataset with the multilayer perceptron algorithm for classification, in this case the multilayer perceptron algorithm helps us classify and predict according to the characteristics of iris flowers which type of species belongs</p>
<h3>Code</h3>

```scala

// Unit 2 Test
// Barraza Sierra Alexis Fernando
// Zamorano Garcia Osvaldo Arturo

// MLlib libraries necessary to classify with Multilayer Perceptron are imported
import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.feature.{VectorAssembler, StringIndexer}
import org.apache.spark.ml.linalg.Vectors

// Point 1 Data cleaning necessary to be processed with the multilayer perceptron algorithm
// Dataset Iris.cvs, recovered in https://github.com/jcromerohdz/iris  

// Here the data from the iris.csv dataset is loaded into the variable "data"
val data = spark.read.option("header","true").option("inferSchema", "true").format("csv").load("iris.csv")

// Null fields are removed
val dataClean = data.na.drop()

// Point 2 column names are shown
dataClean.columns 

// Point 3 the schematic of the data is printed
dataClean.printSchema()

// Point 4 prints the first 5 columns
dataClean.show(5)
dataClean.select($"sepal_length",$"sepal_width",$"petal_length",$"petal_width",$"species").show(5)

// Point 5 method describes
dataClean.describe().show()

// Point 6 relevant transformation for the categorical data which will be our labels to classify.
// A vector is declared that will transform the data to the variable "features"
val vectorFeatures = (new VectorAssembler().setInputCols(Array("sepal_length","sepal_width", "petal_length","petal_width")).setOutputCol("features"))

// Features are transformed using the dataframe
val features = vectorFeatures.transform(dataClean)

// A "StringIndexer" is declared that transforms the data in "species" into numerical data
val speciesIndexer = new StringIndexer().setInputCol("species").setOutputCol("label")

// We adjust the indexed species with the vector features
val dataIndexed = speciesIndexer.fit(features).transform(features)

// Point 7 Build the classification models and explain your architecture.

// With the variable "splits" we make a cut randomly
val splits = dataIndexed.randomSplit(Array(0.6, 0.4), seed = 1234L)

// The variable "train" is declared which will have 60% of the data
val train = splits(0)

// The variable "test" is declared which will have 40% of the data
val test = splits(1)

// The configuration of the layers for the artificial neural network model is established
// Input: 4 (features)
// the two Intermediates 5 and 4 respectively
// Output 3, having 3 types of classes
val layers = Array[Int](4, 5, 4, 3)

// The Multilayer algorithm trainer is configured with their respective parameters
val trainer = new MultilayerPerceptronClassifier().setLayers(layers).setBlockSize(128).setSeed(1234L).setMaxIter(100)

// Model is trained with training data
val model = trainer.fit(train)

// They are tested already trained the model
val result = model.transform(test)

// Point 8 Print the model results
// Select the prediction and the label that will be stored in the variable
val predictionAndLabels = result.select("prediction", "label")

// Some prediction data is shown against the real ones to see results
predictionAndLabels.show(50)
result.show(30)

// Model precision estimation runs
val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")
println(s"Accuracy test = ${evaluator.evaluate(predictionAndLabels)}")



```
