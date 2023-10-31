package com.dittowords.android.bankingapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.pluralStringResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dittowords.android.bankingapp.AppState
import com.dittowords.android.bankingapp.R
import com.dittowords.android.bankingapp.components.AppBackButton
import com.dittowords.android.bankingapp.components.AppButton
import com.dittowords.android.bankingapp.components.AppHeader
import com.dittowords.android.bankingapp.components.AppInput
import com.dittowords.android.bankingapp.components.AppSecondaryButton
import com.dittowords.android.bankingapp.components.AppTitle

@Composable
fun VerificationCodeScreen(navigation: NavController) {
    Column(modifier = Modifier.padding(25.dp, 0.dp)) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            AppTitle()
            AppHeader(
                text = stringResource(id = R.string.onboarding_phone_number_verification_header_sample),
                info = String.format(
                    pluralStringResource(
                        id = R.plurals.onboarding_phone_number_verification_hint_text_sample,
                        count = 10
                    ), AppState.phoneNumber.value, "10"
                )
            )
            AppInput(
                value = AppState.verificationCode.value,
                onValueChange = { AppState.verificationCode.value = it },
                placeholder = "XXXXXX"
            )
        }
        Column {
            AppSecondaryButton(
                question = stringResource(id = R.string.onboarding_phone_number_verification_didnt_receive_sample),
                cta = stringResource(id = R.string.onboarding_phone_number_verification_resend_sample),
                onClick = {})
            AppButton(
                stringResource(id = R.string.onboarding_cta_next_sample),
                onClick = { navigation.navigate("link-bank") })
            AppBackButton(navigation)
            Spacer(modifier = Modifier.padding(0.dp, 25.dp))
        }
    }
}
