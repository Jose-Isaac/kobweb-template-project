package br.com.campos.projectname.components.layouts.baselayout

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.silk.components.style.toAttrs
import br.com.campos.projectname.utils.isAuthenticatedInSite
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.ElementScope
import org.w3c.dom.HTMLDivElement

@Composable
fun BaseLayout(
    content: @Composable ElementScope<HTMLDivElement>.() -> Unit,
) {
    isAuthenticatedInSite()

    Div(attrs = listOf(BaseLayoutContainer).toAttrs()) {
        content()
    }
}
