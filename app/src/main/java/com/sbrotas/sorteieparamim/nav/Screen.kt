package com.sbrotas.sorteieparamim.nav

sealed class Screen(val route: String){
    object Home: Screen(route = "home_screen")
    object SaleMade: Screen(route = "salemade_screen")
}
