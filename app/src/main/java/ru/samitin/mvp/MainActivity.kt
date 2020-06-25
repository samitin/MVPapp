package ru.samitin.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.fragment1.*
import kotlinx.android.synthetic.main.fragment2.*
import ru.samitin.base.Contract
import ru.samitin.base.Presenter

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity(),Contract.View {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val presenter= Presenter(this)


       /* addBtn.setOnClickListener {
            presenter.onClickAdd(etText.text.toString())
            etText.text.clear()

        }
        clearBtn.setOnClickListener {
            presenter.onClickClear()

        }*/
    }

    override fun showText(text: String) {
      //  TODO("Not yet implemented")
       // textView.text=text
    }

}