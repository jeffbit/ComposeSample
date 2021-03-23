package brown.jeff.composesample.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.HiltViewModelFactory
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import brown.jeff.composesample.di.MyApplication
import brown.jeff.composesample.presentation.presentation.BreweryDetail.BreweryDetailScreen
import brown.jeff.composesample.presentation.presentation.BreweryDetail.BreweryDetailViewModel
import brown.jeff.composesample.presentation.presentation.BreweryList.BreweryListScreen
import brown.jeff.composesample.presentation.presentation.BreweryList.BreweryListViewModel
import brown.jeff.composesample.presentation.presentation.navigation.Screen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = Screen.BreweryList.route
            ) {

//                  BreweryList Destination
                composable(route = Screen.BreweryList.route) { navBackStackEntry ->
                    val factory = HiltViewModelFactory(
                        LocalContext.current,
                        navBackStackEntry = navBackStackEntry
                    )

                    val viewModel: BreweryListViewModel =
                        viewModel(key = "BreweryListViewModel", factory = factory)

                    BreweryListScreen(
                        isDarkTheme = (application as MyApplication).isDark.value,
                        onToggleTheme = (application as MyApplication)::toggleLightTheme,
                        viewModel = viewModel
                    )

                }

//                  BreweryDetail Destination
                composable(route = Screen.BreweryDetail.route) { navBackStackEntry ->
                    val factory = HiltViewModelFactory(
                        LocalContext.current,
                        navBackStackEntry = navBackStackEntry
                    )

                    val viewModel: BreweryDetailViewModel =
                        viewModel(key = "BreweryDetailViewModel", factory = factory)

                    BreweryDetailScreen(
                        isDarkTheme = (application as MyApplication).isDark.value,
                        breweryId = 2,
                        viewModel = viewModel
                    )


                }
            }

        }
    }
}


