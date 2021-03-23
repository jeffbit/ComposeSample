package brown.jeff.composesample.di

import brown.jeff.composesample.network.BreweryApi
import brown.jeff.composesample.repository.BreweryRepository
import brown.jeff.composesample.repository.BreweryRepository_Impl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideBreweryRepository(
        breweryApi: BreweryApi,
        dispatchers: Dispatchers
    ): BreweryRepository {
        return BreweryRepository_Impl(
            breweryApi = breweryApi,
            dispatchers = dispatchers
        )
    }
}