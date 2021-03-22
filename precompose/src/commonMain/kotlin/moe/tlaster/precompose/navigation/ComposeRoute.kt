package moe.tlaster.precompose.navigation

import androidx.compose.runtime.Composable

data class ComposeRoute(
    override val route: String,
    val content: @Composable (RouteStackManager.Stack) -> Unit,
): Route {
    override val pathKeys by lazy {
        RouteParser.pathKeys(pattern = route)
    }
}