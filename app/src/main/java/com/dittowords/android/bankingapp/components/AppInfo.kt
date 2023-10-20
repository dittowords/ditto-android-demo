package com.dittowords.android.bankingapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.dittowords.android.bankingapp.R

@Composable
fun AppInfo(title: String, text: String) {
    val textColor = Color(0xFF344055)
    Column(modifier = Modifier
        .padding(0.dp, 0.dp, 0.dp, 25.dp)
        .clip(shape = RoundedCornerShape(8.dp))
        .border(1.dp, Color(0xFFE2E8F0), RoundedCornerShape(8.dp))
        .background(Color(0xFFF7F8FD))) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.outline_info_24),
                    contentDescription = "Info Icon",
                    modifier = Modifier.size(14.dp),
                    tint = textColor
                )
                Text(
                    title,
                    modifier = Modifier.padding(4.dp, 0.dp),
                    color = textColor,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Text(
                text,
                color = textColor,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                lineHeight = 1.5.em
            )
        }
    }
}