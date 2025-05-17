package com.example.helpme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.core_ui.ui.HelpMeTheme
import com.example.feature_main.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // enableEdgeToEdge()
        setContent {
            HelpMeTheme(darkTheme = true) {
                val viewModel: MainViewModel = hiltViewModel()

                // Just call testUseCase on launch
                LaunchedEffect(Unit) {
                    try {
                        val contacts = viewModel.log()
                        println("DI Test: Got contacts = $contacts")
                    } catch (e: Exception) {
                        println("DI Test Error: $e")
                    }
                }

                Text("DI Test Complete – Check logcat for results!")
            }
        }
    }
}


