package com.example.tomandjerry.ui.screens.account.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.composables.HorizontalSpacer
import com.example.tomandjerry.ui.theme.ScrimDark87
import com.example.tomandjerry.ui.theme.ibmPlexSans

@Composable
fun Settings(modifier: Modifier = Modifier) {
    val settings: List<Setting> = listOf(
        Setting(image = R.drawable.bed, title = "Change sleeping place"),
        Setting(image = R.drawable.cat, title = "Meow settings"),
        Setting(image = R.drawable.fridge, title = "Password to open the fridge"),
    )
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = modifier
    ) {
        settings.forEach { setting ->
            SettingItem(setting = setting)
        }
    }

}


@Composable
fun Favorites(modifier: Modifier = Modifier) {
    val favorites: List<Setting> = listOf(
        Setting(image = R.drawable.alert, title = "Mouses"),
        Setting(image = R.drawable.hamburger, title = "Last stolen meal"),
        Setting(image = R.drawable.sleeping, title = "Change sleep mood"),
    )
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = modifier
    ) {
        favorites.forEach { favorite ->
            SettingItem(setting = favorite)
        }

    }

}

@Composable
fun SettingItem(modifier: Modifier = Modifier, setting: Setting) {

    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = setting.image),
            contentDescription = null,
            modifier = Modifier
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(8.dp)
                )
                .padding(8.dp)
        )
        HorizontalSpacer(space = 8.dp)
        Text(
            setting.title,
            modifier = Modifier,
            fontSize = 16.sp,
            maxLines = 1,
            fontWeight = FontWeight.Medium,
            fontFamily = ibmPlexSans,
            color = ScrimDark87,
        )
    }

}


data class Setting(
    val image: Int,
    val title: String

)