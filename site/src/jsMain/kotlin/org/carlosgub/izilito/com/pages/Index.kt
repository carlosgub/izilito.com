package org.carlosgub.izilito.com.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.dom.ElementTarget
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaMastodon
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.navigation.UndecoratedLinkVariant
import com.varabyte.kobweb.silk.components.overlay.PopupPlacement
import com.varabyte.kobweb.silk.components.overlay.Tooltip
import com.varabyte.kobweb.silk.components.style.*
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.theme.toSilkPalette
import org.carlosgub.izilito.com.components.sections.Footer
import org.carlosgub.izilito.com.components.sections.NavHeader
import org.carlosgub.izilito.com.components.widgets.card.Card
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

val CenterColumnStyle = ComponentStyle("bs-center-column") {
    base { Modifier.fillMaxWidth(90.percent) }
    Breakpoint.MD { Modifier.fillMaxWidth(80.percent) }
}
val ImageStyle = ComponentStyle("bs-image") {
    base { Modifier.fillMaxWidth(50.percent).margin(top = 20.px) }
    Breakpoint.MD { Modifier.fillMaxWidth(40.percent).margin(top = 20.px) }
}

@Page
@Composable
fun HomePage() {
    Box(
        modifier = Modifier.fillMaxSize().minHeight(100.percent).styleModifier {
            // Create a box with two rows: the main content (fills as much space as it can) and the footer (which reserves
            // space at the bottom). "auto" means the use the height of the row. "1fr" means give the rest of the space to
            // that row. Since this box is set to *at least* 100%, the footer will always appear at least on the bottom but
            // can be pushed further down if the first row grows beyond the page.
            gridTemplateRows("1fr auto")
        }, contentAlignment = Alignment.TopCenter
    ) {

        Column(
            modifier = Modifier.fillMaxSize().maxWidth(800.px).align(Alignment.TopCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NavHeader()
            Column(
                CenterColumnStyle.toModifier(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Card {
                    Column(
                        Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        P(attrs = TextStyle.toModifier().toAttrs()) {
                            Text("Team Members:")
                        }
                        TeamMember("SpetNazPe")
                        TeamMember("Sasumi")
                        TeamMember("Edulara97")
                        TeamMember("TeffyHappy")
                        TeamMember("Caso")
                        TeamMember("Oscarito")
                        TeamMember("Fer")
                    }
                }
                Image(src = "/meme.png", modifier = ImageStyle.toModifier())
                P(attrs = TextStyle.toModifier().toAttrs()) {
                    Text("Izilito el tutorial bro")
                }
            }
        }
        Footer(Modifier.styleModifier {
            // Associate the footer with the row that will get pushed off the bottom of the page if it can't fit.
            gridRowStart(2); gridRowEnd(3)
        })
    }
}

val TextStyle by ComponentStyle {
    base {
        Modifier.fontSize(20.px)
            .padding(0.px)
            .fontWeight(FontWeight.Bold)
            .margin(0.px)
    }
}

@Composable
fun TeamMember(name: String) {
    P(attrs = TextStyle.toAttrs()) {
        Text("TW $name")
    }
}
