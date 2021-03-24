package brown.jeff.composesample.presentation.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.SoftwareKeyboardController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.ImeAction.*
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@ExperimentalComposeUiApi
@Composable
fun SearchViewToolBar() {


//    eventually replace with viewmodel 
    val query = remember { mutableStateOf("") }

    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colors.primary,
        elevation = 8.dp
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            TextField(
                value = query.value,
                onValueChange = { newValue ->
                    query.value = newValue
                },
                modifier = Modifier.fillMaxWidth(0.9F),
                label = Text(text = "Search"),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = Done
                ),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = null
                    )
                },
                onImeActionPerformed = { action: ImeAction, softwareKeyboardController: SoftwareKeyboardController ->
                    if (action == Search) {
//                        add search fun from viewmodel
                        softwareKeyboardController.hideSoftwareKeyboard()

                    }
                },
                textStyle = TextStyle(
                    color = MaterialTheme.colors.onSurface,
                    background = MaterialTheme.colors.surface
                )
            )
        }
    }
}