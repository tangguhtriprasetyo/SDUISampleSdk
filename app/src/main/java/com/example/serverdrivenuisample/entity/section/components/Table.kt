package com.example.serverdrivenuisample.entity.section.components

data class Table(
    val headers: List<String>,
    val data: List<List<String>>
) : Component(ComponentType.TABLE)