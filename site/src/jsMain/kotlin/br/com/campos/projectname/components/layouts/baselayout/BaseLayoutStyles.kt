package br.com.campos.projectname.components.layouts.baselayout

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.silk.components.style.ComponentStyle


val BaseLayoutContainer by ComponentStyle {
    base {
        Modifier
            .fillMaxSize()
    }
}
