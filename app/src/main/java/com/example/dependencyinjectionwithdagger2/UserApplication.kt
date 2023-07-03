package com.example.dependencyinjectionwithdagger2

import android.app.Application
import com.example.dependencyinjectionwithdagger2.component.AppComponent
import com.example.dependencyinjectionwithdagger2.component.DaggerAppComponent
import com.example.dependencyinjectionwithdagger2.component.UserRegistrationComponent

class UserApplication : Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
    }

}