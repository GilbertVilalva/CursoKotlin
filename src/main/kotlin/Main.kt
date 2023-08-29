fun main(){
    val resposta = somar()
    olaMundo()
    helloWorld()
    verificaIdade(30) //Não precisa escrever "age"

    println(resposta)
}

// FUNÇÕES

fun olaMundo(){
    println("Ola Mundo")
}

fun helloWorld() = println("Hello World")

fun somar(): Int{
    return 2 + 3
}

fun verificaIdade(age: Int) = if (age > 18) println ("Pode dirigir") else println("Não pode")