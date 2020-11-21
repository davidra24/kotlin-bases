package arrays

fun main() {
    val countries = arrayOf("India", "Mexico", "Colombia", "Argentina", "Chile", "Peru")
    val days = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes")
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    var suma = 0
    for (num in numbers){
        suma = suma.plus(num)
    }
    println("El promedio es: ${suma/numbers.size}")

    var array = arrayOf(1, 2, 3)
    //Convierte un arreglo de objetos a un arreglo de datos primitivos
    val primitive: IntArray = array.toIntArray()

    val sum = array.sum()
    println("La suma del array es: $sum")
    //Agregar datos al arreglo
    array = array.plus(4)
    for (arr in array){
        println(arr)
    }
    //Devuelve el array invertido
    array = array.reversedArray()
    for (arr in array){
        println(arr)
    }
    //Invierte el arreglo en sí mismo
    array.reverse()
    for (arr in array){
        println(arr)
    }

}