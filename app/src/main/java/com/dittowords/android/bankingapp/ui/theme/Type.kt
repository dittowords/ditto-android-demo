package com.dittowords.android.bankingapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.dittowords.android.bankingapp.R

val InterFont = FontFamily(
    Font(R.font.inter_regular, FontWeight.Normal),
    Font(R.font.inter_bold, FontWeight.Bold),
    Font(R.font.inter_extrabold, FontWeight.ExtraBold),
    Font(R.font.inter_medium, FontWeight.Medium),
    Font(R.font.inter_semibold, FontWeight.SemiBold),
    Font(R.font.inter_light, FontWeight.Light),
    Font(R.font.inter_thin, FontWeight.Thin),
)

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge= TextStyle(fontFamily = InterFont),
    displayMedium= TextStyle(fontFamily = InterFont),
    displaySmall= TextStyle(fontFamily = InterFont),
    headlineLarge= TextStyle(fontFamily = InterFont),
    headlineMedium= TextStyle(fontFamily = InterFont),
    headlineSmall= TextStyle(fontFamily = InterFont),
    titleLarge= TextStyle(fontFamily = InterFont),
    titleMedium= TextStyle(fontFamily = InterFont),
    titleSmall= TextStyle(fontFamily = InterFont),
    bodyMedium= TextStyle(fontFamily = InterFont),
    bodySmall= TextStyle(fontFamily = InterFont),
    labelLarge= TextStyle(fontFamily = InterFont),
    labelMedium= TextStyle(fontFamily = InterFont),
    labelSmall= TextStyle(fontFamily = InterFont),
)