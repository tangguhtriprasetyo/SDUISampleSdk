package com.example.serverdrivenuisample.data.datasource.network.moshi

import com.example.serverdrivenuisample.entity.section.components.Banner
import com.example.serverdrivenuisample.entity.section.components.Button
import com.example.serverdrivenuisample.entity.section.components.Component
import com.example.serverdrivenuisample.entity.section.components.ComponentType
import com.example.serverdrivenuisample.entity.section.components.Spacer
import com.example.serverdrivenuisample.entity.section.components.Table
import com.example.serverdrivenuisample.entity.section.components.Text
import com.example.serverdrivenuisample.entity.section.components.TopNavbar
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory
import java.lang.reflect.Type

class ComponentJsonAdapterFactory : JsonAdapter.Factory {
    override fun create(
        type: Type,
        annotations: MutableSet<out Annotation>,
        moshi: Moshi
    ): JsonAdapter<*>? {
        val rawType = Types.getRawType(type)

        if (rawType.isAssignableFrom(Component::class.java)) {
            return PolymorphicJsonAdapterFactory.of(Component::class.java, "component")
                .withSubtype(Banner::class.java, ComponentType.BANNER.name)
                .withSubtype(Button::class.java, ComponentType.BUTTON.name)
                .withSubtype(Table::class.java, ComponentType.TABLE.name)
                .withSubtype(Text::class.java, ComponentType.TEXT.name)
                .withSubtype(TopNavbar::class.java, ComponentType.TOP_NAVBAR.name)
                .withSubtype(Spacer::class.java, ComponentType.SPACER.name)
                .create(type, annotations, moshi)
        }
        return null
    }
}