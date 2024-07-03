package com.example.serverdrivenuisample

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.serverdrivenuisample.ui.components.button.IndodanaButtonPrimary
import com.example.serverdrivenuisample.ui.components.button.IndodanaButtonSecondary
import com.example.serverdrivenuisample.ui.components.text.TextHeadlineLarge
import com.example.serverdrivenuisample.ui.components.text.TextLabelMedium
import com.example.serverdrivenuisample.ui.theme.IndodanaPrimaryGreen
import com.example.serverdrivenuisample.ui.theme.IndodanaPrimaryOrange
import com.example.serverdrivenuisample.ui.theme.ServerDrivenUISampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ServerDrivenUISampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(modifier = Modifier.fillMaxSize()) {
                        var pageType by remember {
                            mutableStateOf(ResponseType.NONE)
                        }
                        var json by remember {
                            mutableStateOf("")
                        }

                        if (pageType != ResponseType.NONE) {
                            ServerDrivenUISdk.GetFeaturedProductDetailScreen(pageType, json)
                            IndodanaButtonPrimary(
                                modifier = Modifier
                                    .align(Alignment.BottomEnd)
                                    .padding(16.dp),
                                title = stringResource(R.string.reset),
                                onClick = { pageType = ResponseType.NONE }
                            )
                        } else {
                            HomeScreen { newPageType, newJson ->
                                pageType = newPageType
                                if (newJson != null) {
                                    json = newJson
                                }
                                Log.d("TAGTES", "onCreate: $json")
                            }
                        }
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalAnimationApi::class, ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onClick: (ResponseType, String?) -> Unit
) {
    var visible by remember { mutableStateOf(true) }
    var jsonInput by remember { mutableStateOf(TextFieldValue("")) }

    AnimatedVisibility(visible = visible, enter = fadeIn(), exit = fadeOut()) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .animateEnterExit(
                    enter = slideInVertically(),
                    exit = slideOutVertically()
                )
        ) {
            TextHeadlineLarge(
                text = "Server Driven UI Demo",
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f)
            )

            OutlinedTextField(
                value = jsonInput,
                onValueChange = {
                    jsonInput = it
                },
                label = { TextLabelMedium("JSON Input") },
                placeholder = { TextLabelMedium("Enter your JSON here") },
                modifier = Modifier
                    .weight(1f, false)
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth(),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = IndodanaPrimaryGreen,
                    unfocusedBorderColor = IndodanaPrimaryOrange
                )
            )

            IndodanaButtonSecondary(
                title = "Input Json",
                modifier = Modifier
                    .weight(1f, false)
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                onClick = {
                    onClick(ResponseType.JSON_INPUT, jsonInput.text)
                })

            Spacer(modifier = Modifier.height(8.dp))

            IndodanaButtonPrimary(
                title = "Featured Product Screen",
                modifier = Modifier
                    .weight(1f, false)
                    .padding(16.dp)
                    .fillMaxWidth(),
                onClick = {
                    onClick(ResponseType.FEATURED_PRODUCT, null)
                })

            IndodanaButtonPrimary(
                title = "Featured Product Without Top Navbar",
                modifier = Modifier
                    .weight(1f, false)
                    .padding(16.dp)
                    .fillMaxWidth(),
                onClick = {
                    onClick(ResponseType.FEATURED_PRODUCT_WITHOUT_TOP_NAVBAR, null)
                })

            IndodanaButtonPrimary(
                title = "Featured Product With Nested Layout",
                modifier = Modifier
                    .weight(1f, false)
                    .padding(16.dp)
                    .fillMaxWidth(),
                onClick = {
                    onClick(ResponseType.FEATURED_PRODUCT_WITH_NESTED_LAYOUT, null)
                })

            IndodanaButtonPrimary(
                title = "Component List",
                modifier = Modifier
                    .weight(1f, false)
                    .padding(16.dp)
                    .fillMaxWidth(),
                onClick = {
                    onClick(ResponseType.COMPONENT_LIST, null)
                })
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ServerDrivenUISampleTheme {
        HomeScreen(onClick = { _, _ -> })
    }
}