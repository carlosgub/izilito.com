package org.carlosgub.izilito.com.components.widgets.button

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.silk.components.icons.fa.FaLightbulb
import com.varabyte.kobweb.silk.components.icons.fa.IconStyle
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.rememberColorMode
import org.jetbrains.compose.web.css.DisplayStyle

@Composable
fun ColorModeButton(modifier: Modifier = Modifier.display(DisplayStyle.InlineBlock)) {
    var colorMode by rememberColorMode()
    IconButton(
        onClick = { colorMode = colorMode.opposite() },
        modifier
    ) {
        when (colorMode) {
            ColorMode.LIGHT -> FaLightbulb(style = IconStyle.OUTLINE)
            ColorMode.DARK -> FaLightbulb(style = IconStyle.FILLED)
        }
    }
}