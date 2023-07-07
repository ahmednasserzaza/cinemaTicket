package com.fighter.cinematicket.screens.tickets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.fighter.cinematicket.R
import com.fighter.cinematicket.composable.CinemaScreen
import com.fighter.cinematicket.composable.CinemaSeats
import com.fighter.cinematicket.composable.ExitPainter
import com.fighter.cinematicket.composable.ItemDate
import com.fighter.cinematicket.composable.ItemTime
import com.fighter.cinematicket.composable.PrimaryButton
import com.fighter.cinematicket.composable.SeatsGraphItem
import com.fighter.cinematicket.navigation.navigateToHomeScreen
import com.fighter.cinematicket.ui.theme.Black
import com.fighter.cinematicket.ui.theme.Gray
import com.fighter.cinematicket.ui.theme.OpenSans
import com.fighter.cinematicket.ui.theme.Orange
import com.fighter.cinematicket.ui.theme.White

@Composable
fun TicketScreen(
    navController: NavHostController,
    viewModel: TicketViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    TicketContent(
        state = state,
        onClickByTicketButton = { navigateToHomeScreen(navController) }
    )
}

@Composable
fun TicketContent(
    state: TicketUiState,
    onClickByTicketButton: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Black)
    ) {
        Column {
            ExitPainter(
                primaryPainter = painterResource(id = R.drawable.icon_exit),
                modifier = Modifier.padding(16.dp)
            )
            CinemaScreen(painter = painterResource(id = R.drawable.cinema_screen))
            CinemaSeats()
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                SeatsGraphItem(text = stringResource(R.string.available), color = White)
                SeatsGraphItem(text = stringResource(R.string.taken), color = Gray)
                SeatsGraphItem(text = stringResource(R.string.selected), color = Orange)
            }
        }

        Card(
            shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp),
            colors = CardDefaults.cardColors(containerColor = White),
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {

            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                items(state.dates) { ItemDate(it, {}) }
            }

            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(state.times) { ItemTime(it) }
            }

            Spacer(modifier = Modifier.weight(1f))

            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = "$100.00",
                        fontFamily = OpenSans,
                        fontWeight = FontWeight.Medium,
                        fontSize = 24.sp,
                    )
                    Text(
                        text = "4 Tickets",
                        color = Gray,
                        fontFamily = OpenSans,
                        fontWeight = FontWeight.Normal
                    )
                }
                PrimaryButton(
                    painter = painterResource(id = R.drawable.icon_bocking),
                    text = stringResource(R.string.buy_tickets),
                    onClick = onClickByTicketButton
                )
            }
        }

    }
}

@Preview
@Composable
fun PreviewTicket() {
    TicketScreen(navController = NavHostController(LocalContext.current))
}