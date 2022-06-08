package com.sbrotas.sorteieparamim

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sbrotas.sorteieparamim.nav.Screen

@Composable
fun HomeScreen(
    navController: NavController
){

    Column(
        modifier = Modifier
            .background(Color.Black)
            .padding(start = 18.dp, top = 18.dp, end = 18.dp)
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Welcome()
        Body(navController)
    }

}

@Composable
fun Welcome(){
    var darkOrange = 0xFFFF8C00
    Row(
        modifier = Modifier.height(48.dp)
    ) {
        Image(painterResource(id = R.drawable.ic_baseline_person_24),
            contentDescription = "",
            modifier = Modifier
                .padding(end = 5.dp)
                .fillMaxHeight()
            )
        Text(
            text = "Bem vindo",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp
        )
    }
    Text(
        text = "Chefe da boca",
        color = Color.White
        )
}

@Composable
fun Body(navController: NavController) {
    Card(
        shape = AbsoluteRoundedCornerShape(15.dp),
        backgroundColor = Color.White,
        modifier = Modifier
            .padding(top = 50.dp)
            .fillMaxWidth()
            .height(100.dp)
            .clickable {
                navController.navigate(route = Screen.SaleMade.route)
            }
    ) {
        Column(
            modifier = Modifier.padding(18.dp)
        ) {
            Image(painterResource(id = R.drawable.ic_baseline_attach_money_24),
                contentDescription = "",
                modifier = Modifier.size(30.dp)
                )
            Text(
                text = "Vendas",
                color = Color.Black,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
                )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
   // HomeScreen(navController = nav)
}