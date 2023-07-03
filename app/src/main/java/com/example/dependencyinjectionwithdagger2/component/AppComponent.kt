package com.example.dependencyinjectionwithdagger2.component

import com.example.dependencyinjectionwithdagger2.module.AnalyticsModule
import com.example.dependencyinjectionwithdagger2.service.AnalyticesService
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {
    fun getUserRegistrationComponentBuilder() : UserRegistrationComponent.Builder
}