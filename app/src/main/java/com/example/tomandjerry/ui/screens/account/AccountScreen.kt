package com.example.tomandjerry.ui.screens.account

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.composables.VerticalSpacer
import com.example.tomandjerry.ui.screens.account.composables.Favorites
import com.example.tomandjerry.ui.screens.account.composables.ProfileHeader
import com.example.tomandjerry.ui.screens.account.composables.ProfileStatus
import com.example.tomandjerry.ui.screens.account.composables.Settings
import com.example.tomandjerry.ui.theme.AntiFlashWhite
import com.example.tomandjerry.ui.theme.ScrimDark87
import com.example.tomandjerry.ui.theme.TomAndJerryTheme
import com.example.tomandjerry.ui.theme.darkOverlay
import com.example.tomandjerry.ui.theme.ibmPlexSans

@Composable
fun AccountScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(AntiFlashWhite)
    ) {
        ProfileHeader()

        Card(
            colors = CardColors(
                containerColor = AntiFlashWhite,
                contentColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                disabledContentColor = Color.Transparent

            ),
            shape = RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp),
            modifier = Modifier
                .fillMaxSize()

        ) {
            Column(
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                ProfileStatus()
                VerticalSpacer(space = 24.dp)
                Text(
                    "Tom settings",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = ibmPlexSans,
                    color = ScrimDark87,
                )
                VerticalSpacer(space = 8.dp)
                Settings()
                VerticalSpacer(space = 12.dp)
                Text(
                    "His favorite foods",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = ibmPlexSans,
                    color = ScrimDark87,
                )
                VerticalSpacer(space = 8.dp)
                Favorites()
                VerticalSpacer(space = 24.dp)
                Text(
                    text = "v.TomBeta",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = ibmPlexSans,
                    color = darkOverlay,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun AccountScreenPreview(modifier: Modifier = Modifier) {
    TomAndJerryTheme {
        AccountScreen()
    }

}