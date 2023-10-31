package com.dittowords.android.bankingapp.screens

import android.content.res.Resources
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
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
fun AccountDetailsScreen(navigation: NavController) {
    Column(modifier = Modifier.padding(25.dp, 0.dp)) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            AppTitle()
            AppHeader(
                text = stringResource(id = R.string.onboarding_account_details_header_sample),
                info = stringResource(id = R.string.onboarding_account_details_hint_text_sample)
            )
            AppInput(
                value = AppState.email.value,
                onValueChange = { AppState.email.value = it },
                label = stringResource(id = R.string.input_email_label_sample),
                placeholder = stringResource(id = R.string.input_email_placeholder_sample)
            )
            AppInput(
                label = stringResource(id = R.string.input_password_label_sample),
                placeholder = "************",
                hideText = true,
            )
            AppInput(
                label = stringResource(id = R.string.input_confirm_password_label_sample),
                placeholder = "************",
                hideText = true,
            )
        }
        Column {
            AppButton(stringResource(id = R.string.onboarding_sign_up_cta_sample), onClick = {})
            AppBackButton(navigation)
            AppSecondaryButton(
                question = String.format(stringResource(id = R.string.onboarding_sign_up_disclaimer_sample), "").trimEnd(),
                cta = "Terms and Conditions",
                onClick = {}
            )
            Spacer(modifier = Modifier.padding(0.dp, 25.dp))
        }
    }
}
