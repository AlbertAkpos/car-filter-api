package com.example.filterapi.api

import com.example.filterapi.model.CarFilters
import retrofit2.Call
import retrofit2.http.GET

interface FilterApiService {
    @GET("accounts")
    fun getFilterPredicate(): Call<CarFilters>
}