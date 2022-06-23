package com.dittowords.android.dittobnb

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
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
fun PlacesToStayScreen(navController: NavController) {
    val scrollState0 = rememberScrollState()
    val scrollState1 = rememberScrollState()
    val scrollState2 = rememberScrollState()
    val scrollState3 = rememberScrollState()
    val scrollState4 = rememberScrollState()
    Column(
        Modifier
            .verticalScroll(scrollState0),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Text(
            stringResource(R.string.landing_body_online_experiences_title),
            Modifier.padding(horizontal = 10.dp),
            color = Color.Black,
            fontSize = 34.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            stringResource(R.string.landing_body_live_anywhere_entire_homes),
            Modifier.padding(horizontal = 10.dp),
            color = Color.Black,
            fontSize = 17.sp,
            fontWeight = FontWeight.SemiBold
        )
        Row(
            Modifier
                .horizontalScroll(scrollState1)
                .offset(x = 10.dp)
                .padding(end = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            HouseImage(R.drawable.live_anywhere0)
            HouseImage(R.drawable.live_anywhere0)
            HouseImage(R.drawable.live_anywhere0)
            HouseImage(R.drawable.live_anywhere0)
        }

        Text(
            stringResource(R.string.landing_body_live_anywhere_cabins_and_cottages),
            Modifier.padding(horizontal = 10.dp),
            color = Color.Black,
            fontSize = 17.sp,
            fontWeight = FontWeight.SemiBold
        )
        Row(
            Modifier
                .horizontalScroll(scrollState2)
                .offset(x = 10.dp)
                .padding(end = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            HouseImage(R.drawable.live_anywhere1)
            HouseImage(R.drawable.live_anywhere1)
            HouseImage(R.drawable.live_anywhere1)
            HouseImage(R.drawable.live_anywhere1)
        }

        Text(
            stringResource(R.string.landing_body_live_anywhere_unique_stays),
            Modifier
                .padding(horizontal = 10.dp),
            color = Color.Black,
            fontSize = 17.sp,
            fontWeight = FontWeight.SemiBold
        )
        Row(
            Modifier
                .horizontalScroll(scrollState3)
                .offset(x = 10.dp)
                .padding(end = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            HouseImage(R.drawable.live_anywhere2)
            HouseImage(R.drawable.live_anywhere2)
            HouseImage(R.drawable.live_anywhere2)
            HouseImage(R.drawable.live_anywhere2)
        }

        Text(
            stringResource(R.string.landing_body_live_anywhere_pets_welcome),
            Modifier.padding(horizontal = 10.dp),
            color = Color.Black,
            fontSize = 17.sp,
            fontWeight = FontWeight.SemiBold
        )
        Row(
            Modifier
                .horizontalScroll(scrollState4)
                .offset(x = 10.dp)
                .padding(end = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            HouseImage(R.drawable.live_anywhere3)
            HouseImage(R.drawable.live_anywhere3)
            HouseImage(R.drawable.live_anywhere3)
            HouseImage(R.drawable.live_anywhere3)
        }
    }
}

@Composable
private fun HouseImage(imageID: Int) {
    Image(
        painter = painterResource(id = imageID),
        contentDescription = null,
        modifier = Modifier
            .height(250.dp)
            .clip(RoundedCornerShape(10.dp)),
        contentScale = ContentScale.Fit
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewPlacesToStayScreen() {
    val navController = rememberNavController()
    DittobnbTheme {
        PlacesToStayScreen(navController)
    }
}
