package com.example.appbar_jefri.domain.viewmodel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appbar_jefri.R
import com.example.appbar_jefri.base.BaseViewHolder

import com.example.appbar_jefri.data.model.Drink
import com.example.appbar_jefri.presentation.MainViewModel

class MainAdapter(private val context: Context,private val tragosList:List<Drink>) : RecyclerView.Adapter<BaseViewHolder<*>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return MainViewHolder(LayoutInflater.from(context).inflate(R.layout.rv_tragos_row,parent, false))
    }

    override fun getItemCount(): Int {
        return tragosList.size
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when(holder){
            is MainViewModel -> holder.bind(tragosList)
        }
    }
    inner class MainViewHolder(itemView: View): BaseViewHolder<Drink>(itemView) {
        override fun bind(item: Drink, position: Int){
            TODO("not implemented")

        }

    }

}

