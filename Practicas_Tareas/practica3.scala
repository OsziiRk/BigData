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

