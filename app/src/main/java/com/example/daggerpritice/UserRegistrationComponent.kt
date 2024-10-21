package com.example.daggerpritice

import dagger.Component

@Component
interface UserRegistrationComponent {
    /**
     * in the component help the all application need the object to define
     * then u now build the project because the dagger is compiled framework
     */
    /**
     *
     */
    fun inject(mainActivity: MainActivity)
//    fun getUserRegistrationService(): UserRegistrationService
//    fun getEmailService():EmailService
}
