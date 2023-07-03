package com.example.dependencyinjectionwithdagger2.module

import com.example.dependencyinjectionwithdagger2.annotations.ApplicationScope
import com.example.dependencyinjectionwithdagger2.SQLRepository
import com.example.dependencyinjectionwithdagger2.UserRepository
import com.example.dependencyinjectionwithdagger2.annotations.ActivityScope
import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryModule {

    @Binds
    @ActivityScope
   abstract fun getSQLRepository(sqlRepository: SQLRepository): UserRepository

}