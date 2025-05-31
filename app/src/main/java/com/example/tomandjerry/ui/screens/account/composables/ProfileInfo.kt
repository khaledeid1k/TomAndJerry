package com.example.tomandjerry.ui.screens.account.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import com.example.tomandjerry.ui.composables.HorizontalSpacer
import com.example.tomandjerry.ui.theme.AzureishWhite
import com.example.tomandjerry.ui.theme.DarkGrayDimmed
import com.example.tomandjerry.ui.theme.MintCream
import com.example.tomandjerry.ui.theme.SoftRose
import com.example.tomandjerry.ui.theme.TomAndJerryTheme
import com.example.tomandjerry.ui.theme.VanillaCream
import com.example.tomandjerry.ui.theme.darkOverlay
import com.example.tomandjerry.ui.theme.ibmPlexSans

@Composable
fun ProfileStatus(modifier: Modifier = Modifier) {

    val status: List<Status> = listOf(
        Status(
            image = R.drawable.progress1,
            color = AzureishWhite,
            title = "2M 12K",
            description = "No. of quarrels"
        ),
        Status(
            image = R.drawable.progress2,
            color = MintCream,
            title = "+500 h",
            description = "Chase time"
        ),
        Status(
            image = R.drawable.progress3,
            color = SoftRose,
            title = "2M 12K",
            description = "Hunting times"
        ),
        Status(
            image = R.drawable.progress4,
            color = VanillaCream,
            title = "3M 7K",
            description = "Heartbroken"
        ),
    )
    Column(
        modifier = modifier
            .padding(top = 23.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        status.chunked(2).forEach { chunk ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                chunk.forEach { item ->
                    Status(
                        status = item,
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
    }
}

@Composable
fun Status(modifier: Modifier = Modifier, status: Status) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = status.color, shape = RoundedCornerShape(12.dp),
            ),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier
                .padding(start = 12.dp)
                .padding(vertical = 8.dp),
            painter = painterResource(id = status.image),
            contentDescription = null,
        )
        HorizontalSpacer(space = 10.dp)
        Column(
            modifier = Modifier
                .padding(end = 10.dp)
                .padding(vertical = 11.dp)
        ) {
            Text(
                status.title,
                fontSize = 16.sp,
                maxLines = 1,
                fontWeight = FontWeight.SemiBold,
                fontFamily = ibmPlexSans,
                color = darkOverlay,
            )
            Text(
                status.description,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                fontFamily = ibmPlexSans,
                color = DarkGrayDimmed
            )


        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProfileInfoSectionPreview(modifier: Modifier = Modifier) {
    TomAndJerryTheme {
        ProfileStatus(
            modifier.padding(
                top = 48.dp,
            )
        )
    }
}

data class Status(
    val image: Int,
    val color: Color,
    val title: String,
    val description: String
)