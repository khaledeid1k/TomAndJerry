package com.example.tomandjerry.ui.screens.SecretEpisodes.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.Independence
import com.example.tomandjerry.ui.theme.ibmPlexSans
import com.example.tomandjerry.ui.theme.white24

@Preview
@Composable
fun TomsMostWatched(modifier: Modifier = Modifier) {

    val tomsMostWatched: List<TomMostWatched> = listOf(
        TomMostWatched(
            "Number 404 - The Cursed Cheese 🧀",
            R.drawable.most_watched1
        ),
        TomMostWatched(
            "Chase on the moon 🌕",
            R.drawable.most_watched2
        ),


        )
    LazyRow(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        items(tomsMostWatched) {
            TomItemMostWatched(tomMostWatched = it)
        }
    }

}

@Composable
fun TomItemMostWatched(
    modifier: Modifier = Modifier,
    tomMostWatched: TomMostWatched
) {
    Box(
        modifier = modifier.size(
            width = 212.dp,
            height = 311.dp
        )
    ) {
        Image(
            modifier = Modifier
                .fillMaxHeight()
                .clip(
                    RoundedCornerShape(16.dp)
                ),
            contentScale = ContentScale.Crop,
            painter = painterResource(id = tomMostWatched.image),
            contentDescription = null
        )
        Image(
            modifier = Modifier
                .padding(top = 8.dp, end = 8.dp)
                .border(
                    width = 1.dp,
                    color = Independence,
                    shape = RoundedCornerShape(16.dp)
                )

                .align(Alignment.TopEnd)
                .background(white24, RoundedCornerShape(16.dp))
                .padding(13.dp),
            painter = painterResource(id = R.drawable.chess),
            contentDescription = null
        )
        Text(
            text = tomMostWatched.tile,
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = ibmPlexSans,
            color = Color.White,
            letterSpacing = .25.sp,
            maxLines = 2,
            lineHeight = 20.sp,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .padding(
                    horizontal = 8.dp,
                    vertical = 12.dp
                )
                .align(Alignment.BottomStart)
        )
    }
}

data class TomMostWatched(
    val tile: String,
    val image: Int,
)