// Practica 1
// Por: Zamorano Garcia Osvaldo Arturo


//1. Desarrollar un algoritmo en scala que calcule el radio de un circulo
def radiocirculo(){
print("Ingrese la circunferencia del circulo: ")
var circunferencia:Double = scala.io.StdIn.readLine.toDouble
var radio: Double=(circunferencia/(2*3.1416))
println("\n\nel radio del circulo es "+radio)
}

//2. Desarrollar un algoritmo en scala que me diga si un numero es primo
def esprimo(num:Int):Boolean={
if(num <= 1)
return false
else if(num==2)
return true
else{
    var i:Int=0
    var raiz:Int=math.sqrt(num: Double).toInt
for (i <- 2 to raiz){
    if (num % i == 0){
        return false;
   }
}
return true;
}
}
def numprimo(){
    println("Ingresa un numero")
    var num:Int=scala.io.StdIn.readLine.toInt
    val resultado=esprimo(num)
    if (resultado == true){
        println(s"El numero $num SI es primo")
    }
    else{
        println(s"El numero $num NO es primo")
    }
}

//3. Dada la variable bird = "tweet", utiliza interpolacion de string para imprimir "Estoy ecribiendo un tweet"

def interpolada(){
    var bird="tweet"
    println(s"Estoy ecribiendo un $bird")
}

//4. Dada la variable mensaje = "Hola Luke yo soy tu padre!" utiliza slilce para extraer la secuencia "Luke"
// La funcion (slice) nos permite impirmir datos de una variable, dando sus coordenadas de lo que queremos extraer
def slice(){
    var variable = "Hola Luke soy tu padre!"
    var res=variable.slice(5,9)
    println(res)
}

//5. Cual es la diferencia en value y una variable en scala?
// Respuesta: Value(val) es un tipo de variable que al ser asignado un valor no puede ser cambiado, y una variable(var)
// puede cambiar su valor en cualquier momento.

//6. Dada la tupla (2,4,5,1,2,3,3.1416,23) regresa el numero 3.1416
def partetupla(){
    var x = (2,4,5,1,2,3,3.1416,23)
    println(x._7)
}

radiocirculo()
numprimo()
interpolada()
slice()
partetupla()