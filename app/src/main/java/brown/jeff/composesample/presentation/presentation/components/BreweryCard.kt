package brown.jeff.composesample.presentation.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import brown.jeff.composesample.R
import brown.jeff.composesample.domain.Brewery
import brown.jeff.composesample.util.testBreweryData

@Composable
fun BreweryCard(
    brewery: Brewery
) {
    Card(
        shape = MaterialTheme.shapes.small,
        modifier = Modifier.padding(
            bottom = 6.dp,
            top = 6.dp
        )
            .fillMaxWidth(),
        // TODO: 3/23/2021 add clickable onClick : () -> Unit 
        elevation = 8.dp
    ) {
        Column() {

            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth().height(225.dp),
                contentScale = ContentScale.Crop
            )

        }

    }

}


@Composable
@Preview
fun BreweryCardPreview() {
    BreweryCard(brewery = testBreweryData)
}