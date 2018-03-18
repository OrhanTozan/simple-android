package com.nahroto.simpleandroid

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class SimpleRecyclerViewAdapter<VH : SimpleRecyclerViewAdapter.SimpleViewHolder>
(
        private val models: List<Any>
) : RecyclerView.Adapter<VH>()
{
    abstract fun getViewLayoutResource(): Int

    abstract fun onInstantiateViewHolder(itemView: View): VH

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH
    {
        val itemView = LayoutInflater.from(parent.context).inflate(getViewLayoutResource(), parent, false)
        return onInstantiateViewHolder(itemView)
    }

    override fun getItemCount(): Int = models.size

    override fun onBindViewHolder(holder: VH, position: Int) = holder.bind(models[position])

    abstract class SimpleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        abstract fun bind(model: Any)
    }
}