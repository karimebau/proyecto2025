package com.example.proyecto2025

import android.content.Context
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyecto2025.ui.theme.Proyecto2025Theme
import com.google.android.gms.wearable.CapabilityClient
import com.google.android.gms.wearable.CapabilityInfo
import com.google.android.gms.wearable.DataClient
import com.google.android.gms.wearable.DataEventBuffer
import com.google.android.gms.wearable.MessageClient
import com.google.android.gms.wearable.MessageEvent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope

import okhttp3.OkHttpClient
import okhttp3.Request


class MainActivity : AppCompatActivity(),
CoroutineScope by MainScope(),
DataClient.OnDataChangedListener,
    MessageClient.OnMessageReceivedListener,
        CapabilityClient.OnCapabilityChangedListener
{

    lateinit var conectar: Button
    var activityContext: Context?=null
    private var deviceConnected: Boolean=false;
    private val PAYLOAD_PATH="APP_OPEN"
    lateinit var nodeID: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activityContext=this
        conectar=findViewById(R.id.boton)

        conectar.setOnClickListener {
            if(!deviceConnected){
        }
    }
    }
    override fun onDataChanged(p0: DataEventBuffer) {

    }

    override fun onMessageReceived(p0: MessageEvent) {
    }

    override fun onCapabilityChanged(p0: CapabilityInfo) {
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
    Proyecto2025Theme {
        Greeting("Android")
    }
}