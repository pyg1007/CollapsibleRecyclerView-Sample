package kr.ryan.foldrecyclerview.adapter.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

/**
 * FoldRecyclerView
 * Class: BaseViewHolder
 * Created by pyg10.
 * Created On 2021-11-09.
 * Description:
 */
abstract class BaseViewHolder<in T: Any>(private val binding: ViewBinding) : RecyclerView.ViewHolder(binding.root) {

    abstract fun View.bind(parameter: T)

    fun onBind(parameter: T){
        itemView.bind(parameter)
    }
}