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
// La funcion (slice) nos permite impirmir datos de una variable, dando sus coordenadas de lo que queremos extraer

    var variable = "Hola Luke soy tu padre!"
    variable.slice(5,9)
    


//5. What is the difference of a value and a variable in scala?.
// Answer: Value (val) is a type of variable that when assigned a value cannot be changed, and a variable (var)
// you can change its value at any time.

//6. Given the tuple (2,4,5,1,2,3,3,1416,23) return the number 3.1416.

    var x = (2,4,5,1,2,3,3.1416,23)
    println(x._7)
