package com.sidrakotlin.mvvmtask

import androidx.lifecycle.ViewModel

class ViewModelTip:ViewModel() {

    var cost:Double ?= null
    var tip = 0.0


    fun cal()
    {
//        tip.toDouble()
//        cost.toDouble()

        tip = cost!! *15/100
    }

    fun tipAmount():Double{
        return tip
    }
}