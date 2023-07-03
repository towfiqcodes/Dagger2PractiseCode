package com.example.dependencyinjectionwithdagger2.module

import com.example.dependencyinjectionwithdagger2.*
import com.example.dependencyinjectionwithdagger2.annotations.ActivityScope
import com.example.dependencyinjectionwithdagger2.annotations.ApplicationScope
import com.example.dependencyinjectionwithdagger2.annotations.MessageQualifier
import com.example.dependencyinjectionwithdagger2.service.EmailService
import com.example.dependencyinjectionwithdagger2.service.MessageService
import com.example.dependencyinjectionwithdagger2.service.NotificationService
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule() {

    @ActivityScope
    @MessageQualifier
    @Provides
    fun getMessageService( retryCount: Int) : NotificationService {
        return  MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService {
        return  emailService
    }
}