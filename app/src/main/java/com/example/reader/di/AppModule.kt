package com.example.reader.di

import com.example.domain.MyClass
import org.koin.dsl.module

val appModule = module {
    single<MyClass> { MyClass() }
}