package com.example.travmore

import DetailsCard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.travmore.ui.theme.GreySurface
import com.example.travmore.ui.theme.TravMoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravMoreTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = GreySurface
                ) {
                    DetailsCard()
                }
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