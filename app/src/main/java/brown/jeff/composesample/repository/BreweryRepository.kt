package brown.jeff.composesample.repository

import brown.jeff.composesample.domain.Brewery

interface BreweryRepository {

    suspend fun getById(breweryId: String): Brewery
    suspend fun getByCity(breweryCity: String): List<Brewery>
    suspend fun getByPostal(breweryPostal: String): List<Brewery>
    suspend fun getByState(breweryState: String): List<Brewery>
    suspend fun getBySearch(search: String): List<Brewery>
    suspend fun getByName(breweryName: String): List<Brewery>
}