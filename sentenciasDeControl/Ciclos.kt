package sentenciasDeControl

fun main() {
    println("for:")
    val daysOfWeek = listOf("Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado")
    //Ciclo for normalmente
    for(day in daysOfWeek){
        println(day)
    }
    println("")
    println("for with index: ")
    //ciclo for con índices
    for((index,day) in daysOfWeek.withIndex()){
        println("$index :$day")
    }
    //ForEach
    println("")
    println("forEach: ")
    daysOfWeek.forEach{
        println(it)
    }
    val numbers = 1..5
    println(numbers.map{
        it * it
    })
    numbers.forEach{
        print(it)
    }
}