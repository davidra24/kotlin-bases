package expresiones

fun main() {
    //En kotlin todo es una expresión
    //Siempre se devuelve un valor
    //La expresión se define como el cunjunto de variables y expresiones que devuelven un valor
    //${} => colocar una expresión
    //$ => colocar un valor

    var x = 5
    println("x es igual a 5? ${x==5}")
    val mensaje = "El valor de x es $x"
    x++
    println("${mensaje.replace("es", "fue")}, es es igual a: $x")

    println("Raiz cuadrada de: ${Math.sqrt(4.0)}")

    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    fun averageNumber(numbers:IntArray, n: Int): Int{
        return (numbers.sum() / numbers.size) + n
    }

    println("El promedio es: ${averageNumber(numbers, 2)}")

}