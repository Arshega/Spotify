package com.example.pc.spotify

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycleview = findViewById<RecyclerView>(R.id.recyclerView)

        recycleview.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val songs = ArrayList<Songs>()

        songs.add(Songs("Come Fly With Me - Remastered", "Frank Sinatra • Ultimate Sinatra: The Centennial Collection"))
        songs.add(Songs("The Way You Look Tonight", "Frank Sinatra • Ultimate Sinatra: The Centennial Collection"))
        songs.add(Songs("That's Life", "Frank Sinatra • Ultimate Sinatra: The Centennial Collection"))
        songs.add(Songs("Strangers In The Night", "Frank Sinatra • Ultimate Sinatra: The Centennial Collection"))
        songs.add(Songs("My Way", "Frank Sinatra • Ultimate Sinatra: The Centennial Collection"))
        songs.add(Songs("Summer Wind", "Frank Sinatra • Ultimate Sinatra: The Centennial Collection"))
        songs.add(Songs("Fly Me To The Moon", "Frank Sinatra • Ultimate Sinatra: The Centennial Collection"))
        songs.add(Songs("The Best Is Yet To Come", "Frank Sinatra • Ultimate Sinatra: The Centennial Collection"))
        songs.add(Songs("The Longest Time", "Billy Joel • The Essential Billy Joel"))
        songs.add(Songs("Leave A Tender Momemnt Alone", "Billy Joel • An Innocent Man"))
        songs.add(Songs("Should I Stay or Should I Go - Remastered", "The Clash • Combat Rock"))
        songs.add(Songs("Your Song", "Elton John • Rocket Man (Deluxe Edition)"))

        val adapter = CustomAdapter(songs, applicationContext)

        recycleview.adapter = adapter
    }
}
