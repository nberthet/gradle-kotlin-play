package services

import com.google.inject.Singleton

@Singleton
class Service {
    fun greet(name: String) = "Hello $name"
}