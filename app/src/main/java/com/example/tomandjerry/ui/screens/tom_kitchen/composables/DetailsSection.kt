package com.example.tomandjerry.ui.screens.tom_kitchen.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.composables.VerticalSpacer
import com.example.tomandjerry.ui.theme.DeepSlate
import com.example.tomandjerry.ui.theme.ibmPlexSans

@Composable
fun DetailsSection() {

    Text(
        "Details",
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium,
        fontFamily = ibmPlexSans,
        color = DeepSlate,
    )
    VerticalSpacer(space = 8.dp)


    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        DetailCard(
            modifier = Modifier.weight(1f),
            icon = R.drawable.temperature,
            title = "1000 V",
            description = "Temperature "
        )
        DetailCard(
            modifier = Modifier.weight(1f),
            icon = R.drawable.time,
            title = "3 sparks",
            description = "Time"
        )
        DetailCard(
            modifier = Modifier.weight(1f),
            icon = R.drawable.face,
            title = "1M 12K",
            description = "No. of deaths"
        )
    }
    VerticalSpacer(space = 24.dp)
    Text(
        "Preparation method",
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium,
        fontFamily = ibmPlexSans,
        color = DeepSlate,
    )
    VerticalSpacer(space = 8.dp)

}