package com.example.reader.ui.screens

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.koin.androidx.compose.koinViewModel

@Composable
fun MainScreenContent(context: Context, searchViewModel: SearchViewModel = koinViewModel()) {
    var text by remember { mutableStateOf("") }
    searchViewModel.testMethod()
    Surface(
        modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
    ) {
        Column {
            TextField(
                value = text,
                onValueChange = { text = it },
                modifier = Modifier
                    .padding(8.dp)
                    .background(Color.Cyan, RoundedCornerShape(8.dp))
                    .fillMaxWidth(),
                maxLines = 1,
            )
            Button(shape = RoundedCornerShape(0.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                onClick = { Toast.makeText(context, "test text", Toast.LENGTH_SHORT).show() }) {
                Text("Test 2")
            }
        }
    }
}