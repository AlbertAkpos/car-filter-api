package com.example.filterapi.model

typealias carOwners = ArrayList<CarOwner>

data class CarOwner(
    val firstName: String,
    val lastName: String,
    val email: String,
    val country: String,
    val carModel: String,
    val carModelYear: String,
    val carColor: String,
    val gender: String,
    val jobTitle: String,
    val bio: String
)