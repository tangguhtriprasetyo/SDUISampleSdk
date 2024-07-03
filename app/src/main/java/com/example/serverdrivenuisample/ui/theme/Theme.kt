package com.example.serverdrivenuisample.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = IndodanaPrimaryWhite,
    secondary = IndodanaPrimaryGreen,
    tertiary = IndodanaPrimaryWhite,
    background = IndodanaPrimaryWhite,
    surface = IndodanaPrimaryWhite,
    onPrimary = IndodanaPrimaryGreen,
    onSecondary = IndodanaPrimaryOrange,
    onBackground = IndodanaPrimaryGreen,
    onSurface = IndodanaPrimaryBlack
)

private val LightColorScheme = lightColorScheme(
    primary = IndodanaPrimaryWhite,
    secondary = IndodanaPrimaryGreen,
    tertiary = IndodanaPrimaryOrange,
    background = IndodanaPrimaryWhite,
    surface = IndodanaPrimaryWhite,
    onPrimary = IndodanaPrimaryBlack,
    onSecondary = IndodanaPrimaryWhite,
    onTertiary = IndodanaShadesYellow80,
    onBackground = IndodanaPrimaryBlack,
    onSurface = IndodanaPrimaryBlack

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun ServerDrivenUISampleTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = LightColorScheme
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view)
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}