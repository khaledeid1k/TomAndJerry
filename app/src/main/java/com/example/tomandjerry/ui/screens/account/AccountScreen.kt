package com.example.tomandjerry.ui.screens.account

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.composables.VerticalSpacer
import com.example.tomandjerry.ui.screens.account.composables.Favorites
import com.example.tomandjerry.ui.screens.account.composables.ProfileHeader
import com.example.tomandjerry.ui.screens.account.composables.ProfileStatus
import com.example.tomandjerry.ui.screens.account.composables.Settings
import com.example.tomandjerry.ui.theme.AntiFlashWhite
import com.example.tomandjerry.ui.theme.LapisLazuli
import com.example.tomandjerry.ui.theme.ScrimDark87
import com.example.tomandjerry.ui.theme.TomAndJerryTheme
import com.example.tomandjerry.ui.theme.darkOverlay
import com.example.tomandjerry.ui.theme.gray
import com.example.tomandjerry.ui.theme.ibmPlexSans

@Composable
fun AccountScreen(modifier: Modifier = Modifier) {
    Box(modifier) {
        Column(
            modifier = Modifier
                .background(LapisLazuli)

        ) {
            ProfileHeader(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
            Box(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .fillMaxSize()
                    .clip(RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp))
                    .background(color = AntiFlashWhite)
                    .padding(bottom = 24.dp)

            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()

                ) {
                    ProfileStatus(modifier = Modifier.padding(horizontal = 16.dp))
                    VerticalSpacer(space = 24.dp)
                    Text(
                        modifier = Modifier.padding(horizontal = 16.dp),
                        text = "Tom settings",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = ibmPlexSans,
                        color = ScrimDark87,
                    )
                    VerticalSpacer(space = 8.dp)
                    Settings(modifier = Modifier.padding(horizontal = 16.dp))
                    VerticalSpacer(space = 12.dp)
                    HorizontalDivider(
                        modifier = Modifier.fillMaxWidth(),
                        color = gray,
                        thickness = 1.dp
                    )
                    Text(
                        modifier = Modifier.padding(horizontal = 16.dp),
                        text = "His favorite foods",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = ibmPlexSans,
                        color = ScrimDark87,
                    )
                    VerticalSpacer(space = 8.dp)
                    Favorites(modifier = Modifier.padding(horizontal = 16.dp))
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
        Image(
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(id = R.drawable.background_shape),
            contentDescription = null,
        )
        Image(
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(id = R.drawable.background_shape2),
            contentDescription = null,
        )
    }
}

@Preview(showSystemUi = true)
@PreviewScreenSizes
@Composable
fun AccountScreenPreview(modifier: Modifier = Modifier) {
    TomAndJerryTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->
            AccountScreen(modifier = Modifier.padding(innerPadding))
        }
    }

}