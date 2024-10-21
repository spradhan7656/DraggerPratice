package com.example.daggerpritice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    /**
     * this is called field injection
     */
    @Inject
    lateinit var userRegistrationService: UserRegistrationService
    @Inject
    lateinit var emailService: EmailService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
         * no need to create manually object creation
         */
//        val userRepository=UserRepository()
//        val emailService=EmailService()
//
//        val userRegistrationService=UserRegistrationService(userRepository,emailService)

        /**
         * after the build the project the dagger create a class
         */
        /**
         * in the mainActivity have to need to 50 object this is not good approch because
         * writing the code many times
         */
        val component=DaggerUserRegistrationComponent.builder().build()
        emailService.send("sprada7667","sprahdna8883","hiii")
        userRegistrationService.registerUser("spradhan7656@gmail.com","12345678")
    }
}
/**
 * the some change in use the constructor injection called the manual dependency injection
 */