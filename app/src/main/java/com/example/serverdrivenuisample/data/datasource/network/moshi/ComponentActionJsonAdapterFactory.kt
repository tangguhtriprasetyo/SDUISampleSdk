package com.example.serverdrivenuisample.data.datasource.network.moshi

import com.example.serverdrivenuisample.entity.section.components.ActionDeeplink
import com.example.serverdrivenuisample.entity.section.components.ActionToast
import com.example.serverdrivenuisample.entity.section.components.ActionType
import com.example.serverdrivenuisample.entity.section.components.ComponentAction
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory
import java.lang.reflect.Type

class ComponentActionJsonAdapterFactory : JsonAdapter.Factory {
    override fun create(
        type: Type,
        annotations: MutableSet<out Annotation>,
        moshi: Moshi
    ): JsonAdapter<*>? {
        val rawType = Types.getRawType(type)

        if (rawType.isAssignableFrom(ComponentAction::class.java)) {
            return PolymorphicJsonAdapterFactory.of(ComponentAction::class.java, "action")
                .withSubtype(ActionToast::class.java, ActionType.TOAST.name)
                .withSubtype(ActionDeeplink::class.java, ActionType.DEEPLINK.name)
                .create(type, annotations, moshi)
        }
        return null
    }
}