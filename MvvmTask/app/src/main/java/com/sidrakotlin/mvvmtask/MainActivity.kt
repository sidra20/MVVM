package com.sidrakotlin.mvvmtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.sidrakotlin.mvvmtask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var vm:ViewModelTip
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        vm = ViewModelProvider(this).get(ViewModelTip::class.java)


        binding.tipText.text = "Tip: Rs. " + vm.tip

        binding.calBtn.setOnClickListener {
            var costAmount = binding.costEdittext.text.toString()

            if(costAmount.isEmpty())
            {
                Toast.makeText(this, "Required!", Toast.LENGTH_SHORT).show()
            }
            else{
                vm.cost=costAmount.toDouble()
                vm.cal()
                binding.tipText.text = "Tip: Rs. " + vm.tip
            }


        }

    }
}