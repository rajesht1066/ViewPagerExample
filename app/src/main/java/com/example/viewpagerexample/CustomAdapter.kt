package com.example.viewpagerexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val data:ArrayList<ItemsViewModel>,private val context:Context?,private val view: View):RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.itemview, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemsViewModel = data[position]
        holder.imageView.setImageResource(itemsViewModel.image)
        holder.itemView.setOnClickListener {
            Toast.makeText(context,"clicked ${itemsViewModel.text}",Toast.LENGTH_LONG).show()
            Navigation.findNavController(view).navigate(R.id.action_chatFragment1_to_chatFragment2)
        }
        holder.textView.text = itemsViewModel.text
        holder.textView2.text = itemsViewModel.versionNo
    }

    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {
        val imageView:ImageView = itemView.findViewById(R.id.imageview)
        val textView: TextView = itemView.findViewById(R.id.textView)
        val textView2: TextView = itemView.findViewById(R.id.textView2)
    }
}