package com.sbrotas.sorteieparamim.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sbrotas.sorteieparamim.HomeScreen
import com.sbrotas.sorteieparamim.salescreen.SaleMadeScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ){
        composable(
            route = Screen.Home.route
        ){
            HomeScreen(
                navController
            )
        }
        composable(
            route = Screen.SaleMade.route
        ){
            SaleMadeScreen(
                navController
            )
        }
    }
}