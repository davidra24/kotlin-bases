package primerReto

import java.lang.Exception
import java.lang.NumberFormatException

val Ingredientes: Array<String> = arrayOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")

data class Receta(
        var nombre: String,
        var ingredientes: List<IngredienteReceta>
)

data class IngredienteReceta(
        var index: Int,
        var ingrediente: String
)

class Recipes {

    val recetas: MutableList<Receta> = mutableListOf()

    fun AgregarReceta(receta: Receta) {
        this.recetas.add(receta)
    }

    fun start() {
        do {
            var repetir = false
            println("""
            Bienvenido a Recipes Make, ¿qué desea hacer hoy?
                1. Hacer una receta.
                2. Ver mis recetas.
                3. Salir.
            """.trimIndent())
            print("¿Qué opción desea realizar hoy?: ")
            do {
                val read = this.readNumber()
                when (read) {
                    1 -> {
                        var nombre: String?
                        var ingredientesReceta: MutableList<IngredienteReceta> = mutableListOf()
                        println("Bienvenido al creador de recetas.")
                        do {
                            var seguro: Boolean
                            print("¿Qué nombre desea colocar a su receta?: ")
                            nombre = readLine()
                            try {
                                var usado = false
                                this.recetas.forEach {
                                    if (it.nombre == nombre) {
                                        usado = true
                                    }
                                }
                                if (usado) {
                                    println("Ese nombre de receta ya está en uso, por favor, elija otro.")
                                    seguro = false
                                } else {
                                    println("Su receta tendrá el nombre: $nombre, ¿está seguro?")
                                    print("Dígite 'S' si está seguro, de lo contrario utilice otro valor: ")
                                    val linea = readLine()
                                    seguro = linea == "S" || linea == "s"
                                }
                            } catch (error: Exception) {
                                seguro = false
                                print("Digite un nombre válido: ")
                            }
                        } while (!seguro)
                        do {
                            var size = 0
                            var agregar = false

                            println("¿Qué ingrediente desea agregar?")
                            Ingredientes.forEachIndexed { index, s ->
                                var yaExiste = false
                                ingredientesReceta.forEach {
                                    if (it.ingrediente.equals(s)) {
                                        yaExiste = true
                                    }
                                }
                                if (!yaExiste) {
                                    println("$index. $s")
                                }
                            }
                            do {
                                print("Ingrediente: ")
                                val index = this.readNumber()
                                var usado = false
                                var continuar = true

                                ingredientesReceta.forEach {
                                    if (it.index == index) {
                                        usado = true
                                    }
                                }
                                if (usado) {
                                    println("Ya utilizó este ingrediente, por favor ingrese uno diferente.")
                                    continuar = true
                                } else {
                                    try {
                                        val ingrediente: String = Ingredientes[index]
                                        ingredientesReceta.add(IngredienteReceta(index, ingrediente))
                                        size.inc()
                                        println("¿Desea agregar otro ingrediente?")
                                        print("Dígite 'S' si está seguro, de lo contrario utilice otro valor: ")
                                        val linea = readLine()
                                        continuar = linea == "S" || linea == "s"
                                        agregar = linea == "S" || linea == "s"
                                    } catch (ex: Exception) {
                                        println("La receta debe estar dentro del rango")
                                    }
                                }
                                if (size == 8) continuar = false
                            } while (continuar)
                            if (size == 8) {
                                println("Ya agregó todos los ingredientes a esta receta")
                                agregar = false
                            }
                            AgregarReceta(Receta(nombre!!, ingredientesReceta))
                            println("Receta agregada")
                        } while (agregar)
                        repetir = true
                    }
                    2 -> {
                        if (recetas.size != 0) {
                            println("Sus recetas son las siguientes")
                            this.recetas.forEach {
                                println("Nombre de la receta: ${it.nombre}")
                                println("Ingredientes de la receta")
                                it.ingredientes.forEach { at ->
                                    print("${at.ingrediente} \t")
                                }
                                println("")
                            }
                        } else {
                            println("No cuenta con recetas actualmente")
                        }
                        repetir = true
                    }
                    3 -> repetir = false
                    else -> print("La opción que seleccionó no es válida. por favor digite una opción valida: ")
                }
            } while (read == -1)
        } while (repetir)
        println("Gracias por utilizar Recipes Maker, vuelva pronto!")
    }

    fun readNumber(): Int {
        val respuesta: String? = readLine()
        var retorno: Int
        try {
            retorno = Integer.parseInt(respuesta)
        } catch (ex: NumberFormatException) {
            retorno = -1
        }
        return retorno
    }

}

fun main() {
    Recipes().start()
}