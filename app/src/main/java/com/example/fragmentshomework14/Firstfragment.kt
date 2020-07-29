package com.example.fragmentshomework14

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.first_fragment.*

class Firstfragment:Fragment()  {

    private var listener: Fragmentlistener?=null
    private var repl: Button?=null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener= context as Fragmentlistener
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.first_fragment,container,false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        repl=view.findViewById(R.id.repl)


        repl?.setOnClickListener {
            listener?.forAdd()

        }
    }
}