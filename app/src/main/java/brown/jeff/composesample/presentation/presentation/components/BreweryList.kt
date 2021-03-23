package brown.jeff.composesample.presentation.presentation.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import brown.jeff.composesample.domain.Brewery

@Composable
fun BrewerList(
    isLoading: Boolean,
    breweries: List<Brewery>,
    onNavigateToDetailScreen: (Int) -> Unit
) {


    if (isLoading && breweries.isEmpty()) {
//        display loading dialog
    } else if (breweries.isEmpty()) {
//        Display empty message
    } else {
        LazyColumn {

        }

    }

}


//@Composable
//@Preview
//fun preview(){
//    BrewerList(isLoading = false, breweries = listOf(), onNavigateToDetailScreen = 2 )
//}