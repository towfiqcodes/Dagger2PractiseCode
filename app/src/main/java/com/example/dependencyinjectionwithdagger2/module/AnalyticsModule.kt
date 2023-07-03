package com.example.dependencyinjectionwithdagger2.module

import com.example.dependencyinjectionwithdagger2.service.AnalyticesService
import com.example.dependencyinjectionwithdagger2.service.Mixpanel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsModule {

    @Provides
    @Singleton
    fun getAnalyticsService() : AnalyticesService {
        return Mixpanel()
    }
}