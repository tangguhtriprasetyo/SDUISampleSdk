package com.example.serverdrivenuisample.ui.components.loading

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun IndodanaProgressIndicator(
    progress: Float,
    modifier: Modifier = Modifier
) {
    Box(contentAlignment = Alignment.Center, modifier = modifier.fillMaxSize()) {
        CircularProgressIndicator(
            progress = progress,
            modifier = modifier.size(64.dp),
            color = MaterialTheme.colorScheme.secondary,
            strokeWidth = 4.dp
        )
    }
}

@Composable
fun IndodanaLinearProgressIndicator(
    progress: Float,
    modifier: Modifier = Modifier
) {
    Box(contentAlignment = Alignment.Center, modifier = modifier.fillMaxSize()) {
        LinearProgressIndicator(
            progress = progress,
            modifier = modifier.height(4.dp),
            color = MaterialTheme.colorScheme.primary,
            trackColor = MaterialTheme.colorScheme.secondary
        )
    }
}

@Preview
@Composable
fun ProgressIndicatorPreview() {
    IndodanaProgressIndicator(100f)
}