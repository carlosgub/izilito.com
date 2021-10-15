import androidx.compose.runtime.Composable
import components.Layout
import components.MainContentLayout
import content.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable
import style.AppStylesheet

fun main() {
    renderComposable(rootElementId = "root") {
        Style(AppStylesheet)

        Layout {
            MainPage()
//            Header()
//            MainContentLayout {
//                Intro()
//                ComposeWebLibraries()
//                GetStarted()
//                JoinUs()
//            }
//            PageFooter()
        }
    }
}