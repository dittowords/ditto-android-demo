package com.dittowords.android.dittobnb

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.dittowords.android.dittobnb.ui.theme.DittobnbTheme

@Composable
fun OnlineExperiencesScreen(navController: NavController) {
    val scrollState = rememberScrollState()
    Column(
        Modifier
            .padding(horizontal = 16.dp)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Text(
            stringResource(R.string.landing_body_online_experiences_title),
            color = Color.Black,
            fontSize = 34.sp,
            fontWeight = FontWeight.Bold
        )
        ExperienceCard(
            R.drawable.onlineexp1,
            stringResource(R.string.landing_body_online_experiences_live_concert)
        )
        ExperienceCard(
            R.drawable.onlineexp2,
            stringResource(R.string.landing_body_online_experiences_learn_photography)
        )
        ExperienceCard(
            R.drawable.onlineexp3,
            stringResource(R.string.landing_body_online_experiences_event_support)
        )
        ExperienceCard(
            R.drawable.onlineexp4,
            stringResource(R.string.landing_body_online_experiences_stovetop_tricks)
        )
    }
}

@Composable
private fun ExperienceCard(imageID: Int, text: String) {
    Column(
        Modifier
            .clip(RoundedCornerShape(10.dp))
            .background(Color.LightGray)

    ) {
        Image(
            painter = painterResource(id = imageID),
            contentDescription = null,
            Modifier.aspectRatio(1f),
            contentScale = ContentScale.Crop
        )
        Text(
            text,
            Modifier.padding(10.dp),
            fontSize = 17.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewOnlineExperiencesScreen() {
    val navController = rememberNavController()
    DittobnbTheme {
        OnlineExperiencesScreen(navController)
    }
}
