class Cachorro(


    nome: String, idade: Int

) : ANIMAIS(nome, idade) {


     fun correr() {
        println("Correndo como um cachorro")
    }

    override fun emitirSom(){
        println("Latindo AU AU")
    }

}
