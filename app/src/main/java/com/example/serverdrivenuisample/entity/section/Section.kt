package com.example.serverdrivenuisample.entity.section

import com.example.serverdrivenuisample.entity.section.components.Component
import com.squareup.moshi.Json

sealed class Section(@Json(name = "type") val type: SectionType)
data class LayoutSection(
    val layout: LayoutType,
    val components: List<Component>
) : Section(SectionType.LAYOUT)

data class ComponentSection(
    val component: Component
) : Section(SectionType.COMPONENT)

enum class SectionType {
    LAYOUT,
    COMPONENT
}

enum class LayoutType {
    COLUMN,
    ROW,
    BOX
}

