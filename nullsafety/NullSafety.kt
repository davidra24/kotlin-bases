package nullsafety

import java.lang.Exception

fun main() {
    //Operador Elvis  ?:
    var compute: String?
    compute = null
    var longitud: Int = compute?.length ?: 0
    println("La longitud es $longitud")

    //Catchear excepción
    try {
        var computation: String?
        computation = null
        var leng: Int = computation!!.length
    } catch (exception: KotlinNullPointerException) {
        println("Por favor ingresa un valor")
    }

    //Llamada segura
    var computate: String? = null
    var longitu: Int? = computate?.length

    println("Longitú $longitu")

    val listWithNulls: List<Int?> = listOf(7, null, 4, null)
    println("Lista con null: ${listWithNulls}")

    val listWithoutNulls: List<Int?> = listWithNulls.filterNotNull()
    println("Lista sin null ${listWithoutNulls}")

}