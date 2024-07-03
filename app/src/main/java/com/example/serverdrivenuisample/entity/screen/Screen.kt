package com.example.serverdrivenuisample.entity.screen

import com.example.serverdrivenuisample.entity.section.LayoutType
import com.example.serverdrivenuisample.entity.section.Section

data class Screen(
    val parentLayout: LayoutType,
    val sections: List<Section>
)