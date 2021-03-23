package brown.jeff.composesample.domain

import brown.jeff.composesample.network.BreweriesEntity
import brown.jeff.composesample.network.BreweryEntity


data class Brewery(
    val address2: String,
    val address3: String,
    val breweryType: String,
    val city: String,
    val country: String,
    val countyProvince: Any,
    val createdAt: String,
    val id: Int,
    val latitude: String,
    val longitude: String,
    val name: String,
    val phone: String,
    val postalCode: String,
    val state: String,
    val street: String,
    val updatedAt: String,
    val websiteUrl: String
)

fun BreweryEntity.toBrewery() =
    Brewery(
        address2 = this.address_2,
        address3 = this.address_3,
        breweryType = this.brewery_type,
        city = this.city,
        country = this.country,
        countyProvince = this.county_province,
        createdAt = this.created_at,
        id = this.id,
        latitude = this.latitude,
        longitude = this.longitude,
        name = this.name,
        phone = this.phone,
        postalCode = this.postal_code,
        state = this.state,
        street = this.street,
        updatedAt = this.updated_at,
        websiteUrl = this.website_url
    )


fun BreweriesEntity.toBreweryList(): List<Brewery> {
    val breweryList = mutableListOf<Brewery>()

    this.breweries.forEach { breweryEntity ->
        breweryList.add(breweryEntity.toBrewery())

    }
    return breweryList
}

