package content

import androidx.compose.runtime.Composable
import components.ContainerInSection
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Text
import style.*

val squadNames = listOf("TW SpetNazPe", "TW Edulara97", "TW TeffyHappy")

@Composable
fun MainPage() {

    ContainerInSection(WtSections.wtSectionBgGrayDark) {
        Div({
            classes(
                WtCols.wtCol10,
                WtCols.wtColMd8,
                WtCols.wtColSm12
            )
        }) {
            H1(attrs = {
                classes(WtTexts.wtHero)
                style {
                    color(Color("#fff"))
                    textAlign("center")
                }
            }) {
                Text("Hola, si una de estas personas te ganó:")
            }
        }

        Div(attrs = {
            classes(WtRows.wtRowSmAlignItemsCenter)
            style {
                marginTop(24.px)
            }
        }) {
            squadNames.forEach {
                Div({
                    classes(
                        WtCols.wtCol10,
                        WtCols.wtColMd8,
                        WtCols.wtColSm12
                    )
                }) {
                    H1(attrs = {
                        classes(
                            WtTexts.wtH2
                        )
                        style {
                            color(Color("#fff"))
                            marginTop(8.px)
                            textAlign("center")
                        }
                    }) {
                        Text(it)
                    }
                }
            }
        }

        Div({
            classes(
                WtCols.wtCol10,
                WtCols.wtColMd8,
                WtCols.wtColSm12
            )
            style {
                marginTop(24.px)
            }
        }) {
            H1(attrs = {
                classes(WtTexts.wtHero)
                style {
                    color(Color("#fff"))
                    textAlign("center")
                }
            }) {
                Text("facilito el tutorial bro")
            }
        }

        Div(attrs = {
            classes(
                WtCols.wtCol10,
                WtCols.wtColMd8,
                WtCols.wtColSm12
            )
            style {
                marginTop(500.px)
            }
        }) {
            H1(attrs = {
                classes(WtTexts.wtText3)
                style {
                    color(Color("#fff"))
                    textAlign("end")
                }
            }) {
                Text("Made with Kotlin Compose :D, @carlosgub")
            }
        }
    }
}