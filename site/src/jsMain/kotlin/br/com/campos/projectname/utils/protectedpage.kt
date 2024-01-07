package br.com.campos.projectname.utils

import kotlinx.browser.localStorage
import kotlinx.browser.window

fun isAuthenticatedInSite() {
    val accessToken = localStorage.getItem(ACCESS_TOKEN)
    val refreshToken = localStorage.getItem(REFRESH_TOKEN)
    val currentPath = window.location.pathname

    if (currentPath == "/login/") return

    if (accessToken.isNullOrEmpty() || refreshToken.isNullOrEmpty()) {
        window.location.pathname = "/login/"
    }
}
