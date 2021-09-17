package com.example.rickandmortynew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import retrofit2.Call

class CharacterSpisok : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_spisok)

        var items: ArrayList<Response.CharactersItems>? = null

        val service = ServiceBuilder.buildService(Service::class.java).characters().enqueue(object: retrofit2.Callback<Response.Characters> {
            override fun onResponse(
                    p0: Call<Response.Characters>,
                    p1: retrofit2.Response<Response.Characters>
            ) {
                if (p1?.code() == 200){
                    items = p1?.body()?.data
                    val adapter = AdapterDlyaSpiska(this@CharacterSpisok, R.layout.characters_strochka, items!!)
                    findViewById<ListView>(R.id.listView).adapter = adapter
                }
            }

            override fun onFailure(p0: Call<Response.Characters>?, p1: Throwable?) {
                TODO("Not yet implemented")
            }


        }
        )
    }
}