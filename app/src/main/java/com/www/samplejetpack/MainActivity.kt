package com.www.samplejetpack

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
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
    Row(verticalAlignment = Alignment.CenterVertically){
        Button(onClick ={ Log.e("Main screen","Button clicked")}){
            Text(text = "Click me 1")
        }
        Button(onClick ={ Log.e("Main screen","Button clicked")}){
            Text(text = "Click me 1")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    MainScreen()
}

