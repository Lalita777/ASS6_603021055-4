package com.example.lab6menufragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ass06_603021055_4.R
import kotlinx.android.synthetic.main.fragment_one2.view.*
import kotlinx.android.synthetic.main.fragment_one2.view.*
import kotlinx.android.synthetic.main.fragment_two.view.*
import android.widget.Toast as Toast1

/**
 * A simple [Fragment] subclass.
 */
class OneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_one2, container, false)
        view.btnClickFragmentOne.setOnClickListener(){
            val toast = Toast1.makeText(context, "ฉันเอง", Toast1.LENGTH_SHORT)
            toast.show()

        }
        return view

    }
}
