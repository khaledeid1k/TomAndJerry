package com.example.tomandjerry.ui.screens.SecretEpisodes.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.composables.VerticalSpacer
import com.example.tomandjerry.ui.theme.Blond
import com.example.tomandjerry.ui.theme.ClassicRose
import com.example.tomandjerry.ui.theme.Diamond
import com.example.tomandjerry.ui.theme.ScrimDark87
import com.example.tomandjerry.ui.theme.darkGray60
import com.example.tomandjerry.ui.theme.ibmPlexSans

@Preview
@Composable
fun PopularCharacters(modifier: Modifier = Modifier) {
    val popularCharacters: List<PopularCharacter> = listOf(
        PopularCharacter(
            R.drawable.popular_character1,
            "Tom",
            "Failed stalker",
            Blond
        ),
        PopularCharacter(
            R.drawable.popular_character2,
            "Jerry",
            "A scammer mouse",
            ClassicRose
        ),
        PopularCharacter(
            R.drawable.popular_character3,
            "Nibbles",
            "Hungry mouse",
            Diamond
        ),

        )
    LazyRow(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(
            popularCharacters
        ) {
            PopularCharacterItem(popularCharacter = it)
        }
    }


}

@Composable
fun PopularCharacterItem(
    modifier: Modifier = Modifier,
    popularCharacter: PopularCharacter
) {
    Box(
        modifier

    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .width(150.dp)
                .background(
                    color = popularCharacter.color,
                    shape = RoundedCornerShape(16.dp)

                )
                .padding(horizontal = 18.dp)
                .padding(bottom = 12.dp)
        ) {
            VerticalSpacer(space = 8.dp)
            Text(
                modifier = Modifier.padding(top = 32.dp),
                text = popularCharacter.title,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = ibmPlexSans,
                color = ScrimDark87,
                letterSpacing = .25.sp,
            )
            VerticalSpacer(space = 4.dp)
            Text(
                text = popularCharacter.description,
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                fontFamily = ibmPlexSans,
                color = darkGray60,
                letterSpacing = .25.sp,

                )
        }
        Image(
            modifier = Modifier
                .align(Alignment.TopCenter)

                .size(
                    width = 63.dp,
                    height = 60.dp
                )
                .offset(
                    y = (-24).dp
                ),
            painter = painterResource(id = popularCharacter.image),
            contentDescription = null
        )
    }

}

data class PopularCharacter(
    val image: Int,
    val title: String,
    val description: String,
    val color: Color
)