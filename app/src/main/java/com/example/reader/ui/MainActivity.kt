package com.example.reader.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.domain.MyClass
import com.example.reader.ui.screens.MainScreenContent
import com.example.reader.ui.theme.ReaderTheme
import org.koin.android.ext.android.get

class MainActivity : ComponentActivity() {

     val myClass : MyClass = get()

    override fun onResume() {
        super.onResume()
        Log.i("ASDJHAKSHDASD", "${myClass.a}")
        Log.i("ASDJHAKSHDASD", "dfasdf")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ASDJHAKSHDASD", "${myClass.a}")
        setContent {
            myClass.a
            ReaderTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    MainScreenContent()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ReaderTheme {
        Greeting("Android")
    }
}