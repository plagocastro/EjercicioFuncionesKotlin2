var fun = {_: Int, n1: Int -> n1}

var fun2 = {n0: Int, n1: Int -> n0 > n1}

val tabla1 = Array(size = 20, init = {2*it})

val tabla2 = Array(size = 20, init = {3*it})

val tabla3 = Array(size = 20, init = {4*it})

val nombres = arrayListOf("Adam","Andrew","Chike","Kechi")

fun main(args: Array<String>){
    val resto = fun(2,3)
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
