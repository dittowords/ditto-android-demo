@file:OptIn(ExperimentalMaterial3Api::class)

package com.dittowords.android.bankingapp.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AppInput(
    value: String = "",
    onValueChange: (String) -> Unit = {},
    label: String = "",
    placeholder: String = "",
    hideText: Boolean = false,
    helpText: String = "",
    hint: String = ""
) {
    Column(modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 15.dp)) {
        if (label != "") {
            Text(
                label,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp)
            )
        }
        if (hint != "") {
            Text(
                hint,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp),
                color = Color(0xFF858585)
            )
        }
        TextField(
            value = value,
            onValueChange = onValueChange,
            visualTransformation = if (hideText) PasswordVisualTransformation() else VisualTransformation.None,
            shape = RoundedCornerShape(6.dp),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xFFF7F8FD),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            ),
            placeholder = { Text(text = placeholder) },
            modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, Color(0xFFE2E8F0), RoundedCornerShape(6.dp))
        )
        if (helpText != "") {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 6.dp, 0.dp, 0.dp), horizontalArrangement = Arrangement.End
            ) {
                Text(
                    text = helpText,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF4F46E5),
                )
            }
        }
    }
}
