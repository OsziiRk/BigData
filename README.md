
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

<h1>Practices</h1>
<h3>Practice 1</h3>
<h4>Instructions</h4>
<ol>
<li>Develop an algorithm in scala that calculates the radius of a circle.
<li>Develop an algorithm in scala that tells me if a number is a prime number.
<li>Given the variable bird = "tweet", use string interpolation to print "I am writing a tweet".
<li>Given the variable message = "Hola Luke soy tu padre!" use slilce to extract the sequence "Luke".
<li>What is the difference of a value and a variable in scala?.
<li>Given the tuple (2,4,5,1,2,3,3.1416,23) return the number 3.1416.
</ol>
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


<h3>Practice 2</h3>
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

<h3>Practice 3</h3>
<h4>Instructions</h4>
<ol>
<ul>Develop the 5 algorithms of the Fibonacci sequence.
</ol>
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



```



