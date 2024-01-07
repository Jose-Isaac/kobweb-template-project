package br.com.campos.projectname.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import br.com.campos.projectname.utils.isAuthenticatedInSite
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage() {
    isAuthenticatedInSite()

    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text("THIS PAGE INTENTIONALLY LEFT BLANK")
    }
}
