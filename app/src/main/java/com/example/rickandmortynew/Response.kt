package com.example.rickandmortynew

class Response {

    data class CharactersSpisok(
        val data: ArrayList<CharactersSpisokItems>,
        val success: Boolean
    )

    data class CharactersSpisokItems(
        val id: String,
        val name: String,
        val photo: String
    )
}