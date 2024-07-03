package com.example.serverdrivenuisample.entity.section.components

data class TopNavbar(
    val title: String,
    val showBack: Boolean
) : Component(ComponentType.TOP_NAVBAR)