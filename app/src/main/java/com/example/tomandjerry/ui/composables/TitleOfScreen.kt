package com.example.tomandjerry.ui.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.EerieBlack
import com.example.tomandjerry.ui.theme.ibmPlexSans

@Composable
fun TitleOfScreen(modifier: Modifier = Modifier, title: String) {
    Text(
        modifier = modifier,
        text = title,
        color = EerieBlack,
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = .25.sp,
        fontFamily = ibmPlexSans
    )
}