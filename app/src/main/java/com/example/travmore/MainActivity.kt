package com.example.travmore

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.travmore.ui.theme.TravMoreTheme
import okhttp3.OkHttpClient
import okhttp3.Request

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravMoreTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomePage()
                }
                val client = OkHttpClient()
                val request = Request.Builder()
                    .url("https://travel-places.p.rapidapi.com/")
                    .post(null)
                    .addHeader("X-RapidAPI-Key", "SIGN-UP-FOR-KEY")
                    .addHeader("X-RapidAPI-Host", "travel-places.p.rapidapi.com")
                    .build()

                val response = client.newCall(request).execute()
                Log.v("response", response.toString())
            }
        }
    }
}

@Composable
fun HomePage() {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TravMoreTheme {
        HomePage()
    }
}