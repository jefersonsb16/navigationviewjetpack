package com.platzi.conf.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.platzi.conf.R
import com.platzi.conf.model.Conf

class ItemsHomeAdapter(private val listaConfs: ArrayList<Conf>) : RecyclerView.Adapter<ItemsHomeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsHomeAdapter.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_sections_home, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemsHomeAdapter.ViewHolder, position: Int) {
        holder.ivBannerItemHome.setImageDrawable(listaConfs[position].idImagen)
        holder.tvTituloItemHome.text = listaConfs[position].titulo
        holder.tvParrafoItemHome.text = listaConfs[position].parrafo
    }

    override fun getItemCount(): Int = listaConfs.size

    class ViewHolder(itemsView: View) : RecyclerView.ViewHolder(itemsView) {
        val ivBannerItemHome: ImageView = itemsView.findViewById(R.id.ivBannerItemHome)
        val tvTituloItemHome: TextView = itemsView.findViewById(R.id.tvTituloItemHome)
        val tvParrafoItemHome: TextView = itemsView.findViewById(R.id.tvParrafoItemHome)
    }

}