package com.fighter.cinematicket.features.booking

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
import com.fighter.cinematicket.composable.TextBookingHeader
import com.fighter.cinematicket.ui.theme.Black
import com.fighter.cinematicket.ui.theme.Gray
import com.fighter.cinematicket.ui.theme.LightWhite
import com.fighter.cinematicket.ui.theme.OpenSans
import com.fighter.cinematicket.ui.theme.Orange
import com.fighter.cinematicket.ui.theme.TransGray
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
            .background(White),
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
                Image(
                    painter = painterResource(id = R.drawable.poster_image),
                    contentDescription = "Poster image",
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
                Icon(
                    painter = painterResource(id = R.drawable.icon_play),
                    contentDescription = "icon play",
                    tint = White,
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .background(Orange)
                        .padding(12.dp)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            )
            {
                Icon(
                    painter = painterResource(id = R.drawable.icon_exit),
                    contentDescription = "icon exit",
                    tint = LightWhite,
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .background(TransGray)
                        .padding(4.dp)
                )

                Row(
                    modifier = Modifier
                        .width(80.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                        .background(TransGray)
                        .padding(4.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_time),
                        contentDescription = "icon exit",
                        tint = LightWhite,
                        modifier = Modifier.size(18.dp)
                    )
                    Text(text = "2h 32m", fontSize = 12.sp, color = LightWhite)

                }

            }

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
                LargeMovieName(text = "Fantastic Beats , The Secret of Dumbledore")

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
                    BookingFilter(text = "Fantasy")
                    BookingFilter(text = "Adventure")
                }

                LazyRow(
                    contentPadding = PaddingValues(horizontal = 16.dp)
                ) {
                    items(state.actorsImages) {
                        ActorItem(state = it)
                    }
                }
                Text(
                    text = stringResource(R.string.actor_description),
                    fontSize = 12.sp,
                    fontFamily = OpenSans,
                    color = Black,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(16.dp)
                )
                Row(
                    Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = Orange),
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.icon_bocking),
                            contentDescription = "icon booking",
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                        )
                        Text(text = "Booking")
                    }
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