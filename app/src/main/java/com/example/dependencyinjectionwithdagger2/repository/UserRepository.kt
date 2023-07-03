package com.example.dependencyinjectionwithdagger2

import android.content.ContentValues.TAG
import android.util.Log
import com.example.dependencyinjectionwithdagger2.annotations.ActivityScope
import com.example.dependencyinjectionwithdagger2.annotations.ApplicationScope
import com.example.dependencyinjectionwithdagger2.service.AnalyticesService
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)

}

@ActivityScope
class SQLRepository @Inject constructor(val analyticesService: AnalyticesService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Saved in DB")
        analyticesService.trackEvent("Save User", "Create" )
    }
}

class FirebaseRepository(val analyticesService: AnalyticesService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Saved in Firebase")
        analyticesService.trackEvent("Save User", "Create" )
    }

}