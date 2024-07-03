package com.example.serverdrivenuisample.ui.components.banner

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.serverdrivenuisample.R
import com.example.serverdrivenuisample.ui.theme.ServerDrivenUISampleTheme

@Composable
fun IndodanaImageBanner(
    @DrawableRes drawable: Int,
    title: String,
    modifier: Modifier = Modifier.padding(bottom = 16.dp)
) {
    Image(
        painter = painterResource(id = drawable),
        contentDescription = title,
        contentScale = ContentScale.FillWidth,
        modifier = modifier
            .fillMaxWidth()
            .heightIn(0.dp, 300.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun ImageBannerPreview() {
    ServerDrivenUISampleTheme {
        IndodanaImageBanner(drawable = R.drawable.featured_product_banner, "Banner Preview")
    }
}