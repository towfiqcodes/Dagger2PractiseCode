package com.example.dependencyinjectionwithdagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dependencyinjectionwithdagger2.service.EmailService
import com.example.dependencyinjectionwithdagger2.service.UserRegistrationService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService : UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    @Inject
    lateinit var emailService1: EmailService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val appComponent=(application as UserApplication).appComponent

        val userRegistrationComponent=appComponent.getUserRegistrationComponentBuilder().retryCount(3).build()
        userRegistrationComponent.inject(this)

//        val userRegistrationService =component.getUserRegistrationService()
//        val emailService=component.getEmailService()


        userRegistrationService.registerUser("towfiqul@gmail.com", "123456")
    }
}