package brown.jeff.composesample.presentation.presentation.BreweryDetail

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import brown.jeff.composesample.repository.BreweryRepository

class BreweryDetailViewModel(private val breweryRepository: BreweryRepository) : ViewModel() {



//    val loading = mutableStateOf()


    val brewery = mutableStateOf(listOf(null))

}
