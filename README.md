
<h1>BigData - Unit 1</h1>
<p align="center">
<br><strong>Tecnológico Nacional de México</strong>
<br><strong>Instituto Tecnológico de Tijuana</strong>
<br><strong>Subdirección académica</strong>
<br><strong>Departamento de Sistemas y Computación</strong>
<br><strong>Semestre: ENERO - JUNIO 2020</strong>
<br><strong>Ingeniería en Tecnologías de la Información y Comunicaciones</strong>
<br><strong>Materia: Datos Masivos</strong>
<br><strong>Unidad: 1</strong>
<br><strong>Zamorano Garcia Osvaldo Arturo 15211707</strong>
<br><strong>Barraza Sierra Alexis Fernando 16212532</strong>
<br><strong>Docente: Dr. Jose Christian Romero Hernandez</strong>
</p>

<h1>Indice</h1>
<ol>
<li><a href = "#Practica1" target="_self"> Practice 1 </a>
<li><a href = "#Practica2" target="_self"> Practice 2 </a>
<li><a href = "#Practica3" target="_self"> Practice 3 </a>
<li><a href = "#Practica4" target="_self"> Practice 4 </a>
<li><a href = "#Practica5" target="_self"> Practice 5 </a>
<li><a href = "#Tarea1" target="_self"> Homework #1 </a>
<li><a href = "#Tarea2" target="_self"> Homework #2 </a>
<li><a href = "#Examen1" target="_self"> Test 1 </a>
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


<p align="justify">TThe variance or variance is a measure of the dispersion of a random variable (values that are required randomly). The variability of said dispersion is specifically specific in the area of express statistics.
The variance of a sample or a set of values is the sum of the squared deviations from the average or the average, all this divided by the total number of observations minus 1. In a very general way it can be said that the variance is the standard deviation squared.</p>
    
<p align="justify">The variance, together with the standard deviation, are measures of data dispersion or observations. The dispersion of these data indicates the variety that they present, that is, if all the values in a set of data are equal, then there is no dispersion, but instead, if not all are equal then there is dispersion.</p>

<p align="justify">This dispersion can be large or small, depending on how close the average values are. he variance of a sample is symbolized as S2, while the variance of a population symbolizes as σ2. he variance of a sample is used to estimate the variance of a population, which is often unknown. This is why S2 is also commonly considered as a statistic and σ2 as a parameter.

The variance of a sample has the following formula:

Where, represents the sum of the subtraction between each of the sampled values () and the mean (), squared.

In turn, it represents the total number of observations or sampled data. For very large values the variance is minimal or even negligible.

</p>
<p align="center"><img src="https://raw.githubusercontent.com/OsziiRk/Recursos_Bigdata/master/formulavariance.jpg" style="max-width:100%;"></p>
<br>

<h1>Tests</h1>
<a name = "Examen1"> <h3>Test 1</h3> </a>
<h2>Instructions:</h2>
<p>Develop a function called diagonal DIfference in a script with the programming language scala. It must return an integer that represents the difference of the absolute diagonal.</p>
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

