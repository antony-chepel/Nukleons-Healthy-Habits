package com.nuklhth.app.nklscreens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nuklhth.app.databinding.ActivityDetailNutrishBinding
import com.nuklhth.app.nkladapter.NukleonsAdapter

class DetailNukleons : AppCompatActivity() {
    private lateinit var binding: ActivityDetailNutrishBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailNutrishBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getData()

    }

    private fun getData() = with(binding){
        val title = intent.getStringExtra(NukleonsAdapter.NUTRISH_TITLE)
        val desc = intent.getStringExtra(NukleonsAdapter.NUTRISH_DESC)

        textMain.text = title.toString()
        textDesc.text = desc.toString()

        floatingActionButton.setOnClickListener {
            finish()
        }
    }
}