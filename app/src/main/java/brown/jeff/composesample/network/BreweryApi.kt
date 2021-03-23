package brown.jeff.composesample.network

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface BreweryApi {
    @GET("search?")
    suspend fun getBySearch(@Query("query") search: String): BreweriesEntity

    @GET(":id")
    suspend fun getById(@Path("id") id: String): BreweryEntity

    @GET("?")
    suspend fun getByPostal(@Query("by_postal") postalCode: String): BreweriesEntity

    @GET("?")
    suspend fun getByState(@Query("by_state") state: String): BreweriesEntity

    @GET("?")
    suspend fun getByName(@Query("by_name") name: String): BreweriesEntity

    @GET("?")
    suspend fun getByCity(@Query("by_city") city: String): BreweriesEntity


}