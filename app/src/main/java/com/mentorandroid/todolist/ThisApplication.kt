package com.mentorandroid.todolist

import android.app.Application
import com.google.firebase.database.FirebaseDatabase
class ThisApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        //Enable Firebase persistence for offline access
        FirebaseDatabase.getInstance().setPersistenceEnabled(true)
    }
}