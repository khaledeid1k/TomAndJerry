package com.example.tomandjerry.ui.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.MidnightBlue
import com.example.tomandjerry.ui.theme.ibmPlexSans

@Composable
fun TomItemsHeader(
    modifier: Modifier = Modifier,
    title: String
) {
    Column(modifier) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            TitleOfScreen(title = title)
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    "View all",
                    color = MidnightBlue,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = ibmPlexSans
                )
                HorizontalSpacer(space = 4.dp)
                Icon(
                    painter = painterResource(id = R.drawable.arrow_right),
                    contentDescription = null,
                    tint = MidnightBlue
                )
            }
        }
    }
}