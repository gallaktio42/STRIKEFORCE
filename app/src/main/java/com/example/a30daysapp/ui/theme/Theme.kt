package com.example.compose

import android.app.Activity
import android.os.Build
import android.view.View
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.example.a30daysapp.ui.theme.AppTypography
import com.example.a30daysapp.ui.theme.backgroundDark
import com.example.a30daysapp.ui.theme.backgroundDarkHighContrast
import com.example.a30daysapp.ui.theme.backgroundDarkMediumContrast
import com.example.a30daysapp.ui.theme.backgroundLight
import com.example.a30daysapp.ui.theme.backgroundLightHighContrast
import com.example.a30daysapp.ui.theme.backgroundLightMediumContrast
import com.example.a30daysapp.ui.theme.errorContainerDark
import com.example.a30daysapp.ui.theme.errorContainerDarkHighContrast
import com.example.a30daysapp.ui.theme.errorContainerDarkMediumContrast
import com.example.a30daysapp.ui.theme.errorContainerLight
import com.example.a30daysapp.ui.theme.errorContainerLightHighContrast
import com.example.a30daysapp.ui.theme.errorContainerLightMediumContrast
import com.example.a30daysapp.ui.theme.errorDark
import com.example.a30daysapp.ui.theme.errorDarkHighContrast
import com.example.a30daysapp.ui.theme.errorDarkMediumContrast
import com.example.a30daysapp.ui.theme.errorLight
import com.example.a30daysapp.ui.theme.errorLightHighContrast
import com.example.a30daysapp.ui.theme.errorLightMediumContrast
import com.example.a30daysapp.ui.theme.inverseOnSurfaceDark
import com.example.a30daysapp.ui.theme.inverseOnSurfaceDarkHighContrast
import com.example.a30daysapp.ui.theme.inverseOnSurfaceDarkMediumContrast
import com.example.a30daysapp.ui.theme.inverseOnSurfaceLight
import com.example.a30daysapp.ui.theme.inverseOnSurfaceLightHighContrast
import com.example.a30daysapp.ui.theme.inverseOnSurfaceLightMediumContrast
import com.example.a30daysapp.ui.theme.inversePrimaryDark
import com.example.a30daysapp.ui.theme.inversePrimaryDarkHighContrast
import com.example.a30daysapp.ui.theme.inversePrimaryDarkMediumContrast
import com.example.a30daysapp.ui.theme.inversePrimaryLight
import com.example.a30daysapp.ui.theme.inversePrimaryLightHighContrast
import com.example.a30daysapp.ui.theme.inversePrimaryLightMediumContrast
import com.example.a30daysapp.ui.theme.inverseSurfaceDark
import com.example.a30daysapp.ui.theme.inverseSurfaceDarkHighContrast
import com.example.a30daysapp.ui.theme.inverseSurfaceDarkMediumContrast
import com.example.a30daysapp.ui.theme.inverseSurfaceLight
import com.example.a30daysapp.ui.theme.inverseSurfaceLightHighContrast
import com.example.a30daysapp.ui.theme.inverseSurfaceLightMediumContrast
import com.example.a30daysapp.ui.theme.onBackgroundDark
import com.example.a30daysapp.ui.theme.onBackgroundDarkHighContrast
import com.example.a30daysapp.ui.theme.onBackgroundDarkMediumContrast
import com.example.a30daysapp.ui.theme.onBackgroundLight
import com.example.a30daysapp.ui.theme.onBackgroundLightHighContrast
import com.example.a30daysapp.ui.theme.onBackgroundLightMediumContrast
import com.example.a30daysapp.ui.theme.onErrorContainerDark
import com.example.a30daysapp.ui.theme.onErrorContainerDarkHighContrast
import com.example.a30daysapp.ui.theme.onErrorContainerDarkMediumContrast
import com.example.a30daysapp.ui.theme.onErrorContainerLight
import com.example.a30daysapp.ui.theme.onErrorContainerLightHighContrast
import com.example.a30daysapp.ui.theme.onErrorContainerLightMediumContrast
import com.example.a30daysapp.ui.theme.onErrorDark
import com.example.a30daysapp.ui.theme.onErrorDarkHighContrast
import com.example.a30daysapp.ui.theme.onErrorDarkMediumContrast
import com.example.a30daysapp.ui.theme.onErrorLight
import com.example.a30daysapp.ui.theme.onErrorLightHighContrast
import com.example.a30daysapp.ui.theme.onErrorLightMediumContrast
import com.example.a30daysapp.ui.theme.onPrimaryContainerDark
import com.example.a30daysapp.ui.theme.onPrimaryContainerDarkHighContrast
import com.example.a30daysapp.ui.theme.onPrimaryContainerDarkMediumContrast
import com.example.a30daysapp.ui.theme.onPrimaryContainerLight
import com.example.a30daysapp.ui.theme.onPrimaryContainerLightHighContrast
import com.example.a30daysapp.ui.theme.onPrimaryContainerLightMediumContrast
import com.example.a30daysapp.ui.theme.onPrimaryDark
import com.example.a30daysapp.ui.theme.onPrimaryDarkHighContrast
import com.example.a30daysapp.ui.theme.onPrimaryDarkMediumContrast
import com.example.a30daysapp.ui.theme.onPrimaryLight
import com.example.a30daysapp.ui.theme.onPrimaryLightHighContrast
import com.example.a30daysapp.ui.theme.onPrimaryLightMediumContrast
import com.example.a30daysapp.ui.theme.onSecondaryContainerDark
import com.example.a30daysapp.ui.theme.onSecondaryContainerDarkHighContrast
import com.example.a30daysapp.ui.theme.onSecondaryContainerDarkMediumContrast
import com.example.a30daysapp.ui.theme.onSecondaryContainerLight
import com.example.a30daysapp.ui.theme.onSecondaryContainerLightHighContrast
import com.example.a30daysapp.ui.theme.onSecondaryContainerLightMediumContrast
import com.example.a30daysapp.ui.theme.onSecondaryDark
import com.example.a30daysapp.ui.theme.onSecondaryDarkHighContrast
import com.example.a30daysapp.ui.theme.onSecondaryDarkMediumContrast
import com.example.a30daysapp.ui.theme.onSecondaryLight
import com.example.a30daysapp.ui.theme.onSecondaryLightHighContrast
import com.example.a30daysapp.ui.theme.onSecondaryLightMediumContrast
import com.example.a30daysapp.ui.theme.onSurfaceDark
import com.example.a30daysapp.ui.theme.onSurfaceDarkHighContrast
import com.example.a30daysapp.ui.theme.onSurfaceDarkMediumContrast
import com.example.a30daysapp.ui.theme.onSurfaceLight
import com.example.a30daysapp.ui.theme.onSurfaceLightHighContrast
import com.example.a30daysapp.ui.theme.onSurfaceLightMediumContrast
import com.example.a30daysapp.ui.theme.onSurfaceVariantDark
import com.example.a30daysapp.ui.theme.onSurfaceVariantDarkHighContrast
import com.example.a30daysapp.ui.theme.onSurfaceVariantDarkMediumContrast
import com.example.a30daysapp.ui.theme.onSurfaceVariantLight
import com.example.a30daysapp.ui.theme.onSurfaceVariantLightHighContrast
import com.example.a30daysapp.ui.theme.onSurfaceVariantLightMediumContrast
import com.example.a30daysapp.ui.theme.onTertiaryContainerDark
import com.example.a30daysapp.ui.theme.onTertiaryContainerDarkHighContrast
import com.example.a30daysapp.ui.theme.onTertiaryContainerDarkMediumContrast
import com.example.a30daysapp.ui.theme.onTertiaryContainerLight
import com.example.a30daysapp.ui.theme.onTertiaryContainerLightHighContrast
import com.example.a30daysapp.ui.theme.onTertiaryContainerLightMediumContrast
import com.example.a30daysapp.ui.theme.onTertiaryDark
import com.example.a30daysapp.ui.theme.onTertiaryDarkHighContrast
import com.example.a30daysapp.ui.theme.onTertiaryDarkMediumContrast
import com.example.a30daysapp.ui.theme.onTertiaryLight
import com.example.a30daysapp.ui.theme.onTertiaryLightHighContrast
import com.example.a30daysapp.ui.theme.onTertiaryLightMediumContrast
import com.example.a30daysapp.ui.theme.outlineDark
import com.example.a30daysapp.ui.theme.outlineDarkHighContrast
import com.example.a30daysapp.ui.theme.outlineDarkMediumContrast
import com.example.a30daysapp.ui.theme.outlineLight
import com.example.a30daysapp.ui.theme.outlineLightHighContrast
import com.example.a30daysapp.ui.theme.outlineLightMediumContrast
import com.example.a30daysapp.ui.theme.outlineVariantDark
import com.example.a30daysapp.ui.theme.outlineVariantDarkHighContrast
import com.example.a30daysapp.ui.theme.outlineVariantDarkMediumContrast
import com.example.a30daysapp.ui.theme.outlineVariantLight
import com.example.a30daysapp.ui.theme.outlineVariantLightHighContrast
import com.example.a30daysapp.ui.theme.outlineVariantLightMediumContrast
import com.example.a30daysapp.ui.theme.primaryContainerDark
import com.example.a30daysapp.ui.theme.primaryContainerDarkHighContrast
import com.example.a30daysapp.ui.theme.primaryContainerDarkMediumContrast
import com.example.a30daysapp.ui.theme.primaryContainerLight
import com.example.a30daysapp.ui.theme.primaryContainerLightHighContrast
import com.example.a30daysapp.ui.theme.primaryContainerLightMediumContrast
import com.example.a30daysapp.ui.theme.primaryDark
import com.example.a30daysapp.ui.theme.primaryDarkHighContrast
import com.example.a30daysapp.ui.theme.primaryDarkMediumContrast
import com.example.a30daysapp.ui.theme.primaryLight
import com.example.a30daysapp.ui.theme.primaryLightHighContrast
import com.example.a30daysapp.ui.theme.primaryLightMediumContrast
import com.example.a30daysapp.ui.theme.scrimDark
import com.example.a30daysapp.ui.theme.scrimDarkHighContrast
import com.example.a30daysapp.ui.theme.scrimDarkMediumContrast
import com.example.a30daysapp.ui.theme.scrimLight
import com.example.a30daysapp.ui.theme.scrimLightHighContrast
import com.example.a30daysapp.ui.theme.scrimLightMediumContrast
import com.example.a30daysapp.ui.theme.secondaryContainerDark
import com.example.a30daysapp.ui.theme.secondaryContainerDarkHighContrast
import com.example.a30daysapp.ui.theme.secondaryContainerDarkMediumContrast
import com.example.a30daysapp.ui.theme.secondaryContainerLight
import com.example.a30daysapp.ui.theme.secondaryContainerLightHighContrast
import com.example.a30daysapp.ui.theme.secondaryContainerLightMediumContrast
import com.example.a30daysapp.ui.theme.secondaryDark
import com.example.a30daysapp.ui.theme.secondaryDarkHighContrast
import com.example.a30daysapp.ui.theme.secondaryDarkMediumContrast
import com.example.a30daysapp.ui.theme.secondaryLight
import com.example.a30daysapp.ui.theme.secondaryLightHighContrast
import com.example.a30daysapp.ui.theme.secondaryLightMediumContrast
import com.example.a30daysapp.ui.theme.surfaceDark
import com.example.a30daysapp.ui.theme.surfaceDarkHighContrast
import com.example.a30daysapp.ui.theme.surfaceDarkMediumContrast
import com.example.a30daysapp.ui.theme.surfaceLight
import com.example.a30daysapp.ui.theme.surfaceLightHighContrast
import com.example.a30daysapp.ui.theme.surfaceLightMediumContrast
import com.example.a30daysapp.ui.theme.surfaceVariantDark
import com.example.a30daysapp.ui.theme.surfaceVariantDarkHighContrast
import com.example.a30daysapp.ui.theme.surfaceVariantDarkMediumContrast
import com.example.a30daysapp.ui.theme.surfaceVariantLight
import com.example.a30daysapp.ui.theme.surfaceVariantLightHighContrast
import com.example.a30daysapp.ui.theme.surfaceVariantLightMediumContrast
import com.example.a30daysapp.ui.theme.tertiaryContainerDark
import com.example.a30daysapp.ui.theme.tertiaryContainerDarkHighContrast
import com.example.a30daysapp.ui.theme.tertiaryContainerDarkMediumContrast
import com.example.a30daysapp.ui.theme.tertiaryContainerLight
import com.example.a30daysapp.ui.theme.tertiaryContainerLightHighContrast
import com.example.a30daysapp.ui.theme.tertiaryContainerLightMediumContrast
import com.example.a30daysapp.ui.theme.tertiaryDark
import com.example.a30daysapp.ui.theme.tertiaryDarkHighContrast
import com.example.a30daysapp.ui.theme.tertiaryDarkMediumContrast
import com.example.a30daysapp.ui.theme.tertiaryLight
import com.example.a30daysapp.ui.theme.tertiaryLightHighContrast
import com.example.a30daysapp.ui.theme.tertiaryLightMediumContrast

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
// Dynamic color is available on Android 12+
// Dynamic color in this app is turned off for learning purposes
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> darkScheme
        else -> lightScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            setUpEdgeToEdge(view, darkTheme)
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.background.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }
    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        content = content
    )
}

private fun setUpEdgeToEdge(view: View, darkTheme: Boolean) {
    val window = (view.context as Activity).window
    WindowCompat.setDecorFitsSystemWindows(window, false)
    window.statusBarColor = Color.Transparent.toArgb()
    val navigationBarColor = when {
        Build.VERSION.SDK_INT >= 29 -> Color.Transparent.toArgb()
        Build.VERSION.SDK_INT >= 26 -> Color(0xFF, 0xFF, 0xFF, 0x63).toArgb()
// Min sdk version for this app is 24, this block is for SDK versions 24 and 25
        else -> Color(0x00, 0x00, 0x00, 0x50).toArgb()
    }
    window.navigationBarColor = navigationBarColor
    val controller = WindowCompat.getInsetsController(window, view)
    controller.isAppearanceLightStatusBars = !darkTheme
    controller.isAppearanceLightNavigationBars = !darkTheme
}

