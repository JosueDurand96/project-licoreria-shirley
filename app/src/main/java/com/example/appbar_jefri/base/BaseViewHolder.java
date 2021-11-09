package com.example.appbar_jefri.base;

import android.view.View;

abstract class BaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {
	abstract fun bind(item: T,position:Int)
		}
