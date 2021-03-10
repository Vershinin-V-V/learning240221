package com.classic117.classicproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), PersonSelect{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.fragment_container, ContactListFragment())
                    .commit()
        }
    }

    override fun onPersonSelected(id : Int) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, ContactDetailsFragment.newInstance(id))
            .addToBackStack(null)
            .commit()
    }


}