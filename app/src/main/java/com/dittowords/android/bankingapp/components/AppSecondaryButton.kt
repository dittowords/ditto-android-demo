package com.dittowords.android.bankingapp.components

import android.service.autofill.OnClickAction
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AppSecondaryButton(question: String, cta: String, onClick: () -> Unit) {
    Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth().padding(0.dp, 0.dp, 0.dp, 0.dp)){
        val annotatedString = buildAnnotatedString {
            append("$question ")
            pushStringAnnotation(tag = cta, annotation = "")
            withStyle(style = SpanStyle(color = MaterialTheme.colorScheme.primary)) {
                append(cta)
            }
            pop()
        }
        ClickableText(
            text = annotatedString,
            style = TextStyle(fontSize = 16.sp, color = Color(0xFFA1A1A1), textAlign = TextAlign.Center),
            onClick = {
                annotatedString
                    .getStringAnnotations(cta, it, it)
                    .firstOrNull()?.let { stringAnnotation ->
                        onClick()
                    }
            }
        )
    }
}
