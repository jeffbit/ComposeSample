package brown.jeff.composesample.presentation.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import brown.jeff.composesample.R
import brown.jeff.composesample.domain.Brewery
import brown.jeff.composesample.util.testBreweryData
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@Composable
fun BreweryCard(
    brewery: Brewery,
    onClick: () -> Unit,
){
    Card(
        shape = MaterialTheme.shapes.small,
        modifier = Modifier
            .padding(
                bottom = 6.dp,
                top = 6.dp,
            )
            .fillMaxWidth()
            .clickable(onClick = onClick),
        elevation = 8.dp,
    ) {

        Column() {
            brewery.name.let { title ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top=12.dp, bottom=12.dp, start = 8.dp, end=8.dp)
                ){
                    Text(
                        text = title,
                        modifier = Modifier
                            .fillMaxWidth(0.85f)
                            .wrapContentWidth(Alignment.Start)
                        ,
                        style = MaterialTheme.typography.h5
                    )

                    Text(
                        text = brewery.phone,
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(Alignment.End)
                            .align(Alignment.CenterVertically)
                        ,
                        style = MaterialTheme.typography.h6
                    )
                }
            }
        }
    }
}

@ExperimentalCoroutinesApi
@Composable
@Preview
fun BreweryCardPreview() {
    BreweryCard(brewery = testBreweryData, {})
}