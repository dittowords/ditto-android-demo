package com.dittowords.android.bankingapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

// This class is a quick hacky way to persist values for the sake of the example application
// it's purpose is to illustrate how variables can be replaced into the string resources exported
// from Ditto.
class AppState {
    companion object {
        var email = mutableStateOf("")
        var firstName = mutableStateOf("")
        var middleName = mutableStateOf("")
        var lastName = mutableStateOf("")
        var dateOfBirth = mutableStateOf("")
        var country = mutableStateOf("")
        var ssn = mutableStateOf("")
        var phoneNumber = mutableStateOf("")
        var verificationCode = mutableStateOf("")
        var cardNumber = mutableStateOf("")
        var expiration = mutableStateOf("")
        var cvv = mutableStateOf("")
        var zipCode = mutableStateOf("")
    }
}