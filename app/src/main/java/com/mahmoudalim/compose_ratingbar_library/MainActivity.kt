package com.mahmoudalim.compose_ratingbar_library

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.mahmoudalim.compose_rating_bar.RatingBarView
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



