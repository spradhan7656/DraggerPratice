package com.example.daggerpritice

import javax.inject.Inject


/**
 * in the dagger create the object use the @inject annotation and call the constructor
 * in the kotlin @Inject constructor() call
 * this is called constructor injection
 */
class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val notificationService: NotificationService
) {
    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        notificationService.send(email,"spradhan76567@gmail.com","user Register")
    }
}
/**
 * Unit Testing
 * Single responsibility
 * LifeTime of this object
 * Extensible
 *
 * in this 4 problems solve the implementation construction injection
 */