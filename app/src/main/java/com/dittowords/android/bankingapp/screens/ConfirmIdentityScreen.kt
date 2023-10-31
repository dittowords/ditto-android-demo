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
import com.dittowords.android.bankingapp.components.AppBackButton
import com.dittowords.android.bankingapp.components.AppButton
import com.dittowords.android.bankingapp.components.AppHeader
import com.dittowords.android.bankingapp.components.AppInfo
import com.dittowords.android.bankingapp.components.AppInput
import com.dittowords.android.bankingapp.components.AppTitle

@Composable
fun ConfirmIdentityScreen(navigation: NavController) {
    Column(modifier = Modifier.padding(25.dp, 0.dp)) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            AppTitle()
            AppHeader(text = stringResource(id = R.string.onboarding_confirm_identity_header_sample))
            AppInfo(
                title = stringResource(id = R.string.onboarding_information_disclaimer_header_sample),
                text = stringResource(
                    id = R.string.onboarding_information_disclaimer_description_sample
                )
            )
            AppInput(
                value = AppState.country.value,
                onValueChange = { AppState.country.value = it },
                label = stringResource(id = R.string.input_country_of_residence_label_sample),
                placeholder = stringResource(
                    id = R.string.input_select_placeholder_sample
                )
            )
            AppInput(
                value = AppState.ssn.value,
                onValueChange = { AppState.ssn.value = it },
                label = stringResource(id = R.string.input_last_4_ssn_label_sample),
                placeholder = "XXXX",
                hint = stringResource(id = R.string.input_confirm_identity_helper_text_sample)
            )
        }
        Column {
            AppButton(stringResource(id = R.string.onboarding_cta_next_sample), onClick = { navigation.navigate("phone-number") })
            AppBackButton(navigation)
            Spacer(modifier = Modifier.padding(0.dp, 25.dp))
        }
    }
}
