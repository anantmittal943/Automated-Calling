package com.anantmittal.automatedcalling.di

import org.koin.dsl.module
import com.anantmittal.automatedcalling.data.network.NetworkClient

val appModule = module {
    single { NetworkClient.createHttpClient() }
    
    // Repositories
    
    // ViewModels
}
