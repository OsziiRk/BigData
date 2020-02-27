//Examen 1
//Zamorano Garcia Osvaldo Arturo
//Barraza Sierra Alexis Fernando

val arre = ((11,2,4),(4,5,6),(10,8,-12))


def difabs(arre:((Int, Int, Int), (Int, Int, Int), (Int, Int, Int))): Int = {
    val diagonl_1 =(arre._1._1)+(arre._2._2)+(arre._3._3)
    val diagonl_2 =(arre._1._3)+(arre._2._2)+(arre._3._1)
    var diferencia = diagonl_1-diagonl_2
    var resul= math.abs(diferencia)
    return resul
}

difabs(arre)
