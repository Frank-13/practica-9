fun fibonacci(n: int):{
    return if(n <=1){
        n
    }else{
        fibonacci(n-1) + fibonacci(n-2)
    }
}

fun sumaRecursiva(n: int): Int {
    return if (n <=1){
        1
    }else {
        n + sumaRecursiva(n-1)
    }
}

fun sumaLista(lista: List<Int>): Int {
    return if (lista.isEmpty()){
        0
    }else {
        list[0] + sumaLista(lista.drop{1})
    }
}

fun main (args: Array<String>){
    //ejemplo de Fibonacci
    val numero = 15
    val numerosLista = listOf(1,2,3,4)
    println("\nejemplo 1")
    println("Finocci de $numero es: ${fibonacci(numero)}")

    println("nejemplo 2")
    println("la suma de 1  a $numero es: ${sumaRecursiva(numero)}")

    println("nejemplo 3")
    println("la suma de la lista es: ${sumaLista(numerosLista)}")
}