package ru.samitin.mvp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment2.*

class Fragment2: Fragment() {
    fun setText(text:String){
        tv?.text=text
    }
    var tv:TextView?=null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView=inflater.inflate(R.layout.fragment2,container,false)

        tv=rootView.findViewById<TextView>(R.id.textView)
        return rootView
    }
}