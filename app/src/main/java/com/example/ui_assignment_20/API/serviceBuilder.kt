package com.example.ui_assignment_20.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object serviceBuilder {
    val base_url = "https://api.inopenapp.com/api/v1/"
    fun getInstance():Retrofit{
        return Retrofit.Builder()
            .baseUrl(base_url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    }
}