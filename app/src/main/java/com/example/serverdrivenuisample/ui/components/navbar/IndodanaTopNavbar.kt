package com.example.serverdrivenuisample.ui.components.navbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.serverdrivenuisample.R
import com.example.serverdrivenuisample.ui.components.text.TextHeadlineMedium
import com.example.serverdrivenuisample.ui.theme.ServerDrivenUISampleTheme

@Composable
fun IndodanaTopAppBar(
    title: String,
    navBack: () -> Unit = {},
    showBack: Boolean = true,
    modifier: Modifier = Modifier.padding(8.dp)
) {
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.fillMaxWidth()
    ) {
        if (showBack) {
            IconButton(onClick = navBack, modifier = Modifier.weight(1F, fill = false)) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back Button")
            }
        }
        TextHeadlineMedium(
            text = title,
            modifier = Modifier
                .weight(3F)
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TopAppBarPreview() {
    ServerDrivenUISampleTheme {
        IndodanaTopAppBar(
            title = stringResource(R.string.app_name),
            showBack = false,
            modifier = Modifier
        )
    }
}