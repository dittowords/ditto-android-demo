package com.dittowords.android.dittobnb

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.dittowords.android.dittobnb.ui.theme.DittobnbTheme

@Composable
fun ActivitiesScreen(navController: NavController) {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.Red), contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.hero),
            contentDescription = "Hero image of mountain",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            Modifier.padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(
                stringResource(R.string.landing_hero_title),
                modifier = Modifier.padding(top = 50.dp),
                color = Color.White,
                fontSize = 34.sp,
                fontWeight = FontWeight.Black
            )
            Text(
                stringResource(R.string.landing_hero_subtitle),
                color = Color.White,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
            ) {
                Text(
                    stringResource(R.string.landing_hero_cta),
                    modifier = Modifier.padding(4.dp),
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewActivitiesScren() {
    val navController = rememberNavController()
    DittobnbTheme {
        ActivitiesScreen(navController)
    }
}
