package com.example.tomandjerry.ui.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.example.tomandjerry.ui.theme.AzureishWhite
import com.example.tomandjerry.ui.theme.MediumElectricBlue
import com.example.tomandjerry.ui.theme.ibmPlexSans

@Composable
fun CheesesItem(
    modifier: Modifier = Modifier,
    price: String
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = AzureishWhite,

            ),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier.padding(
                    top = 7.dp,
                    bottom = 7.dp,
                    start = 10.dp,
                    end = 4.dp
                ),
                painter = painterResource(id = R.drawable.money_bag),
                contentDescription = null,
                tint = MediumElectricBlue

            )
            Text(
                text = "$price cheeses",
                modifier = Modifier.padding(end = 10.dp),
                color = MediumElectricBlue,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = ibmPlexSans

            )
        }
    }
}