package com.example.dependencyinjectionwithdagger2.component

import com.example.dependencyinjectionwithdagger2.MainActivity
import com.example.dependencyinjectionwithdagger2.annotations.ActivityScope
import com.example.dependencyinjectionwithdagger2.annotations.ApplicationScope
import com.example.dependencyinjectionwithdagger2.module.AnalyticsModule
import com.example.dependencyinjectionwithdagger2.module.NotificationServiceModule
import com.example.dependencyinjectionwithdagger2.module.UserRepositoryModule
import com.example.dependencyinjectionwithdagger2.service.EmailService
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)

    fun getEmailService(): EmailService

//    @Subcomponent.Factory
//    interface Factory {
//        fun create(@BindsInstance retryCount: Int): UserRegistrationComponent
//    }

    @Subcomponent.Builder
    interface Builder {
        fun build(): UserRegistrationComponent
        fun retryCount(@BindsInstance retryCount: Int): Builder

    }
}