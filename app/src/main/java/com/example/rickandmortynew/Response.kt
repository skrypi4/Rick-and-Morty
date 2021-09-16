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

    data class Characters(
        val data: ArrayList<CharactersItems>,
        val success: Boolean
    )

    data class CharactersItems(
        val created: String,
        val episode: List<String>,
        val gender: String,
        val id: Int,
        val image: String,
        val location: LocationFromCharacter,
        val name: String,
        val origin: Origin,
        val species: String,
        val status: String,
        val type: String,
        val url: String
    )

    data class LocationFromCharacter(
        val name: String,
        val url: String
    )

    data class Origin(
        val name: String,
        val url: String
    )

    data class Location(
        val data: ArrayList<LocationItems>,
        val success: Boolean
    )

    data class LocationItems(
        val created: String,
        val dimension: String,
        val id: Int,
        val name: String,
        val residents: List<String>,
        val type: String,
        val url: String
    )

    data class Episode(
        val data: ArrayList<EpisodeItems>,
        val success: Boolean
    )

    data class EpisodeItems(
        val air_date: String,
        val characters: List<String>,
        val created: String,
        val episode: String,
        val id: Int,
        val name: String,
        val url: String
    )
}