package com.mahmoudalim.compose_ratingbar_library

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoudalim.compose_rating_bar.RatingBarView
import com.mahmoudalim.compose_ratingbar_library.ui.theme.ComposeRatingbarlibraryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeRatingbarlibraryTheme {
                Surface(
                    color = MaterialTheme.colors.background,
                    modifier = Modifier.padding(16.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.spacedBy(24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Compose RatingBar",
                            style = TextStyle(
                                color = Color.DarkGray,
                                fontSize = 24.sp,
                                fontFamily = FontFamily.Serif
                            )
                        )

                        RatingBarView(
                            rating = mutableStateOf(0),
                            isRatingEditable = true,
                            isViewAnimated = true,
                            ratedStarsColor = Color(255, 220, 0),
                            starIcon = painterResource(id = R.drawable.ic_star_shade),
                            unRatedStarsColor = Color.LightGray
                        )
                    }
                }
            }
        }
    }
}



