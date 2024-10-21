package com.example.daggerpritice

import android.nfc.Tag
import android.util.Log
import javax.inject.Inject

/**
 * in the dagger create object
 *
 */
interface UserRepository{
    fun saveUser(email: String, password: String)
}
class SQLrepository @Inject constructor(): UserRepository {
    override fun saveUser(email:String, password:String){
        Log.d("Save user","Save user in DB")
    }
}
class FirebaseUserRepository @Inject constructor(): UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("saveUser","Save user in Firebase")
    }
}