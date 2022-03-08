class Cavalo(


    nome: String, idade: Int

    ) : ANIMAIS(nome, idade) {


        fun correr() {
            println("Correndo como um cavalo")
        }


      override fun emitirSom(){
            println("Relinchando")
        }
    }
