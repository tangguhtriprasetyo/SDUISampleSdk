package com.example.serverdrivenuisample.entity.section.components

import com.squareup.moshi.Json

sealed class Component(@Json(name = "component") val component: ComponentType)

enum class ComponentType {
    TEXT,
    BANNER,
    BUTTON,
    TOP_NAVBAR,
    TABLE,
    SPACER
}
