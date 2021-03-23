package brown.jeff.composesample.presentation.presentation.navigation

sealed class Screen(
    val route: String
) {

    //    Defines navigation within our app
    object BreweryList : Screen("breweryList")
    object BreweryDetail : Screen("breweryDetail")
}
