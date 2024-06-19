package com.nicnicdev.appdog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nicnicdev.appdog.ui.DogCard
import com.nicnicdev.appdog.ui.home.HomeViewModel
import com.nicnicdev.appdog.ui.theme.AppDogTheme
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel = koinViewModel<HomeViewModel>()
            val state = viewModel.homeState.collectAsState()

            LaunchedEffect(key1 = Unit) {
                viewModel.getDogImage()
            }

                AppDogTheme {
                    HomeContent(
                        imageUrl = state.value.dogImageUrl
                    )
                }
            }
        }


        @Composable
        private fun HomeContent(
            imageUrl: String,
        ) {
            Column {
                DogCard(url = imageUrl)
            }
        }
    }
