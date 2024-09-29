package com.example.rusheshnikova22101

import android.annotation.SuppressLint
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.rusheshnikova22101.ui.theme.Rusheshnikova22101Theme
import android.os.Bundle as Bundle1


class MainActivity : ComponentActivity() {
    private fun onCreate(bundle: Bundle1?, function: () -> Unit) {
        TODO("Not yet implemented")
    }

    @SuppressLint("MissingSuperCall")
    override fun onCreate(savedInstanceState: Bundle1?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


            setContent {
                Rusheshnikova22101Theme {
                    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        Greeting(
                            name = "Rusheshnikova22.101",
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                }
            }
        }
    }

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = " $name",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Rusheshnikova22101Theme {
        Greeting("Rusheshnikova22.101")
    }
}