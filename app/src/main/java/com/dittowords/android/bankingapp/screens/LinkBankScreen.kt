package com.dittowords.android.bankingapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.dittowords.android.bankingapp.AppState
import com.dittowords.android.bankingapp.R
import com.dittowords.android.bankingapp.components.AppBackButton
import com.dittowords.android.bankingapp.components.AppButton
import com.dittowords.android.bankingapp.components.AppHeader
import com.dittowords.android.bankingapp.components.AppInput
import com.dittowords.android.bankingapp.components.AppOutlinedButton
import com.dittowords.android.bankingapp.components.AppTitle

@Composable
fun LinkBankScreen(navigation: NavController) {
    Column(modifier = Modifier.padding(25.dp, 0.dp)) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            AppTitle()
            AppHeader(
                text = stringResource(id = R.string.onboarding_link_bank_header_sample),
                info = stringResource(
                    id = R.string.onboarding_link_bank_h2_sample
                )
            )
            AppInput(
                value = AppState.cardNumber.value,
                onValueChange = { AppState.cardNumber.value = it },
                label = stringResource(id = R.string.cards_label_card_number_sample)
            )
            Row {
                Column(modifier = Modifier.fillMaxWidth(0.50f)){
                    AppInput(
                        value = AppState.expiration.value,
                        onValueChange = { AppState.expiration.value = it },
                        label = stringResource(id = R.string.cards_label_expiration_sample),
                        placeholder = stringResource(id = R.string.input_card_expiration_placeholder_sample)
                    )
                }
                Spacer(modifier = Modifier.fillMaxWidth(0.04f))
                Column{
                    AppInput(
                        value = AppState.cvv.value,
                        onValueChange = { AppState.cvv.value = it },
                        label = stringResource(id = R.string.input_cvv_label_sample),
                        placeholder = "***"
                    )
                }
            }
            AppInput(
                value = AppState.zipCode.value,
                onValueChange = { AppState.zipCode.value = it },
                label = stringResource(id = R.string.input_zip_code_label_sample)
            )
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                val color = Color(0xFFA1A1A1)
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.baseline_security_24),
                    contentDescription = "Secure Icon",
                    modifier = Modifier.size(16.dp),
                    tint = color
                )
                Text(
                    text = String.format(stringResource(id = R.string.onboarding_link_bank_disclaimer_sample), "004532"),
                    modifier = Modifier.padding(10.dp, 0.dp),
                    color = color,
                    fontSize = 14.sp,
                    lineHeight = 1.5.em
                )
            }
        }
        Column {
            Row {
                Column(modifier = Modifier.fillMaxWidth(0.5f)){
                    AppOutlinedButton(text = stringResource(id = R.string.onboarding_cta_skip_sample), onClick = { navigation.navigate("account-details") })
                }
                Spacer(modifier = Modifier.fillMaxWidth(0.04f))
                Column{
                    AppButton(text = stringResource(id = R.string.onboarding_cta_next_sample), onClick = { navigation.navigate("account-details") })
                }
            }
            AppBackButton(navigation)
            Spacer(modifier = Modifier.padding(0.dp, 25.dp))
        }
    }
}
