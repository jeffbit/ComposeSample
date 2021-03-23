package brown.jeff.composesample.presentation.presentation.BreweryDetail

import androidx.compose.runtime.Composable
import timber.log.Timber


@Composable
fun BreweryDetailScreen(
    isDarkTheme: Boolean,
    breweryId: Int,
    viewModel: BreweryDetailViewModel

) {

    Timber.d("Brewery ID: $breweryId")
}