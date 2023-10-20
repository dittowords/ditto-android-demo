package com.dittowords.android.bankingapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dittowords.android.bankingapp.AppState
import com.dittowords.android.bankingapp.R
import com.dittowords.android.bankingapp.components.AppBackButton
import com.dittowords.android.bankingapp.components.AppButton
import com.dittowords.android.bankingapp.components.AppHeader
import com.dittowords.android.bankingapp.components.AppInput
import com.dittowords.android.bankingapp.components.AppTitle

@Composable
fun PhoneNumberScreen(navigation: NavController) {
    Column(modifier = Modifier.padding(25.dp, 0.dp)) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            AppTitle()
            AppHeader(
                text = String.format(stringResource(id = R.string.onboarding_enter_phone_number_header_sample), AppState.firstName.value),
                info = stringResource(
                    id = R.string.onboarding_phone_number_h2_sample
                )
            )
            AppInput(
                value = AppState.phoneNumber.value,
                onValueChange = { AppState.phoneNumber.value = it },
                placeholder = stringResource(id = R.string.input_phone_number_placeholder_sample)
            )
            Text(
                text = stringResource(id = R.string.onboarding_phone_number_disclosure_sample),
                color = Color(0xFFA1A1A1),
                fontWeight = FontWeight.Medium
            )
        }
        Column {
            AppButton(stringResource(id = R.string.onboarding_cta_next_sample), onClick = { navigation.navigate("verification") })
            AppBackButton(navigation)
            Spacer(modifier = Modifier.padding(0.dp, 25.dp))
        }
    }
}
