package dev.weitzsim.cluquiz.repositories

import dev.weitzsim.cluquiz.models.User

    object DefaultData {
        val DEFAULT_USER = User("Koin")
        val DEFAULT_USERS = listOf(DEFAULT_USER)
    }