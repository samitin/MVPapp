package ru.samitin.base

import ru.samitin.base.Model as Model1


@Suppress("UNREACHABLE_CODE")
open class Presenter(val view: Contract.View) :Contract.Presenter{

    private val model = Model1()

    override fun onClickAdd(text: String) {
        //TODO1(reason = "Not yet implemented")
        model.saveName(text)
        view.showText(model.loadName())
    }

    override fun onClickClear() {
       // TODO1(reason = "Not yet implemented")
        model.clear()
        view.showText(model.loadName())
    }
}