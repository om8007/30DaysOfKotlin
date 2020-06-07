package com.om8007.a30daysofkotlin

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class OtherResAdapter(val context: Context, val resources: List<OtherResModel> ) : RecyclerView.Adapter<OtherResAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       //To change body of created functions use File | Settings | File Templates.
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
//        To change body of created functions use File | Settings | File Templates.
        return resources.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
         //To change body of created functions use File | Settings | File Templates.
        val resource = resources[position]
        holder.setData(resource)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun setData(resource: OtherResModel?)
        {
            itemView.cardTitle.text = resource!!.title
            itemView.cardTag.text = resource!!.tag
            itemView.cardButton.setOnClickListener(){
//                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(resource!!.url))
//                startActivity(this,intent)
            }
        }
    }
}