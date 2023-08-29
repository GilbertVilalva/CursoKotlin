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

//classe -> É o molde para criar N objetos
//objetos -> É o conjunto de proposicções e comportamentos de um contexto do seu sistema (Button, LoginScreen, PassValidator)
//object -> É um objeto também, só que ele é único, ou seja, não é igual a classe que sai vários obejtos
//(exemplo: Banco de Dados, Sessão de Usuários, Logs)
