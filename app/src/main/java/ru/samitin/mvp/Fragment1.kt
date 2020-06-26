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

    val BUNDLE_COUNTENT="bundle_countent"

        /* fun myFragment1( content:String):Fragment1{
         val fragment=Fragment1()
         val argument=Bundle()
         argument.putString(BUNDLE_COUNTENT,content)
         fragment.arguments=argument
         return fragment
     }*/
    interface OnClickButton{
            fun onClickAdd(name:String){

            }
            fun onClickClear(){

            }
        }
    
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView=inflater.inflate(R.layout.fragment1,container,false)

        val btnAdd=rootView.findViewById<Button>(R.id.addBtn)
        val btnClear=rootView.findViewById<Button>(R.id.clearBtn)
        val et=rootView.findViewById<EditText>(R.id.etText)
        et.setText("")
        val click=activity as OnClickButton
        btnAdd.setOnClickListener {
            Toast.makeText(activity,et.text.toString(),Toast.LENGTH_SHORT).show()
            click.onClickAdd(et.text.toString())
            et.setText("")
        }
        btnClear.setOnClickListener {
            Toast.makeText(activity,"btnClear",Toast.LENGTH_SHORT).show()
            click.onClickClear()
        }
        return rootView
    }
}