package com.example.pc.spotify

import android.content.res.Resources
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.ActionBar
import android.view.Gravity
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import disableMenuShiftMode
import android.widget.TextView
import android.widget.Toolbar
import kotlinx.android.synthetic.main.action_bar_new.*
import kotlinx.android.synthetic.main.song_list.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycleview = findViewById<RecyclerView>(R.id.recyclerView)



        recycleview.layoutManager = LinearLayoutManager(this, android.widget.LinearLayout.VERTICAL, false)

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
        songs.add(Songs("Your Song", "Elton John • Ultimate Sinatra: The Centennial Collection"))

        val adapter = CustomAdapter(songs, applicationContext)

        recycleview.adapter = adapter

        val navView = findViewById<BottomNavigationView>(R.id.navigation) as BottomNavigationView
        disableMenuShiftMode(navView)

        getSupportActionBar()?.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar()?.setCustomView(R.layout.action_bar_new);
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar()?.setDisplayShowHomeEnabled(true);

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.threedotmenu,menu)
        return true
    }




}
