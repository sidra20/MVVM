package com.sidrakotlin.mvvmtask.viewmodel

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TipViewModel: ViewModel() {

    private val tipLiveData = MutableLiveData<Double>(0.0)
    val tipObj:LiveData<Double>
        get() = tipLiveData;

    var costOfService:Double ?= null



    fun calcTip()
    {
        tipLiveData.value = costOfService!!*15/100
    }

}


