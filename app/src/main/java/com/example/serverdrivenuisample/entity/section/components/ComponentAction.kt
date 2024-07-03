package com.example.serverdrivenuisample.entity.section.components

import com.squareup.moshi.Json

sealed class ComponentAction(@Json(name = "action") val action: ActionType)

data class ActionToast(
    val title: String
) : ComponentAction(ActionType.TOAST)

data class ActionDeeplink(
    val deeplink: String
) : ComponentAction(ActionType.DEEPLINK)

enum class ActionType {
    TOAST,
    DEEPLINK
}


