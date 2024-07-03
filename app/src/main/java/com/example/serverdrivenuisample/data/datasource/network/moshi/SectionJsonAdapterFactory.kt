package com.example.serverdrivenuisample.data.datasource.network.moshi

import com.example.serverdrivenuisample.entity.section.ComponentSection
import com.example.serverdrivenuisample.entity.section.LayoutSection
import com.example.serverdrivenuisample.entity.section.Section
import com.example.serverdrivenuisample.entity.section.SectionType
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory
import java.lang.reflect.Type

class SectionJsonAdapterFactory : JsonAdapter.Factory {
    override fun create(
        type: Type,
        annotations: MutableSet<out Annotation>,
        moshi: Moshi
    ): JsonAdapter<*>? {
        val rawType = Types.getRawType(type)

        if (rawType.isAssignableFrom(Section::class.java)) {
            return PolymorphicJsonAdapterFactory.of(Section::class.java, "type")
                .withSubtype(LayoutSection::class.java, SectionType.LAYOUT.name)
                .withSubtype(ComponentSection::class.java, SectionType.COMPONENT.name)
                .create(type, annotations, moshi)
        }
        return null
    }
}