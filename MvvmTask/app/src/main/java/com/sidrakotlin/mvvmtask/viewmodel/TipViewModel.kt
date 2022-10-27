package com.sidrakotlin.mvvmtask.viewmodel

import android.view.View
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.math.cos

class TipViewModel: ViewModel() {

    private val tipLiveData = MutableLiveData<Double>(0.0)
    val tipObj:LiveData<Double>
        get() = tipLiveData;

    //var costOfService:Double ?= null
    val costOfService = MutableLiveData<String>("0")


    fun calcTip()
    {

        if(costOfService.value!!.isEmpty())
        {
            costOfService.value="0"

        }
        tipLiveData.value = costOfService.value!!.toDouble()*15/100
    }

}




