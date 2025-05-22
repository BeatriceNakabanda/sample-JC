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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
//    var counter = 0
    //*remember makes composable remember its old state...without knowing its old state, it cant know its state has changed
    var counter = remember{ mutableStateOf(0) } //*mutableStateOf() - makes it possible for the composable to
//    listen to the changes happening to the state....Acts as a listener....composable will get notified when the
    //counter value changes
    //lambda
    var increaseCounter = {
        Log.i("MAIN SCREEN", "Counter value is ${counter.value}")
        counter.value = counter.value+1
    }
    var decreaseCounter = {
        Log.i("MAIN SCREEN", "Counter value is ${counter.value}")
        counter.value= counter.value-1
    }
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
            Button(onClick ={ decreaseCounter.invoke() }){
                Text(text = "Decrement")
            }
            Text(text = "${counter.value}")
            Button(onClick ={ increaseCounter.invoke() }){
                Text(text = "Increment")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    MainScreen()
}

