package com.example.filterapi.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.filterapi.api.FilterApiService
import com.example.filterapi.api.Network
import com.example.filterapi.model.CarFilter
import com.example.filterapi.model.CarFilters
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FilterRepository {

    fun getFilterPredicates(): MutableLiveData<CarFilters>? {
        val carFilters: MutableLiveData<CarFilters>? = MutableLiveData()
        val retrofit = Network.retrofit.create(FilterApiService::class.java)
        val call: Call<CarFilters> = retrofit.getFilterPredicate()
        call.enqueue( object : Callback<CarFilters>{
            override fun onFailure(call: Call<CarFilters>, t: Throwable) {
                Log.d("error", t.message!!)
                carFilters?.value = null
            }

            override fun onResponse(call: Call<CarFilters>, response: Response<CarFilters>) {
                if(response.isSuccessful){
                    carFilters?.value = response.body()
                }
            }
        })

        return carFilters
    }
}