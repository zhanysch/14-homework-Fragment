package com.example.fragmentshomework14

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class SecondFragment: Fragment() {
    private var list: Fragmentlistener?=null
    private var remov: Button? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        list= context as Fragmentlistener
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.secon_fragm, container, false)

        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        remov = view.findViewById(R.id.remov)

        remov?.setOnClickListener {
            list?.forRemove()
        }

    }


}
