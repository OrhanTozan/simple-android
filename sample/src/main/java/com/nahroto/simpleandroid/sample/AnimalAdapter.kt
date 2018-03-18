package com.nahroto.simpleandroid.sample

import android.view.View
import com.nahroto.simpleandroid.SimpleRecyclerViewAdapter
import kotlinx.android.synthetic.main.viewholder_animal.view.*

class AnimalAdapter
(
        animals: ArrayList<Animal>
) : SimpleRecyclerViewAdapter<SimpleRecyclerViewAdapter.SimpleViewHolder>(animals)
{
    override fun getViewLayoutResource() = R.layout.viewholder_animal

    override fun onInstantiateViewHolder(itemView: View) = AnimalViewHolder(itemView)

    class AnimalViewHolder(itemView: View) : SimpleViewHolder(itemView)
    {
        override fun bind(model: Any)
        {
            model as Animal
            itemView.name.text = model.name
            itemView.amountLegs.text = model.amountLegs.toString()
            itemView.lifeExpectancy.text = model.lifeExpectancy.toString()
        }
    }
}