package com.sidrakotlin.mvvmtask.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.sidrakotlin.mvvmtask.R
import com.sidrakotlin.mvvmtask.databinding.LayoutLivedataBinding
import com.sidrakotlin.mvvmtask.viewmodel.TipViewModel

class TipActivity :AppCompatActivity() {
    private lateinit var viewModel: TipViewModel
    private lateinit var binding: LayoutLivedataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.layout_livedata)

        //view model
        viewModel = ViewModelProvider(this).get(TipViewModel::class.java)

        binding.tipModel=viewModel
        binding.lifecycleOwner=this

//        binding.calBtn.setOnClickListener {
////            var cost = binding.costAmt.text.toString()
////
////            if(cost.isEmpty())
////            {
////                Toast.makeText(this, "Required!", Toast.LENGTH_SHORT).show()
////            }
////            else{
////                viewModel.costOfService=cost.toDouble()
////                viewModel.calcTip()
////            }
//            viewModel.calcTip()
//
//        }







    }
}