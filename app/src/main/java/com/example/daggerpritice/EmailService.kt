package com.example.daggerpritice

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

interface NotificationService{
    fun send(to:String,form:String,body:String?)
}

class EmailService @Inject constructor(): NotificationService{
    override fun send(to:String, form:String, body:String?) {
        Log.d("Email send", "Sent Email")
    }
}
class MessageService @Inject constructor(): NotificationService{
    override fun send(to: String, form: String, body: String?) {
        Log.d("Message send", "Sent Message")
    }

}