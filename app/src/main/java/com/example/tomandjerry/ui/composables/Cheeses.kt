package com.example.tomandjerry.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.AzureishWhite
import com.example.tomandjerry.ui.theme.MediumElectricBlue
import com.example.tomandjerry.ui.theme.ibmPlexSans

@Preview
@Composable
fun CheesesItem(
    modifier: Modifier = Modifier,
    price: String = "5",
    discount: String = "6"
) {
    Box(
        modifier = modifier
            .background(
                color = AzureishWhite,
                shape = RoundedCornerShape(8.dp)
            )
    ) {
        Row(
            modifier = Modifier.align(Alignment.Center),
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
            Row {
                Text(
                    text = discount,
                    modifier = Modifier,
                    color = MediumElectricBlue,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = ibmPlexSans,
                    textDecoration = TextDecoration.LineThrough,

                    )
                Text(
                    text = " $price cheeses",
                    modifier = Modifier.padding(end = 10.dp),
                    color = MediumElectricBlue,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = ibmPlexSans

                )
            }

        }
    }
}