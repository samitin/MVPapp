package ru.samitin.base



class Model:Contract.Model {
    private var nameList: String = ""

    override fun loadName():String{
        return nameList
         }

    override fun saveName(name: String) {
        nameList = "$nameList \n $name"
    }

    override fun clear() {
        nameList = ""
    }
}