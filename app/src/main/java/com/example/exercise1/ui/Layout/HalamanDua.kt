package com.example.exercise1.ui.Layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.exercise1.Data.OrderUiState
import com.example.exercise1.R


@Composable
fun HalamanDua(
    orderUiState: OrderUiState,
    onBackButtonClicked: () -> Unit,
) {
    val items = listOf(
        Pair(stringResource(R.string.dosensatu), orderUiState.dosen1),
        Pair(stringResource(R.string.dosendua), orderUiState.dosen1)
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = stringResource(id = R.string.nama))
        Text(text = orderUiState.nama)
        Divider()
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = stringResource(id = R.string.nim))
        Text(text = orderUiState.nim)
        Divider()
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = stringResource(id = R.string.konsentrasi))
        Text(text = orderUiState.konsentrasi)
        Divider()
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = stringResource(id = R.string.judulskripsi))
        Text(text = orderUiState.judulskripsi)
        Divider()
        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium)).fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
        ) {}
        Row(
            modifier = Modifier
                .weight(1f, false)
                .padding(dimensionResource(R.dimen.padding_small))
        ) {
            Button(onClick = onBackButtonClicked) {
                Text(text = stringResource(id = R.string.buttonback))
            }
        }

    }

}