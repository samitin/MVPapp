package ru.samitin.base

interface Contract {
    interface View{
        fun showText(text: String)

    }
    interface Presenter{
        fun onClickAdd(text:String)
        fun onClickClear()
    }
    interface Model{
        fun loadName():String
        fun saveName(name:String)
        fun clear()
    }
}