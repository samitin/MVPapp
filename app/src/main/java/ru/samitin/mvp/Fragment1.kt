package ru.samitin.mvp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment1.*

class Fragment1: Fragment() {
    
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView=inflater.inflate(R.layout.fragment1,container,false)
        
        val btnAdd=rootView.findViewById<Button>(R.id.addBtn)
        val btnClear=rootView.findViewById<Button>(R.id.clearBtn)
        val et=rootView.findViewById<EditText>(R.id.etText)
        btnAdd.setOnClickListener {
            Toast.makeText(activity,"btnAdd",Toast.LENGTH_SHORT).show()
        }
        clearBtn.setOnClickListener {
            Toast.makeText(activity,"btnClear",Toast.LENGTH_SHORT).show()
        }
        return rootView
    }
}