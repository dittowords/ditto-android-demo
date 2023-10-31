@file:OptIn(ExperimentalMaterial3Api::class)

package com.dittowords.android.bankingapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.dittowords.android.bankingapp.screens.AccountDetailsScreen
import com.dittowords.android.bankingapp.screens.ConfirmIdentityScreen
import com.dittowords.android.bankingapp.screens.LinkBankScreen
import com.dittowords.android.bankingapp.screens.LoginScreen
import com.dittowords.android.bankingapp.screens.PhoneNumberScreen
import com.dittowords.android.bankingapp.screens.ProfileScreen
import com.dittowords.android.bankingapp.screens.VerificationCodeScreen
import com.dittowords.android.bankingapp.ui.theme.BankingAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val context = LocalContext.current
            BankingAppTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "login") {
                    composable("login") { LoginScreen(navigation = navController) }
                    composable("profile") { ProfileScreen(navigation = navController) }
                    composable("confirm-identity") { ConfirmIdentityScreen(navigation = navController) }
                    composable("phone-number") { PhoneNumberScreen(navigation = navController) }
                    composable("verification") { VerificationCodeScreen(navigation = navController) }
                    composable("link-bank") { LinkBankScreen(navigation = navController) }
                    composable("account-details") { AccountDetailsScreen(navigation = navController)}
                }
            }
        }
    }
}