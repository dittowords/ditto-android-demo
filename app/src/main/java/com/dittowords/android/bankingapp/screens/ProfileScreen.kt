package com.dittowords.android.bankingapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
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
fun ProfileScreen(navigation: NavController) {
    Column(modifier = Modifier.padding(25.dp, 0.dp)) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            AppTitle()
            AppHeader(
                text = stringResource(id = R.string.onboarding_profile_header_sample),
                info = stringResource(id = R.string.onboarding_profile_id_disclaimer_sample)
            )
            AppInput(value = AppState.firstName.value, onValueChange = { AppState.firstName.value = it}, label = stringResource(id = R.string.input_first_name_label_sample))
            AppInput(
                value = AppState.middleName.value,
                onValueChange = { AppState.middleName.value = it },
                label = stringResource(id = R.string.input_middle_name_label_sample),
                hint = stringResource(id = R.string.input_middle_name_helper_text_sample)
            )
            AppInput(
                value = AppState.lastName.value,
                onValueChange = { AppState.lastName.value = it },
                label = stringResource(id = R.string.input_last_name_label_sample)
            )
            AppInput(
                value = AppState.dateOfBirth.value,
                onValueChange = { AppState.dateOfBirth.value = it },
                label = stringResource(id = R.string.input_birthday_label_sample),
                placeholder = stringResource(id = R.string.input_birthday_placeholder_sample),
                hint = stringResource(
                    id = R.string.input_birthday_helper_text_sample
                )
            )
        }
        Column {
            AppButton(stringResource(id = R.string.onboarding_cta_next_sample), onClick = { navigation.navigate("confirm-identity")})
            Spacer(modifier = Modifier.padding(0.dp, 7.dp))
            AppSecondaryButton(
                question = stringResource(id = R.string.onboarding_sign_up_login_message_sample),
                cta = stringResource(id = R.string.onboarding_log_in_header_sample),
                onClick = { navigation.navigate("login") })
            Spacer(modifier = Modifier.padding(0.dp, 25.dp))
        }
    }
}
