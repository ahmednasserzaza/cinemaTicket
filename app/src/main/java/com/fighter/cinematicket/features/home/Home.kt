package com.fighter.cinematicket.features.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import com.fighter.cinematicket.R
import com.fighter.cinematicket.composable.BookingFilter
import com.fighter.cinematicket.composable.FilledChip
import com.fighter.cinematicket.composable.HomeTime
import com.fighter.cinematicket.composable.LargeMovieName
import com.fighter.cinematicket.composable.OutLinedChip
import com.fighter.cinematicket.ui.theme.White
import com.google.accompanist.pager.ExperimentalPagerApi

@Composable
fun HomeScreen(viewModel: HomeViewModel = hiltViewModel()) {
    val state by viewModel.state.collectAsState()
    HomeContent(state , viewModel::updateCurrentImage)
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun HomeContent(state: HomeUiState , updateCurrentImage: (String) -> Unit ) {
    Column(
        Modifier
            .fillMaxSize()
            .background(White)
    ) {
        Box(Modifier.fillMaxHeight(0.65f)) {
            Image(
//                rememberAsyncImagePainter(model = state.currentImage)
                painter = painterResource(id = R.drawable.poster_image),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.7f)
                    .blur(50.dp, edgeTreatment = BlurredEdgeTreatment.Unbounded)
            )
            Column(Modifier.fillMaxHeight(1f)) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    FilledChip(text = stringResource(R.string.now_showing))
                    OutLinedChip(text = stringResource(R.string.coming_soon))
                }

                AutoSliding(state.images){ currentImage ->
                    updateCurrentImage(currentImage)
                }
            }

        }

        Column(modifier = Modifier
            .fillMaxSize()
            .weight(1f)) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp, bottom = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                HomeTime(time = "1h 21m", painter = painterResource(id = R.drawable.icon_time))
            }

            LargeMovieName(text = stringResource(id = R.string.movie_large_name))
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(
                    space = 16.dp,
                    alignment = Alignment.CenterHorizontally
                )
            ) {
                BookingFilter(text = stringResource(R.string.filter_one))
                BookingFilter(text = stringResource(R.string.filter_two))
            }
        }

    }
}

@Preview
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}