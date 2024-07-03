package com.example.serverdrivenuisample.entity.section.components

data class Text(
    val text: String,
    val style: IndodanaTextStyle = IndodanaTextStyle.TITLE_LARGE
) : Component(ComponentType.TEXT)

enum class IndodanaTextStyle {
    HEADLINE_LARGE,
    HEADLINE_MEDIUM,
    HEADLINE_SMALL,
    TITLE_LARGE,
    TITLE_MEDIUM,
    TITLE_SMALL,
    BODY_LARGE,
    BODY_MEDIUM,
    BODY_SMALL,
    LABEL_LARGE,
    LABEL_MEDIUM,
    LABEL_SMALL
}
