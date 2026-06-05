package com.matinsenpai.senpaiscanner.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = SenPaiOrange,
    secondary = SenPaiOrange,
    tertiary = SenPaiOrange,
    background = SenPaiDarkBackground,
    surface = SenPaiDarkSurface,
    onPrimary = SenPaiDarkBackground,
    onSecondary = SenPaiDarkBackground,
    onTertiary = SenPaiDarkBackground,
    onBackground = SenPaiTextPrimary,
    onSurface = SenPaiTextPrimary,
    error = SenPaiError,
    onError = SenPaiDarkBackground
)

@Composable
fun SenPaiScannerTheme(
  // We force dark theme for SenPaiScanner aesthetic
  darkTheme: Boolean = true,
  dynamicColor: Boolean = false,
  content: @Composable () -> Unit,
) {
  MaterialTheme(colorScheme = DarkColorScheme, typography = Typography, content = content)
}
