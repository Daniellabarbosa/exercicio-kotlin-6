fun main() {


    val cachorro = Cachorro(
            "Derby", 4
        )

        cachorro.correr()
        cachorro.emitirSom()


        val cavalo = Cavalo(
            "Pegasus", 25
        )

        cavalo.correr()
        cavalo.emitirSom()


        val bichoPreguica = bichoPreguica(
            "Flecha", 30
        )

        bichoPreguica.subir()
        bichoPreguica.emitirSom()


    }

}