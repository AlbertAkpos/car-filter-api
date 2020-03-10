package com.example.filterapi.api

import com.example.filterapi.util.Utility
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Network {

    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(Utility.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()


}