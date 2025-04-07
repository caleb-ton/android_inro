package com.toncrolapp.caleb.ui.theme.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.toncrolapp.caleb.R
import com.toncrolapp.caleb.navigation.ROUTE_HOME
import kotlinx.coroutines.delay


@Composable
fun Splash_screen(nanConroller: NavHostController) {
    LaunchedEffect(Unit) {
        delay(timeMillis = 3000)    //splash screen duration
        nanConroller.navigate(ROUTE_HOME)//Navigate to home screen after delay
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        //splash screen content(logo/image)
        Image(
            painterResource(id = R.drawable.audilogo),
            contentDescription = "Splash screen logo",
            modifier = Modifier.size(150.dp)

            )
    }
}