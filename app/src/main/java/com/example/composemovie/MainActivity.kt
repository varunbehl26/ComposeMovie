package com.example.composemovie

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composemovie.ui.theme.ComposeMovieTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMovieTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MovieItem("Android")
                }
            }
        }
    }
}

@Composable
fun MovieItem(name: String) {
    Row(modifier = Modifier.padding(4.dp)) {
        val image: Painter = painterResource(id = R.drawable.ic_launcher_foreground)
        Image(painter = image, contentDescription = "")

        Column(modifier = Modifier.padding(12.dp)) {
            Text(text = "Scenes from a Marriage")
            Spacer(modifier = Modifier.padding(4.dp))
            Row() {
                Text(text = "2021")
                Spacer(modifier = Modifier.padding(4.dp))
                Text(text = "5 eps")
                Spacer(modifier = Modifier.padding(4.dp))
                Text(text = "TV-MA")
            }
            Spacer(modifier = Modifier.padding(4.dp))
            Row() {
                Text(text = "*")
                Spacer(modifier = Modifier.padding(4.dp))
                Text(text = "8.1")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeMovieTheme {
        MovieItem("Android")
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DefaultPreviewNight() {
    ComposeMovieTheme {
        MovieItem("Android")
    }
}