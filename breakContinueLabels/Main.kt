package breakContinueLabels

fun main() {
    //Break. Termina el ciclo más cercano
    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..5) {
            if (j.equals(3)) break
            println("j: $j")
        }
    }
    //Continue. Va a la siguiente línea de código del ciclo más cercano.
    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..5) {
            if (j.equals(3)) continue
            println("j: $j")
        }
    }
    /**
     * Labels
    Podemos usar labels para controlar mejor los saltos y definir en qué ciclo queremos que inicie después de saltar.
    Un label será un nombre que fungirá como identificador clave para el punto y/o ciclo específico al cual deseamos saltar, lo usaremos con break y continue llamándolo por el mismo nombre definido.

    La sintaxis de un label es: nombre@
    Un label se llamará así: break/continue@nombre

    Para entender mejor cómo funciona anidemos un for más a nuestra secuencia:
     **/
    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k.equals(3)) break
                println("k: $k")
            }
        }
    }
    // Así se verían nuestros for’s usando un label

    terminarTodoCiclo@ for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k.equals(3)) break@terminarTodoCiclo
                println("k: $k")
            }
        }
    }

    //Cómo se ve en este caso para Break y Label terminarán el ciclo donde está definido el label.
    //Ahora veamos cómo se comporta con Continue:

    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k.equals(3)) continue
                println("k: $k")
            }
        }
    }

}
