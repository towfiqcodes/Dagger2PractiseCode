package com.example.dependencyinjectionwithdagger2.service

import com.example.dependencyinjectionwithdagger2.annotations.MessageQualifier
import com.example.dependencyinjectionwithdagger2.UserRepository
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    @MessageQualifier private val notificationService: NotificationService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "no-reply@towfiq.com", "User Registered")
    }
}