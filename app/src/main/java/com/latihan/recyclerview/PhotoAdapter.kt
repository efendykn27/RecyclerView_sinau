package com.latihan.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class PhotoAdapter(var context:Context): RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {

    var dataList = emptyList<DataModel>()
    internal  fun setDataList(dataList : List<DataModel>){
        this.dataList = dataList
        notifyDataSetChanged()
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        lateinit var image : ImageView
        lateinit var title : TextView
        lateinit var desc : TextView

        init {
            image  = itemView.findViewById(R.id.adela)
            title  = itemView.findViewById(R.id.title)
            desc  = itemView.findViewById(R.id.desc)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.photo_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: PhotoAdapter.ViewHolder, position: Int) {
        var data = dataList[position]

        holder.title.text = data.title
        holder.desc.text = data.desc
        holder.image.setImageResource(data.image)

    }

    override fun getItemCount () = dataList.size
}