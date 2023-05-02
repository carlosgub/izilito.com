package org.carlosgub.izilito.com.components.widgets.card

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.ColumnScope
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.base
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.toSilkPalette
import org.carlosgub.izilito.com.components.widgets.dom.StyledDiv
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

val ArticleSectionStyle = ComponentStyle.base("bs-article-section") {
    Modifier
        .fillMaxWidth()
        .margin(top = 1.5.cssRem)
        .padding(1.cssRem)
        .border(1.px, LineStyle.Solid, colorMode.toSilkPalette().border)
        .borderRadius(5.px)
}

val ArticleTitleStyle = ComponentStyle.base("bs-article-title") {
    Modifier.fontWeight(FontWeight.Bold)
}

@Composable
fun Card(
    content: @Composable ColumnScope.() -> Unit
) {
    StyledDiv(ArticleSectionStyle) {
        ColumnScope().content()
    }
}