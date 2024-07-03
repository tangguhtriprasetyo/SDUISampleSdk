package com.example.serverdrivenuisample.data.datasource.network

import com.example.serverdrivenuisample.data.datasource.network.NetworkConstant.TIMEOUT
import com.example.serverdrivenuisample.data.datasource.network.moshi.ComponentActionJsonAdapterFactory
import com.example.serverdrivenuisample.data.datasource.network.moshi.ComponentJsonAdapterFactory
import com.example.serverdrivenuisample.data.datasource.network.moshi.SectionJsonAdapterFactory
import com.example.serverdrivenuisample.entity.screen.Screen
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
object NetworkProvider {
    private val okHttpBuilder by lazy {
        OkHttpClient.Builder()
            .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(TIMEOUT, TimeUnit.SECONDS)
            .writeTimeout(TIMEOUT, TimeUnit.SECONDS)
            .build()
    }

    private val moshi: Moshi by lazy {
        Moshi.Builder()
            .add(ComponentJsonAdapterFactory())
            .add(ComponentActionJsonAdapterFactory())
            .add(SectionJsonAdapterFactory())
            .add(KotlinJsonAdapterFactory())
            .build()
    }

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("http://127.0.0.1/")
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .client(okHttpBuilder)
            .build()
    }

    val apiService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }

    fun mockResponse(json: String): Screen? {
        val jsonAdapter: JsonAdapter<Screen> = moshi.adapter(Screen::class.java)

        return try {
            jsonAdapter.fromJson(json)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}