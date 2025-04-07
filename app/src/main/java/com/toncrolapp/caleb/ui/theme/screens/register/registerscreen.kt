package com.toncrolapp.caleb.ui.theme.screens.register


import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.toncrolapp.caleb.navigation.ROUTE_LOGIN


@SuppressLint("RememberReturnType")
@Composable
fun Register_screen(navController: NavHostController) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    var firstname by remember { mutableStateOf(TextFieldValue("")) }
    var lastname by remember { mutableStateOf(TextFieldValue("")) }
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent)) {
        Text(text = "Register",
            fontSize = 35.sp,
            color = Color.Red,
            fontFamily = FontFamily.Monospace
        )
        OutlinedTextField(value =  firstname ,
            onValueChange = {firstname=it},
            label = { Text(text = "First Name",
                fontFamily = FontFamily.Monospace,
                color = Color.Black)},
            leadingIcon = { Icon(Icons.Default.Person,
                contentDescription = "First Name",) },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)
        )
        OutlinedTextField(value =  lastname ,
            onValueChange = {lastname=it},
            label = { Text(text = "Last Name",
                fontFamily = FontFamily.Monospace,
                color = Color.Black)},
            leadingIcon = { Icon(Icons.Default.Person,
                contentDescription = "Last Name",) },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)
        )
        OutlinedTextField(value =  email ,
            onValueChange = {email=it},
            label = { Text(text = "Enter Email",
                fontFamily = FontFamily.Monospace,
                color = Color.Black)},
            leadingIcon = { Icon(Icons.Default.Email,
                contentDescription = "Email",) },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)
        )
        OutlinedTextField(value =  password ,
            onValueChange = {password=it},
            label = { Text(text = "Enter Password",
                fontFamily = FontFamily.Monospace,
                color = Color.Black)},
            leadingIcon = { Icon(Icons.Default.Lock,
                contentDescription = "Password") },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp) )
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = { /*TODO*/},
            modifier = Modifier.width(300.dp)) {
            Text(text = "Register",
                fontSize = 30.sp,
                fontFamily = FontFamily.Serif
            )
        }
        Text(text = "Already have an account",
            fontSize = 15.sp,
            fontFamily = FontFamily.Monospace)
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Login",
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Black,
                    offset = Offset(5f, 5f),
                    blurRadius = 5f
                )
            ),
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            textDecoration = TextDecoration.Underline,
            fontFamily = FontFamily.Default,
            modifier = Modifier.clickable{ navController.navigate(ROUTE_LOGIN) })


    }

}

@Preview
@Composable
private fun Register_page() {
    Register_screen(rememberNavController())
}