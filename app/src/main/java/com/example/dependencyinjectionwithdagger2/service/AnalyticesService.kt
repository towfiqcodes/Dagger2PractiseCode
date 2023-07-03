package com.example.dependencyinjectionwithdagger2.service

import android.content.ContentValues.TAG
import android.util.Log

interface AnalyticesService {
    fun trackEvent(eventName: String, eventType: String)
}

class Mixpanel : AnalyticesService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, "Mixpanel - $eventName - $eventType")
    }
}

class FirebaseAnalytics : AnalyticesService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, "FirebaseAnalytics - $eventName - $eventType")
    }
}