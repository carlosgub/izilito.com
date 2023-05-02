package org.carlosgub.izilito.com.components.widgets.button

import androidx.compose.runtime.Composable
import androidx.compose.web.events.SyntheticMouseEvent
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.BoxScope
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.forms.Button
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun IconButton(onClick: (SyntheticMouseEvent) -> Unit, modifier: Modifier = Modifier, icon: @Composable BoxScope.() -> Unit) {
    Button(onClick, modifier.padding(0.px).borderRadius(50.percent)) {
        Box(Modifier.padding(8.px), content = icon)
    }
}
