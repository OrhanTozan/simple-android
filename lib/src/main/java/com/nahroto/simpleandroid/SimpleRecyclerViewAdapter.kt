package com.nahroto.simpleandroid

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class SimpleRecyclerViewAdapter<T, VH : SimpleRecyclerViewAdapter.SimpleViewHolder<T>>
(
        private val models: List<T>
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

    abstract class SimpleViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        abstract fun bind(model: T)
    }
}
