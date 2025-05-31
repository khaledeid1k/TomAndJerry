package com.example.tomandjerry.ui.screens.tom_kitchen.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.composables.HorizontalSpacer
import com.example.tomandjerry.ui.composables.VerticalSpacer
import com.example.tomandjerry.ui.theme.AzureishWhite
import com.example.tomandjerry.ui.theme.OceanBlue
import com.example.tomandjerry.ui.theme.darkOverlay
import com.example.tomandjerry.ui.theme.ibmPlexSans

fun LazyListScope.preparationSteps() {
    val preparationSteps: List<PreparationStep> = listOf(
        PreparationStep("1", "Put the pasta in a toaster."),
        PreparationStep("2", "Pour battery juice over it."),
        PreparationStep("3", "Wait for the spark to ignite."),
        PreparationStep("4", "Serve with an insulating glove."),
    )
    items(items = preparationSteps,
        key = { step -> step.number }
    ) { preparationStep ->
        PreparationStepItem(preparationStep = preparationStep)
        VerticalSpacer(space = 8.dp)
    }
}

@Composable
fun PreparationStepItem(modifier: Modifier = Modifier, preparationStep: PreparationStep) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier

            .fillMaxWidth()
            .background(Color.White, RoundedCornerShape(16.dp))
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier

        ) {

            Text(
                text = preparationStep.number,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .border(
                        width = 1.dp,
                        color = AzureishWhite,
                        shape = CircleShape
                    )
                    .padding(horizontal = 14.dp, vertical = 8.dp),
                color = OceanBlue,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
        }
        HorizontalSpacer(space = 8.dp)
        Text(
            preparationStep.description,
            fontSize = 14.sp,
            color = darkOverlay,
            fontFamily = ibmPlexSans,
            fontWeight = FontWeight.Normal,
        )
    }
}

data class PreparationStep(
    val number: String,
    val description: String
)