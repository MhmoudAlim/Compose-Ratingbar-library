package com.mahmoudalim.compose_ratingbar_library

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.mutableStateOf
import com.mahmoudalim.compose_ratingbar_library.ui.theme.ComposeRatingbarlibraryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeRatingbarlibraryTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    RatingBarView(
                        rating = mutableStateOf(4),
                        isRatingEditable = true,
                        isViewAnimated = false,
                    )
                }
            }
        }
    }
}



