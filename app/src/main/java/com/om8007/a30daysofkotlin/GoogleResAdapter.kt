package com.om8007.a30daysofkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class GoogleResAdapter(val context: Context, val codelabs: List<GoogleResModel> ) : RecyclerView.Adapter<GoogleResAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       //To change body of created functions use File | Settings | File Templates.
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
//        To change body of created functions use File | Settings | File Templates.
        return codelabs.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
         //To change body of created functions use File | Settings | File Templates.
        val codelab = codelabs[position]
        holder.setData(codelab)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun setData(codelab: GoogleResModel?)
        {
            itemView.cardTitle.text = codelab!!.title
            itemView.cardTag.text = codelab!!.tag
            itemView.cardButton.setOnClickListener(){
                //                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(codelab!!.url))
//                startActivity(this,intent)
            }
        }
    }
}