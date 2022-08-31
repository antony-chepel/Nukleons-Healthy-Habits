package com.nuklhth.app.nkladapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.nuklhth.app.databinding.NutrishItemBinding
import com.nuklhth.app.nkldata.NukleonsData
import com.nuklhth.app.nklscreens.DetailNukleons
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import java.lang.Exception

class NukleonsAdapter(val mvjueer : List<NukleonsData>, val activity: AppCompatActivity) : RecyclerView.Adapter<NukleonsAdapter.ItemHolder>() {
    class ItemHolder(val binding: NutrishItemBinding) : RecyclerView.ViewHolder(binding.root) {
       fun setNutrishData(item: NukleonsData, activity : AppCompatActivity) = with(binding){
           Picasso.get().load(item.image).centerCrop().resize(1280,720)
               .into(mainImage, object : Callback{
                   override fun onSuccess() {
                       pNutrishBar.visibility = View.GONE
                   }

                   override fun onError(e: Exception?) {
                   }

               })

           owerwer.text = activity.getString(item.mainText)
           nvnvndssd.text = activity.getString(item.detailText)
       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val binding = NutrishItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.setNutrishData(mvjueer[position],activity)

        holder.itemView.setOnClickListener {
            val intent = Intent(activity, DetailNukleons::class.java).apply {
                putExtra(NUTRISH_TITLE,activity.getString(mvjueer[position].mainText))
                putExtra(NUTRISH_DESC,activity.getString(mvjueer[position].detailText))
            }
            activity.startActivity(intent)
        }

        if(holder.adapterPosition == 9) {
            holder.binding.rightArrow.visibility = View.GONE
            holder.binding.leftArrow.visibility = View.VISIBLE

        } else if(holder.adapterPosition == 0){
            holder.binding.rightArrow.visibility = View.VISIBLE
            holder.binding.leftArrow.visibility = View.GONE
        }

    }

    override fun getItemCount(): Int = mvjueer.size

    companion object {
        const val NUTRISH_TITLE = "nutrish_title"
        const val NUTRISH_DESC = "nutrish_desc"
    }


}