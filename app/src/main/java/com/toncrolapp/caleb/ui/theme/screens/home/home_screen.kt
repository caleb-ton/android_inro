package com.toncrolapp.caleb.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.toncrolapp.caleb.R
import com.toncrolapp.caleb.navigation.ROUTE_LOGIN
import com.toncrolapp.caleb.navigation.ROUTE_REGISTER


@Composable
fun Home_Screen(navController: NavHostController) {




    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Transparent),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        Spacer(modifier = Modifier.width(50.dp))
        Text(text = "Caiden's car app",
            color = Color.Red,
            fontSize = 50.sp,
            fontFamily = FontFamily.Cursive)
//        Spacer(modifier = Modifier.width(15.dp))
        Image(painter = painterResource(id = R.drawable.audiiq5),
            contentDescription = "Audi logo",
            modifier = Modifier
//                .border(10.dp, Color.Gray, CircleShape)
                .height(300.dp)
                .width(200.dp)
        )
        Spacer(modifier = Modifier.width(15.dp))

        Text(text = "This app allows users to create,share and engage with short videos in a dynamic social environment.",
            color = Color.Red,
            textAlign = TextAlign.Justify,
            fontSize = 25.sp,
            fontFamily = FontFamily.Serif,
            fontStyle = FontStyle.Italic,
        )

        Spacer(modifier = Modifier.width(50.dp))

        Button(onClick = { navController.navigate(ROUTE_LOGIN)},
               modifier = Modifier.width(300.dp)) {
            Text(text = "Login",
                fontFamily = FontFamily.Default,
                textDecoration = TextDecoration.Underline,
                color = Color.Magenta
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = { navController.navigate(ROUTE_REGISTER)},
            modifier = Modifier.width(300.dp)) {
            Text(text = "Register",
                textDecoration = TextDecoration.Underline,
                color = Color.Magenta
                )
        }

    }

}



@Preview
@Composable
private fun Home_prev() {
    Home_Screen(rememberNavController())
}