package com.fighter.cinematicket.features.booking

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.fighter.cinematicket.R
import com.fighter.cinematicket.composable.ActorItem
import com.fighter.cinematicket.composable.BookingFilter
import com.fighter.cinematicket.composable.LargeMovieName
import com.fighter.cinematicket.composable.LongText
import com.fighter.cinematicket.composable.PlayPainter
import com.fighter.cinematicket.composable.PosterImage
import com.fighter.cinematicket.composable.PrimaryButton
import com.fighter.cinematicket.composable.TextBookingHeader
import com.fighter.cinematicket.composable.TopAppBar
import com.fighter.cinematicket.ui.theme.Black
import com.fighter.cinematicket.ui.theme.OpenSans
import com.fighter.cinematicket.ui.theme.White

@Composable
fun BookingScreen(
    viewModel: BookingViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    BookingContent(state)
}

@Composable
fun BookingContent(state: BookingUiState) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                PosterImage(painter = painterResource(id = R.drawable.poster_image))
                PlayPainter(painter = painterResource(id = R.drawable.icon_play))
            }
            TopAppBar(
                primaryPainter = painterResource(id = R.drawable.icon_exit),
                secondaryPainter = painterResource(id = R.drawable.icon_time),
                secondaryPainterText = "2h 32m"
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .offset(y = (-24).dp),
                colors = CardDefaults.cardColors(containerColor = White),
                shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)

            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 24.dp, horizontal = 24.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    TextBookingHeader("6.8", "IMDb", " /10")
                    TextBookingHeader("63%", "IMDb")
                    TextBookingHeader("4", "IGN", "/10")
                }
                LargeMovieName(text = stringResource(R.string.movie_large_name))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(
                        space = 16.dp,
                        alignment = Alignment.CenterHorizontally
                    )
                ) {
                    BookingFilter(text = stringResource(R.string.filter_one))
                    BookingFilter(text = stringResource(R.string.filter_two))
                }

                LazyRow(
                    contentPadding = PaddingValues(horizontal = 16.dp)
                ) {
                    items(state.actorsImages) {
                        ActorItem(state = it)
                    }
                }
                LongText(text = stringResource(R.string.actor_description))
                Row(
                    Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    PrimaryButton(
                        painter = painterResource(id = R.drawable.icon_bocking),
                        text = stringResource(R.string.booking)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewBooking() {
    BookingScreen()
}