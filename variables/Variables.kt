package variables

//Const debe ser asignado en tiempo de compilación
const val DATA = 2

//Programación funcional -> Principios de inmutabilidad
//Evitar variables (var) globales -> var n = 3 => Mala práctica
//Funciones puras => Nada debe alterar esta función
fun main(args : Array<String>){
    //const  No puede usarse en tiempo de compilación
    //const val data = 3
    /*println(n)
    n = 4
    println(n)*/

    // Se debe asignar en tiempo de ejecución
    //const val => no se puede aplicar a variable 'local' = tiempo ejecución
    val x = 5
    println("Tiempo de ejecución $x")
    val name: String = args[0]
    println("name $name")

    println("Cosntantes => $DATA")

}