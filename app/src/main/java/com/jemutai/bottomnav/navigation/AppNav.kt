package com.jemutai.bottomnav.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.jemutai.bottomnav.screens.HomeScreen
import com.jemutai.bottomnav.screens.ProfileScreen
import com.jemutai.bottomnav.screens.SettingsScreen

@Composable
fun AppNav() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentDestination: NavDestination? = navBackStackEntry?.destination

            listOfItems.forEach { navItems ->



            }

        }
    ) { paddingValues ->

        NavHost(
            navController = navController, startDestination = Screens.HomeScreen.name,
            modifier = Modifier.padding(paddingValues)
        ) {

            composable(route = Screens.HomeScreen.name) {
                HomeScreen()
            }

            composable(route = Screens.SettingsScreen.name) {
                SettingsScreen()
            }
            composable(route = Screens.ProfileScreen.name) {
                ProfileScreen()
            }
        }

    }
}
