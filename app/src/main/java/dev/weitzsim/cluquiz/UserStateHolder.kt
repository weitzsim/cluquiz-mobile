package dev.weitzsim.cluquiz

import dev.weitzsim.cluquiz.repositories.UserRepository

/**
 * Simple presenter - use the HelloRepository to "say" hello
 */
class UserStateHolder(private val repository: UserRepository) {

    fun sayHello(name : String) : String{
        val foundUser = repository.findUser(name)
        return foundUser?.let { "Hello '$it' from $this" } ?: "User '$name' not found!"
    }
}