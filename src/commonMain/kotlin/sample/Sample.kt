var fun1 = {_: Int, n1: Int -> n1}

var fun2 = {n0: Int, n1: Int -> n0 > n1}

fun sum(a: Int, b:Int): Int{
    return a + b
}

val tabla1 = Array(size = 20, init = {2*it})

val tabla2 = Array(size = 20, init = {3*it})

val tabla3 = Array(size = 20, init = {4*it})

val nombres = arrayListOf("Adam","Andrew","Chike","Kechi")

fun main(args: Array<String>){
    val resto = fun1(2,3)
    println(resto)

    fun2 = {n0: Int, n1: Int -> n0 > n1}

    tabla1.forEach{
        println("3*${it/3} = ${it}")
    }
    tabla1.forEach{
        println("4*${it/4} = ${it}")
    }
    fun filtrarLenghth(longitud: Int){
    nombres.filter{
        it.length = longitud
    }.forEach{
        println(it)
     }
    }
}
fun main(args: Array<String>){

    // ----------------------------- EJERCICIO 1 ----------------------------------
    // Variable "numeros" que contiene una función y ejecuta una suma.
    var numeros : (Int,Int) -> Int = {n1: Int, n2: Int -> n1 + n2}
    println(numeros(2,2))
    // Variable anterior pero esta vez restando dos números.
    numeros = {n1: Int, n2: Int -> n1 - n2}
    println(numeros(2,2))
    // ----------------------------------------------------------------------------
    println(" ")
    // ----------------------------- EJERCICIO 2 ----------------------------------
    /*
     Esta variable contiene una función que lo que hará es comparar los dos números introducidos y devolverá un true o false.
     True: Si el mayor es el primero.
     False: Si el mayor es el segundo.
    */
    var boleano : (Int,Int) -> Boolean = {n1: Int, n2: Int -> n1 > n2}
    println(boleano(4,2))
    /*
     En este caso nuestra variable devolverá "true" en caso de que ambos números sean pares, y "false" si alguno es impar.
     */
    boleano = {n1: Int, n2: Int -> n1%2==0 && n2%2==0 }
    println(boleano(6,6))
    // ----------------------------------------------------------------------------
    println(" ")
    // ----------------------------- EJERCICIO 3 ----------------------------------
    /*
     Primero declaramos el Array y establecemos su tamaño, en este caso 11, una vez hecho esto con la declaración "{it*2}" lo que básicamente hacemos es
     multiplicar la posición del array por 2.

        - Ejemplo:
        La segunda posición del Array. (Que se correspondería a 2*1 = 2) lo que haría sería {1*2} y esto daría 2, por lo tanto it=2.

        Una vez hecho esto, llamamos al Array desde el forEach, y dentro del "println" lo que hacemos es dividir el valor "it" entre dos, lo que hace esto básicamente
        es imprimir el número por el que estaríamos multiplicando el 2, en nuestro ejemplo (2*1=2) el número 1 saldría de dividir it (que como calculamos antes vale 2)
        entre 2 lo que hace que el resultado sea 2/2=1.
        Por último, imprimimos directamente el "it" que como resolvimos anteriormente, vale 2.
    */
    val tabla2 = Array<Int>(11, {it*2})
    val tabla3 = Array<Int>(11, {it*3})
    val tabla4 = Array<Int>(11, {it*4})

    tabla2.forEach{
        println("2*${it/2} = ${it}")
    }
    println(" ")
    tabla3.forEach{
        println("3*${it/3} = ${it}")
    }
    println(" ")
    tabla4.forEach{
        println("4*${it/4} = ${it}")
    }
    // ----------------------------------------------------------------------------
    println(" ")
    // ----------------------------- EJERCICIO 4 ----------------------------------
    val names = arrayListOf("Adam", "Andrew", "Chike", "Kechi")

    val numbers = listOf("one", "two", "three", "four")
    val longerThan3 = numbers.filter { it.length > 3 }
    println(longerThan3)

// ----------------------------------------------------------------------------
