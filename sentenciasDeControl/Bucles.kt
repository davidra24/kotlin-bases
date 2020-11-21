package sentenciasDeControl

fun main() {
    //While => contadores
    var i = 1
    while (i < 1){
        println("i es $i")
        //i++
        i = i.inc()
    }

    i=1
    do{
        println("DO WHILE => i es $i")
        i = i.inc()
    }while(i < 1)

}