package com.example.filterapi.model

typealias CarFilters = ArrayList<CarFilter>

data class CarFilter (
    val id: String,
    val avatar: String,
    val fullName: String,
    val createdAt: String,
    val gender: String,
    val colors: List<String>,
    val countries: List<String>
)

