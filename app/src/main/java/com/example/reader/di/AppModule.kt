package com.example.reader.di

import com.example.domain.MyClass
import com.example.reader.ui.screens.SearchViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<MyClass> { MyClass() }
    single<TestClass> { TestClass() }
    viewModel { SearchViewModel() }
}