package com.example.rickandmortynew

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class AdapterDlyaSpiska (val ctx: Context, val resource: Int, val items: ArrayList<Response.CharactersItems>): ArrayAdapter<Response.CharactersItems>(ctx, resource, items){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view: View? = null

        if (convertView == null){
            view = LayoutInflater.from(parent?.context).inflate(resource!!, parent, false)
        } else {
            view = convertView
        }

        //Picasso.get().load(items?.get(position)?.image).into(view?.findViewById<ImageView>(R.id.imageView))
        view?.findViewById<TextView>(R.id.textView)?.text = items?.get(position)?.name

        return view!!
    }
}