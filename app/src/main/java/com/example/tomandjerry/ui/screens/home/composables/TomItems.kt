package com.example.tomandjerry.ui.screens.home.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.composables.CheesesItem
import com.example.tomandjerry.ui.composables.VerticalSpacer
import com.example.tomandjerry.ui.theme.EerieBlack
import com.example.tomandjerry.ui.theme.MediumElectricBlue
import com.example.tomandjerry.ui.theme.SpanishGray
import com.example.tomandjerry.ui.theme.ibmPlexSans

data class TomItem(
    val image: Int,
    val title: String,
    val description: String,
    val price: String,
    val discount: String = "",
)

fun LazyListScope.tomItemsHomeScreen() {
    val toms: List<TomItem> = listOf(
        TomItem(
            R.drawable.cat1,
            "Sport Tom",
            "He runs 1 meter... trips over his boot.",
            "3",
            "5"
        ),
        TomItem(
            R.drawable.cat2,
            "Tom the lover",
            "He loves one-sidedly... and is beaten by the other side.",
            "5"
        ),
        TomItem(
            R.drawable.cat3,
            "Tom the bomb",
            "He blows himself up before Jerry can catch him.",
            "10"
        ),
        TomItem(
            R.drawable.cat4,
            "Spy Tom",
            "Disguises itself as a table.",
            "12"
        ),
        TomItem(
            R.drawable.cat5,
            "Frozen Tom",
            "He was chasing Jerry, he froze after the first look.",
            "10"
        ),
        TomItem(
            R.drawable.cat6,
            "Sleeping Tom",
            "He doesn't chase anyone, he just snores in stereo.",
            "10"
        ),

        )
    val chunkedToms = toms.chunked(2)

    items(chunkedToms) { rowItems ->
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            rowItems.forEach { tom ->
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                ) {
                    TomItemCard(tom = tom)
                }
            }
            if (rowItems.size < 2) {
                VerticalSpacer(modifier = Modifier.weight(1f))
            }
        }
    }
}


@Preview
@Composable
fun TomItemCard(
    modifier: Modifier = Modifier, tom: TomItem = TomItem(
        R.drawable.cat1,
        "Sport Tom",
        "He runs 1 meter... trips over his boot.",
        "3",
        "5"
    )
) {
    Box(
        modifier = Modifier.padding(top = 16.dp),
        contentAlignment = Alignment.TopCenter,
    ) {
        Card(
            modifier = modifier
                .fillMaxSize()
                .padding(top = 16.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            shape = RoundedCornerShape(16.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 92.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    tom.title,
                    modifier = Modifier.padding(top = 8.dp),
                    color = EerieBlack,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = ibmPlexSans
                )
                Text(
                    text = tom.description,
                    modifier = Modifier
                        .padding(
                            top = 8.dp,
                            start = 8.dp, end = 8.dp
                        )
                        .align(Alignment.CenterHorizontally),
                    color = SpanishGray,
                    textAlign = TextAlign.Center,
                    minLines = 3,
                    lineHeight = 16.sp,
                    overflow = TextOverflow.MiddleEllipsis,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = ibmPlexSans
                )
                VerticalSpacer(modifier = Modifier.weight(1f))
                Row(
                    modifier = Modifier.padding(bottom = 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    CheesesItem(
                        discount = tom.discount,
                        price = tom.price,
                        modifier = Modifier.padding(
                            vertical = 6.dp,
                            horizontal = 8.dp
                        )
                    )

                    Icon(
                        modifier = Modifier.padding(end = 8.dp),
                        painter = painterResource(id = R.drawable.add_to_cart_container),
                        contentDescription = null,
                        tint = MediumElectricBlue
                    )
                }

            }
        }
        Image(
            painter = painterResource(id = tom.image),
            contentDescription = null,
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
        )
    }
}