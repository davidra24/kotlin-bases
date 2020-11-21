package strings

fun main() {
    //Sin tipado de datos
    val nombre = "David"
    //Tipado de datos
    val apellido: String = "Ramírez"
    println("Tu nombre es $nombre y tu apellido $apellido")

    //RAW Strings
    //respeta la identación """...""".trimIndent()
    val parrafo = """
        **Lorem ipsum dolor sit amet, consectetur adipiscing elit, 
        sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
        **Ut enim ad minim veniam, **quis nostrud exercitation ullamco laboris
        nisi ut aliquip ** ex ea commodo consequat. Duis aute irure dolor in 
        **reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. 
        **Excepteur sint occaecat cupidatat non proident, 
        sunt in culpa qui officia deserunt mollit anim id est laborum.
    """.trimIndent()
    println(parrafo)
    println("")
    //trimmargnin
    println("TrimMargin ${parrafo.trimMargin("**")}")

    //Escape de caracteres => \t, \b, \n, \r, \', \", \\ y \$
    val nombreApellido = "David\nRamírez"
    println("Tu nombre es: $nombreApellido")

    val nombreApellidoComillas = "David \"Ramírez\""
    println("Tu nombre es: $nombreApellidoComillas")

}
