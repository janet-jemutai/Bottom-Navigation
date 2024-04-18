package com.jemutai.bottomnav.navigation

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItems(
    val  title: String,
    val  icon: ImageVector,
    val  route:String
)


val  listOfItems = listOf(
    NavItems(
        title = "Home",
        icon = Icons.Rounded.Home,
        route = Screens.HomeScreen.name
    ),
    NavItems(
        title = "Profile",
        icon = Icons.Rounded.Person,
        route = Screens.ProfileScreen.name
    ),
    NavItems(
        title = "Settings",
        icon = Icons.Rounded.Settings,
        route = Screens.SettingsScreen.name
    )
)
