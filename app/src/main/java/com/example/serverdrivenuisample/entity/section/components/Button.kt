package com.example.serverdrivenuisample.entity.section.components

data class Button(
    val title: String,
    val buttonType: ButtonType,
    val buttonModifier: ButtonModifier? = null,
    val action: ComponentAction
) : Component(ComponentType.BUTTON)

data class ButtonModifier(
    val topPadding: Int = 8,
    val bottomPadding: Int = 8,
    val startPadding: Int = 8,
    val endPadding: Int = 8,
    val fillMaxWidth: Boolean = true
)

enum class ButtonType {
    PRIMARY,
    SECONDARY
}

