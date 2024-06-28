package com.example.reader.ui

import android.os.Bundle
import android.util.Log
import android.widget.Toast
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
import com.example.reader.di.TestClass
import com.example.reader.ui.screens.MainScreenContent
import com.example.reader.ui.theme.ReaderTheme
import org.koin.android.ext.android.get

class MainActivity : ComponentActivity() {

     val myClass : TestClass = get()

    override fun onResume() {
        super.onResume()
        Log.i("ASDJHAKSHDASD", "${myClass.b}")

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "HOHOHOHO", Toast.LENGTH_SHORT).show()
        setContent {
            ReaderTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    MainScreenContent(myClass)
                    Log.i("ASDJHAKSHDASD", "dfasdf")
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