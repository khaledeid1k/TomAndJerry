package com.example.tomandjerry.ui.screens.TomKitchen.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.LapisLazuli
import com.example.tomandjerry.ui.theme.ibmPlexSans

@Composable
fun AddToCartButton(modifier: Modifier = Modifier) {
    Button(
        colors = ButtonColors(
            contentColor = LapisLazuli,
            containerColor = LapisLazuli,
            disabledContainerColor = Color.White,
            disabledContentColor = Color.White
        ),
        shape = RoundedCornerShape(16.dp),
        //todo review steps view
        modifier = modifier
            .background(Color.White)
            .fillMaxWidth()
            .padding(vertical = 15.dp, horizontal = 16.dp),
        onClick = {}
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                "Add to cart",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = ibmPlexSans,
                color = Color.White
            )
            Icon(
                painter = painterResource(id = R.drawable.dot),
                contentDescription = null,
                modifier = Modifier.padding(8.dp),
                tint = Color.Gray
            )
            Column {
                Text(
                    "3 cheeses",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = ibmPlexSans,
                    color = Color.White
                )
                Text(
                    "5 cheeses",
                    fontSize = 12.sp,
                    textDecoration = TextDecoration.LineThrough,
                    fontWeight = FontWeight.Medium,
                    fontFamily = ibmPlexSans,
                    color = Color.White,
                )
            }
        }

    }
}