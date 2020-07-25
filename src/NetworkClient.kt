package mvi

import kotlin.random.Random

class NetworkClient {

    companion object {
        fun getContacts(): List<Contact>? {
            val rand = Random.nextLong(3000)
            if(rand > 2000) return null

            Thread.sleep(rand)
            return mutableListOf(
                    Contact("Jackson", "+44 333 33 21"),
                    Contact("Jessy", "+44 333 33 21"),
                    Contact("Peter", "+44 333 33 21"),
                    Contact("Randal", "+44 333 33 21")
            )
        }
    }
}