package brown.jeff.composesample.di

import brown.jeff.composesample.network.BreweryApi
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {


    @Singleton
    @Provides
    fun provideRetrofitService(): BreweryApi {
        return Retrofit.Builder()
            .baseUrl("https://api.openbrewerydb.org/breweries/")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
            .create(BreweryApi::class.java)
    }

    @Provides
    fun provideDispatcherIO(): Dispatchers {
        return Dispatchers.IO
    }


}