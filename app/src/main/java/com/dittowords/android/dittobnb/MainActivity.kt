package com.dittowords.android.dittobnb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination.Companion.hierarchy
import com.dittowords.android.dittobnb.ui.theme.DittobnbTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DittobnbTheme() {
                AppMainScreen()
            }
        }
    }
}

sealed class Screen(val route: String, @StringRes val resourceId: Int, val icon: ImageVector) {
    object Activities : Screen("activities", R.string.mobile_navbar_activities, Icons.Filled.Person)
    object Host : Screen("host", R.string.mobile_navbar_host, Icons.Filled.Home)
    object Online : Screen("online", R.string.mobile_navbar_online, Icons.Filled.LocationOn)
    object Places : Screen("places", R.string.mobile_navbar_places, Icons.Filled.List)
}

val items = listOf(
    Screen.Activities,
    Screen.Host,
    Screen.Online,
    Screen.Places
)

@Composable
fun AppMainScreen() {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                title = {},
                navigationIcon = {
                    IconButton(
                        onClick = {

                            scope.launch {
                                scaffoldState.drawerState.open()
                            }
                        },
                    ) {
                        Icon(
                            Icons.Rounded.Menu,
                            contentDescription = ""
                        )
                    }
                },
                backgroundColor = Color.White
            )
        },
        drawerContent = { Drawer(onDestinationClicked = {
            scope.launch {
                scaffoldState.drawerState.close()
            }
        }) },
        bottomBar = {
            BottomNavigation(
                backgroundColor = Color.White
            ) {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination
                items.forEach { screen ->
                    BottomNavigationItem(
                        icon = { Icon(screen.icon, contentDescription = null) },
                        label = { Text(stringResource(screen.resourceId)) },
                        selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                        onClick = {
                            navController.navigate(screen.route) {
                                // Pop up to the start destination of the graph to
                                // avoid building up a large stack of destinations
                                // on the back stack as users select items
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                // Avoid multiple copies of the same destination when
                                // reselecting the same item
                                launchSingleTop = true
                                // Restore state when reselecting a previously selected item
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    ) {
        NavHost(navController, startDestination = Screen.Activities.route, Modifier.padding(it)) {
            composable(Screen.Activities.route) { ActivitiesScreen(navController) }
            composable(Screen.Host.route) { BecomeAHostScreen(navController = navController) }
            composable(Screen.Online.route) { OnlineExperiencesScreen(navController = navController) }
            composable(Screen.Places.route) { PlacesToStayScreen(navController = navController) }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DittobnbTheme {
        AppMainScreen()
    }
}


//    Surface(color = MaterialTheme.colors.background) {
//        val drawerState = rememberDrawerState(DrawerValue.Closed)
//        val scope = rememberCoroutineScope()
//        val openDrawer = {
//            scope.launch {
//                drawerState.open()
//            }
//        }
//        ModalDrawer(
//            drawerState = drawerState,
//            gesturesEnabled = drawerState.isOpen,
//            drawerContent = {
//                Drawer(
//                    onDestinationClicked = { route ->
//                        scope.launch {
//                            drawerState.close()
//                        }
//                        navController.navigate(route) {
//                            popUpTo = navController.graph.startDestinationId
//                            launchSingleTop = true
//                        }
//                    }
//                )
//            }
//        ) {
//            NavHost(
//                navController = navController,
//                startDestination = DrawerScreens.Activities.route
//            ) {
//                composable(DrawerScreens.Activities.route) {
//                    Activities(
//                        openDrawer = {
//                            openDrawer()
//                        }
//                    )
//                }
//                composable(DrawerScreens.BecomeAHost.route) {
//                    BecomeAHost(
//                        openDrawer = {
//                            openDrawer()
//                        }
//                    )
//                }
//                composable(DrawerScreens.OnlineExperiences.route) {
//                    OnlineExperiences(
//                        openDrawer = {
//                            openDrawer()
//                        }
//                    )
//                }
//                composable(DrawerScreens.PlacesToStay.route) {
//                    PlacesToStay(
//                        openDrawer = {
//                            openDrawer()
//                        }
//                    )
//                }
//            }
//        }
//    }