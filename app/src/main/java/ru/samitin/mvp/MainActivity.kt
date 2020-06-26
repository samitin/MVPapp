package ru.samitin.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.fragment1.*
import kotlinx.android.synthetic.main.fragment2.*
import ru.samitin.base.Contract
import ru.samitin.base.Presenter

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity(),Contract.View,Fragment1.OnClickButton {
    var fragment2:Fragment2?=null
    var presenter:Presenter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter= Presenter(this)

        fragment2= supportFragmentManager.findFragmentById(R.id.fragment2) as Fragment2?

    }

    override fun onClickAdd(name: String) {
        super.onClickAdd(name)
        presenter?.onClickAdd(name)
    }

    override fun onClickClear() {
        super.onClickClear()
        presenter?.onClickClear()
    }

    override fun showText(text: String) {
      //  TODO("Not yet implemented")
        fragment2?.setText(text)
    }

}


