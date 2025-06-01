package com.example.tomandjerry.ui.screens.SecretEpisodes.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.composables.VerticalSpacer
import com.example.tomandjerry.ui.theme.ScrimDark87
import com.example.tomandjerry.ui.theme.darkGray60
import com.example.tomandjerry.ui.theme.ibmPlexSans

@Composable
fun InfoSecretEpisodes(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .padding(top = 8.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier
                .wrapContentHeight()
                .weight(2f),
        ) {
            Text(
                text = "Deleted episodes of Tom and Jerry!",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = ibmPlexSans,
                color = ScrimDark87
            )
            VerticalSpacer(space = 8.dp)
            Text(
                text = "Scenes that were canceled for... mysterious (and sometimes embarrassing) reasons.",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 4,
                fontFamily = ibmPlexSans,
                color = darkGray60
            )
        }
        Image(
            modifier = Modifier
                .weight(1f)
                .size(width = 112.dp, height = 178.dp),
            painter = painterResource(id = R.drawable.tom_and_jerry1),
            contentDescription = null

        )
    }
}