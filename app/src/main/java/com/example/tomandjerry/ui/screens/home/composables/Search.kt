package com.example.tomandjerry.ui.screens.home.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.composables.HorizontalSpacer
import com.example.tomandjerry.ui.theme.Cultured
import com.example.tomandjerry.ui.theme.MediumElectricBlue
import com.example.tomandjerry.ui.theme.SpanishGray
import com.example.tomandjerry.ui.theme.ibmPlexSans

@Composable
fun SearchHomeScreen(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = Cultured,
                    shape = RoundedCornerShape(12.dp)
                )
                .weight(1f)
                .background(Color.White, RoundedCornerShape(12.dp))
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.search),
                contentDescription = null,
                tint = SpanishGray,
                modifier = Modifier.padding(end = 8.dp)
            )
            BasicTextField(
                value = "Search about tom ...",
                onValueChange = {},
                singleLine = true,
                textStyle = TextStyle(
                    color = SpanishGray,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = ibmPlexSans,
                )
            )
        }
        HorizontalSpacer(space = 8.dp)
        IconButton(
            onClick = { },
            modifier = Modifier
                .background(MediumElectricBlue, RoundedCornerShape(12.dp))
        ) {
            Icon(
                modifier = Modifier.padding(12.dp),
                painter = painterResource(id = R.drawable.settings),
                contentDescription = null,
                tint = Color.White,
            )
        }
    }
}