package com.dittowords.android.dittobnb

import androidx.compose.foundation.Image
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
fun BecomeAHostScreen(navController: NavController) {
    val scrollState = rememberScrollState()
    Column(
        Modifier
            .padding(horizontal = 16.dp)
            .verticalScroll(scrollState)
    ) {
        Text(
            stringResource(R.string.landing_body_join_hosts_title),
            color = Color.Black,
            fontSize = 34.sp,
            fontWeight = FontWeight.Bold
        )
        HostImage(R.drawable.hosts0)
        HostText(stringResource(R.string.landing_body_join_hosts_host_home))
        HostImage( R.drawable.hosts1)
        HostText(stringResource(R.string.landing_body_join_hosts_host_experience))
        HostImage(R.drawable.hosts2)
        HostText(stringResource(R.string.landing_body_join_hosts_host_online_experience))
    }
}

@Composable
private fun HostText(text: String) {
    Text(
        text,
        Modifier.padding(top = 4.dp, bottom = 8.dp),
        color = Color.Black,
        fontSize = 17.sp,
        fontWeight = FontWeight.SemiBold
    )
}

@Composable
private fun HostImage(imageID: Int) {
    Image(
        painter = painterResource(id = imageID),
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp)),
        contentScale = ContentScale.Fit
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewBecomeAHostScreen() {
    val navController = rememberNavController()
    DittobnbTheme {
        BecomeAHostScreen(navController)
    }
}
