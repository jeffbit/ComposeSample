package brown.jeff.composesample.repository

import brown.jeff.composesample.domain.Brewery
import brown.jeff.composesample.domain.toBrewery
import brown.jeff.composesample.domain.toBreweryList
import brown.jeff.composesample.network.BreweryApi
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class BreweryRepository_Impl(
    private val breweryApi: BreweryApi,
    private val dispatchers: Dispatchers
) : BreweryRepository {



    override suspend fun getById(breweryId: String): Brewery {
        return withContext(dispatchers.IO) {
            breweryApi.getById(id = breweryId).toBrewery()
        }
    }

    override suspend fun getByCity(breweryCity: String): List<Brewery> {
        return withContext(dispatchers.IO) {
            breweryApi.getByCity(city = breweryCity).toBreweryList()
        }
    }

    override suspend fun getByPostal(breweryPostal: String): List<Brewery> {
        return withContext(dispatchers.IO) {
            breweryApi.getByPostal(postalCode = breweryPostal).toBreweryList()
        }
    }

    override suspend fun getByState(breweryState: String): List<Brewery> {
        return withContext(dispatchers.IO) {
            breweryApi.getByState(state = breweryState).toBreweryList()
        }
    }

    override suspend fun getBySearch(search: String): List<Brewery> {
        return withContext(dispatchers.IO) {
            breweryApi.getBySearch(search = search).toBreweryList()
        }
    }

    override suspend fun getByName(breweryName: String): List<Brewery> {
        return withContext(dispatchers.IO) {
            breweryApi.getByName(name = breweryName).toBreweryList()
        }
    }
}