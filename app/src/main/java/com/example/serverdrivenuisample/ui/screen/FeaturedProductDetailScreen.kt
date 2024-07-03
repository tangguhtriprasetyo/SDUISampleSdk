package com.example.serverdrivenuisample.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.serverdrivenuisample.R
import com.example.serverdrivenuisample.ui.components.banner.IndodanaImageBanner
import com.example.serverdrivenuisample.ui.components.button.IndodanaButtonPrimary
import com.example.serverdrivenuisample.ui.components.navbar.IndodanaTopAppBar
import com.example.serverdrivenuisample.ui.components.table.IndodanaTable
import com.example.serverdrivenuisample.ui.components.text.TextBodyMedium
import com.example.serverdrivenuisample.ui.components.text.TextTitleLarge
import com.example.serverdrivenuisample.ui.theme.IndodanaShadesBlack60
import com.example.serverdrivenuisample.ui.theme.ServerDrivenUISampleTheme

@Composable
fun FeaturedProductDetailScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.Start,
    ) {
        IndodanaTopAppBar(
            title = stringResource(androidx.appcompat.R.string.abc_action_bar_up_description),
            showBack = true
        )
        IndodanaImageBanner(drawable = R.drawable.featured_product_banner, "Image Banner")
        TextTitleLarge(
            text = "Belinya di Blibli, berikut simulasi cicilan-nya: "
        )
        TextBodyMedium(
            text = "Belinya di Blibli, berikut simulasi cicilan-nya: ",
            color = IndodanaShadesBlack60
        )
        IndodanaTable(
            headers = listOf("Header 1", "Header 2"),
            tableData = listOf(
                listOf(
                    "Row 1 Col 1.........................",
                    "Row 1 Col 2.................."
                ),
                listOf("Row 2 Col 1", "Row 2 Col 2"),
                listOf("Row 3 Col 1", "Row 3 Col 2"),
                listOf("Row 4 Col 1", "Row 4 Col 2")
            )
        )

        IndodanaButtonPrimary(title = stringResource(R.string.app_name), onClick = {})
    }
}

@Preview(showBackground = true)
@Composable
fun FeaturedProductDetailPreview() {
    ServerDrivenUISampleTheme { FeaturedProductDetailScreen() }
}