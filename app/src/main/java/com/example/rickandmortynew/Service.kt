package com.example.rickandmortynew

import retrofit2.Call
import retrofit2.http.GET


interface Service {
    @GET("/api/character/")
    fun characters(): Call<Response.Characters>
}