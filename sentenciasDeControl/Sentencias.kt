package sentenciasDeControl

fun main() {
    //If
    val numero = 7
    if(numero.equals(2)){
        println("Es dos")
    }else{
        println("No es dos")
    }
    //when => switch case

    when(numero){
        in 1..4 -> println("Sí está en el rango 1 y 4")
        in 1..6 -> println("Está enttre 1 y 6")
        !in 5..10 -> println("No está entre 5 & 10")
        else -> println("No está en ningun rango")
    }



}