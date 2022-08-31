package com.nuklhth.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nuklhth.app.databinding.ActivityMainBinding
import com.nuklhth.app.nkladapter.NukleonsAdapter
import com.nuklhth.app.nklutils.NukleonObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var pweqwqe : NukleonsAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        lgeergerg()
    }


    private fun lgeergerg() = with(binding){
        pweqwqe = NukleonsAdapter(NukleonObject.kdfgdfgdf,this@MainActivity)
        wfwfwef.layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.HORIZONTAL,false)
        wfwfwef.adapter = pweqwqe
    }
}