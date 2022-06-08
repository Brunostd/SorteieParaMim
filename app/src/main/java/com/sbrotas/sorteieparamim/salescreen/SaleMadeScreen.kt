package com.sbrotas.sorteieparamim.salescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toBitmap
import androidx.navigation.NavHostController
import com.himanshoe.kalendar.common.KalendarSelector
import com.himanshoe.kalendar.common.KalendarStyle
import com.himanshoe.kalendar.common.theme.Grid
import com.himanshoe.kalendar.common.theme.KalendarShape
import com.himanshoe.kalendar.common.theme.KalendarShape.ButtomCurvedShape
import com.himanshoe.kalendar.ui.Kalendar
import com.himanshoe.kalendar.ui.KalendarType
import com.sbrotas.sorteieparamim.R
import java.time.LocalDate

@Composable
fun SaleMadeScreen(navController: NavHostController) {

    Column {
        Calendario()
        DiaDaCompra()
    }
}

@Composable
fun Calendario(){
    val context = LocalContext.current
    val (w, h) = with(LocalDensity.current) {
        120.dp.roundToPx() to 120.dp.roundToPx()
    }
    val image = remember {
        ContextCompat.getDrawable(context, R.drawable.circle_shape)?.toBitmap(w, h)?.asImageBitmap()!!
    }

    Box(
        Modifier
            .fillMaxWidth()
            .padding(top = 100.dp)
    ) {
        Image(
            image,
            contentDescription = "Faq card 1",
            modifier = Modifier
                .align(Alignment.Center)
        )
        Image(
            painterResource(id = R.drawable.ic_baseline_date_range_24),
            contentDescription = "Faq card 1",
            modifier = Modifier
                .align(Alignment.Center)
                .size(70.dp)
        )
    }

}

@Composable
fun DiaDaCompra(){

    var kalendar = KalendarStyle(
        kalendarBackgroundColor = Color.White
    )

    Column() {
        Kalendar(
            kalendarType = KalendarType.Firey(),
            kalendarStyle = kalendar,
            onCurrentDayClick = { day, event ->

        }, errorMessage = {

        })
    }
}
