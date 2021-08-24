package com.hanan.wisatapurbalingga2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class WisataAdapter(val arrayList: ArrayList<Wisata>, val context: Context): RecyclerView.Adapter<WisataAdapter.ViewHolder> (){

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun bindItems (wisata: Wisata){
            itemView.tv_item_name.text = wisata.name
            itemView.tv_item_detail.text = wisata.detail
            itemView.img_item_photo.setImageResource(wisata.image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)

        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener {

            val wisata = arrayList.get(position)

            var name : String = wisata.name
            var detail : String = wisata.detail
            var img : Int = wisata.image

            var i = Intent(context, DetailActivity::class.java)

            i.putExtra("iName", name)
            i.putExtra("iDetail", detail)
            i.putExtra("iImg", img)

            context.startActivity(i)

        }

    }

}