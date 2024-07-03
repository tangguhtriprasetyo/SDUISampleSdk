package com.example.serverdrivenuisample

import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import com.example.serverdrivenuisample.ResponseType.*
import com.example.serverdrivenuisample.data.datasource.network.NetworkProvider
import com.example.serverdrivenuisample.dummy.DummyResponseProvider
import com.example.serverdrivenuisample.ui.builder.BuildScreen
import com.example.serverdrivenuisample.ui.components.loading.IndodanaProgressIndicator
import kotlinx.coroutines.delay


object ServerDrivenUISdk {
    @Composable
    fun GetFeaturedProductDetailScreen(responseType: ResponseType, json: String? = null) {
        var counter by remember { mutableStateOf(0) }

        LaunchedEffect(Unit) {
            while (counter < 100) {
                delay(5)
                counter++
            }
        }

        if (counter < 100) {
            IndodanaProgressIndicator(counter/100f)
        } else {
            val response = when (responseType) {
                FEATURED_PRODUCT -> NetworkProvider.mockResponse(DummyResponseProvider.mockFeaturedProductDetail())
                FEATURED_PRODUCT_WITHOUT_TOP_NAVBAR -> NetworkProvider.mockResponse(DummyResponseProvider.mockFeaturedProductWithoutTopNavbar())
                FEATURED_PRODUCT_WITH_NESTED_LAYOUT -> NetworkProvider.mockResponse(DummyResponseProvider.mockFeaturedProductWithNestedLayout())
                COMPONENT_LIST -> NetworkProvider.mockResponse(DummyResponseProvider.mockComponentList())
                JSON_INPUT -> {

                    Log.d("TAGTES", "SDK: $json")
                    json?.let { NetworkProvider.mockResponse(it) }
                }
                NONE -> null
            }

            response?.let { BuildScreen(screen = it) } ?: kotlin.run {
                if (responseType != NONE) {
                    Toast.makeText(LocalContext.current, "Invalid JSON", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}

enum class ResponseType{
    NONE,
    FEATURED_PRODUCT,
    FEATURED_PRODUCT_WITHOUT_TOP_NAVBAR,
    FEATURED_PRODUCT_WITH_NESTED_LAYOUT,
    COMPONENT_LIST,
    JSON_INPUT
}