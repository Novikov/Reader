package com.example.reader.di

import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.reader.ui.saved_screens.SearchViewModel
import com.example.reader.ui.screens.login.LoginScreenViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single <NavController>{ NavHostController(context = androidContext()) }
    viewModel { SearchViewModel() }
    viewModel { LoginScreenViewModel() }
}