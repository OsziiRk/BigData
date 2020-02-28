//Examen 1
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

