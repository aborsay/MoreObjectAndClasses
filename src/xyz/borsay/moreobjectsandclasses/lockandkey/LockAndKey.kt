package xyz.borsay.moreobjectsandclasses.lockandkey

import kotlin.random.Random

    class Lock(key: Key){
        val secrectCode: String
        init{
            secrectCode = generateSecretCode()
            key.secreteCode = secrectCode
        }


        companion object{
            fun createKey() = Key()
        }

        fun generateSecretCode(): String{
            return Random(System.currentTimeMillis()).nextInt().toString()
        }

        fun unlock(key: Key){
            if(key.secreteCode == secrectCode)
                println("Lock in Open")
            else
                println("Key is not correct")
        }
    }




    class Key{
        var secreteCode: String = ""
        set(value){
            if(field == "")
                field = value
        }

    }
