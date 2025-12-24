package com.example.simple_warikan_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.simple_warikan_app.ui.components.LabeledInputField
import com.example.simple_warikan_app.ui.theme.SimpleWarikanAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleWarikanAppTheme {
                LabeledInputField(
                    label = "金額",
                    unit = "円",
                    value = "10000",
                )
            }
        }
    }
}
