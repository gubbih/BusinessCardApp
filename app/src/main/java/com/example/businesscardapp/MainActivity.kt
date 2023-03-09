package com.example.businesscardapp

import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material.Icon
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    FullPage()
                }
            }
        }
    }
}

@Composable
fun FullPage() {
    Column(

        modifier = Modifier
            .fillMaxWidth()
            .background(DarkGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row() {
            painterResource(R.drawable.android_logo)
            FixValues("Thor Lund Hansen","Big Brain Programer")
        }
        Row() {
            ContactInfo(Icons.Rounded.Phone, "+45 30 48 18 11")

        }
        Row() {
            ContactInfo(Icons.Rounded.Email, "Thorlhansen@hotmail.com")

        }
        Row() {
            ContactInfo(Icons.Rounded.Notifications, "@Thor.Nado.Hansen")

        }

        
    }
}
@Composable
fun FixValues(fullName: String, title: String, modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .padding(16.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row() {
            Image(
                painterResource(R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                )
        }
        Row() {
            Text(
                text = fullName,
                textAlign = TextAlign.Justify,
                fontSize = 32.sp
            )
        }
        Row() {
            Text(
                text = title
            )
        }
    }
}

@Composable
fun ContactInfo(icon: ImageVector, text: String){
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start
    ) {
        Row() {
            Icon(
                icon,
                contentDescription = null
            )
            Text(
                text = text,
                textAlign = TextAlign.Start
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardAppTheme {
        FullPage()
    }
}