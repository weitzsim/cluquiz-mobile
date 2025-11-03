package dev.weitzsim.cluquiz

import android.app.Application
import dev.weitzsim.cluquiz.repositories.DefaultData.DEFAULT_USERS
import dev.weitzsim.cluquiz.repositories.UserRepository
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainApplication : Application() {

    private val userRepository : UserRepository by inject()

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            androidLogger()
            modules(appModule)
        }

        userRepository.addUsers(DEFAULT_USERS)
    }
}