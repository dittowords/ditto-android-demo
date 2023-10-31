package com.dittowords.android.bankingapp.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.dittowords.android.bankingapp.ui.theme.Typography

@Composable
fun AppHeader(text: String, info: String = "") {
    Text(
        text,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 1.2.em,
        modifier = Modifier.padding(0.dp, 12.dp, 0.dp, if (info == "") 18.dp else 0.dp)
    )
    if (info != "") {
        Text(
            info,
            modifier = Modifier.padding(0.dp, 6.dp, 0.dp, 18.dp),
            color = Color(0xFF858585),
            fontWeight = FontWeight.Medium,
        )
    }
}