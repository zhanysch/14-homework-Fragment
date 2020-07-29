package com.example.fragmentshomework14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(), Fragmentlistener {

    private var add1: Button?=null

    private var secondFragment=SecondFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add1=findViewById(R.id.add1)
        forAdd()


        add1?.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container1, Firstfragment())
                .commit()
        }
    }

    override fun forAdd() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container1,secondFragment)
            .commit()
    }

    override fun forRemove() {
        supportFragmentManager
            .beginTransaction()
            .remove(secondFragment )
            .commit()
    }


}