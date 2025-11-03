package dev.weitzsim.cluquiz

import dev.weitzsim.cluquiz.repositories.UserRepository
import dev.weitzsim.cluquiz.repositories.UserRepositoryImpl
import dev.weitzsim.cluquiz.viewmodels.UserViewModel
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module


val appModule = module {
    singleOf(::UserRepositoryImpl) { bind<UserRepository>() }
    factoryOf(::UserStateHolder)
    viewModelOf(::UserViewModel)
}