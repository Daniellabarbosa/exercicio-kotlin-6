class bichoPreguica(


    nome: String, idade: Int

) : ANIMAIS(nome, idade) {



    fun subir() {
        println("Subindo na arvore")
    }

    override fun emitirSom() {
        println("Sons de Bicho Preguiça")
    }

}