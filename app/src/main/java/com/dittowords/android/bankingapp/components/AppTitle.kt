package com.dittowords.android.bankingapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dittowords.android.bankingapp.R
import com.dittowords.android.bankingapp.ui.theme.BankingAppTheme

@Composable
fun AppTitle(centered: Boolean = false) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(0.dp, 18.dp, 0.dp, 0.dp),
        horizontalArrangement = if (centered) Arrangement.Center else Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher),
            contentDescription = "App Logo",
            modifier = Modifier.size(36.dp).padding(0.dp, 0.dp, 4.dp, 0.dp)
        )
        Text(
            text = "DittoPay",
            fontWeight = FontWeight.W900,
            fontSize = 32.sp,
            color = MaterialTheme.colorScheme.primary
        )
    }
}