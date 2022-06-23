package com.dittowords.android.dittobnb

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dittowords.android.dittobnb.ui.theme.DittobnbTheme

@Composable
fun Drawer(modifier: Modifier = Modifier, onDestinationClicked: (route: String) -> Unit) {
    val scrollState = rememberScrollState()

    Column(
        modifier
            .fillMaxSize()
            .padding(start = 24.dp, top = 24.dp)
            .clickable {
                onDestinationClicked("")
            }
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "App icon"
        )

        TitleItem(Icons.Rounded.Star, stringResource(R.string.footer_about_title))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            SubtitleItem(stringResource(R.string.footer_about_blog))
            SubtitleItem(stringResource(R.string.footer_about_press))
        }
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            SubtitleItem(stringResource(R.string.footer_about_company))
            SubtitleItem(stringResource(R.string.footer_about_careers))
        }
        TitleItem(Icons.Rounded.Person, stringResource(R.string.footer_community_title))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            SubtitleItem(stringResource(R.string.footer_community_accessibility))
            SubtitleItem(stringResource(R.string.footer_community_guests))
        }
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            SubtitleItem(stringResource(R.string.footer_community_invite))
            SubtitleItem(stringResource(R.string.footer_community_share))
        }
        TitleItem(Icons.Rounded.Home, stringResource(R.string.footer_host_title))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            SubtitleItem(stringResource(R.string.landing_body_join_hosts_host_home))
            SubtitleItem(stringResource(R.string.landing_body_join_hosts_host_experience))
        }
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            SubtitleItem(stringResource(R.string.landing_body_join_hosts_host_online_experience))
            SubtitleItem(stringResource(R.string.footer_host_refer))
        }
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            SubtitleItem(stringResource(R.string.footer_host_resources))
            Spacer(Modifier.width(150.dp))
        }
        TitleItem(Icons.Rounded.MailOutline, stringResource(R.string.footer_host_title))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            SubtitleItem(stringResource(R.string.footer_support_help))
            SubtitleItem(stringResource(R.string.footer_support_trust_safety))
        }
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            SubtitleItem(stringResource(R.string.footer_support_cancellation))
            Spacer(Modifier.width(150.dp))
        }
    }
}

@Composable
private fun TitleItem(icon: ImageVector, title: String) {
    Row() {
        Icon(
            icon,
            contentDescription = ""
        )
        Text(
            title,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun SubtitleItem(title: String) {
    Text(
        title,
        Modifier.width(150.dp),
        textAlign = TextAlign.Left,
        fontSize = 17.sp,
        fontWeight = FontWeight.SemiBold
    )
}

@Preview
@Composable
fun DrawerPreview() {
    DittobnbTheme {
        Drawer {}
    }
}