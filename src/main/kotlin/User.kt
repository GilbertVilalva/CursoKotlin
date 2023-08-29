class User constructor(var name: String){

    companion object{ //Propriedades e comportamentos da Classe
        var count = 0
    }

    fun printUpperCase(){
        println("Olá" + name.uppercase())
    }
    fun updateName(newName: String) {
        name = "$newName atualizado com sucesso"
    }

    fun getNameLenght() : Int {
        return name.length
    }
}