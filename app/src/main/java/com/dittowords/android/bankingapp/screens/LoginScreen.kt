package com.dittowords.android.bankingapp.screens

import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dittowords.android.bankingapp.AppState
import com.dittowords.android.bankingapp.R
import com.dittowords.android.bankingapp.components.AppButton
import com.dittowords.android.bankingapp.components.AppHeader
import com.dittowords.android.bankingapp.components.AppInput
import com.dittowords.android.bankingapp.components.AppSecondaryButton
import com.dittowords.android.bankingapp.components.AppTitle

@Composable
fun LoginScreen(navigation: NavController) {
    Column(modifier = Modifier.padding(25.dp, 0.dp)) {
        Spacer(modifier = Modifier.padding(0.dp, 18.dp, 0.dp, 0.dp))
        AppTitle(centered = true)
        Spacer(modifier = Modifier.padding(0.dp, 18.dp, 0.dp, 0.dp))
        AppHeader(text = stringResource(R.string.onboarding_log_in_header_sample))
        AppInput(
            value = AppState.email.value,
            onValueChange = { AppState.email.value = it } ,
            label = stringResource(R.string.input_email_label_sample),
            placeholder = stringResource(R.string.input_email_placeholder_sample)
        )
        AppInput(
            label = stringResource(R.string.input_password_label_sample),
            placeholder = "************",
            hideText = true,
            helpText = stringResource(R.string.onboarding_cta_forgot_password_sample)
        )
        AppButton("Log in", onClick = {})
        Spacer(modifier = Modifier.padding(0.dp, 7.dp))
        AppSecondaryButton(question = stringResource(id = R.string.onboarding_log_in_sign_up_message_sample),
            cta = stringResource(
                id = R.string.onboarding_sign_up_cta_sample
            ),
            onClick = { navigation.navigate("profile") })
    }
}
