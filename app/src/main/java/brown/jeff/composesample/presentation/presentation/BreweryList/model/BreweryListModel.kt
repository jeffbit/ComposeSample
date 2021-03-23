package brown.jeff.composesample.presentation.presentation.BreweryList.model

import brown.jeff.composesample.domain.Brewery

data class BreweryListModel(
    val id: Int,
    val breweryType: String,
    val state: String,
    val city: String,
    val country: String,
    val name: String

)


fun Brewery.toBreweryListModel() =
    BreweryListModel(
        id = this.id,
        breweryType = this.breweryType,
        state = this.state,
        city = this.city,
        country = this.country,
        name = this.name
    )


