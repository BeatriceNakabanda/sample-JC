package com.www.samplejetpack

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.www.samplejetpack.ui.theme.SampleJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(){
//    Text(text = "Hello World")
    Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally){
        Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(2.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Button(onClick ={ Log.e("Main screen","Button clicked")}){
                Text(text = "Click me 1")
            }
            Button(onClick ={ Log.e("Main screen","Button clicked")}){
                Text(text = "Click me 2")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    MainScreen()
}

