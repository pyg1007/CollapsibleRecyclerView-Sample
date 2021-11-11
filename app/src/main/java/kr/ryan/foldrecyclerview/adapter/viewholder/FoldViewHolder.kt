package kr.ryan.foldrecyclerview.adapter.viewholder

import android.view.View
import kr.ryan.foldrecyclerview.data.Item
import kr.ryan.foldrecyclerview.databinding.RecyclerFoldBinding

/**
 * FoldRecyclerView
 * Class: FoldViewHolder
 * Created by pyg10.
 * Created On 2021-11-09.
 * Description:
 */
class FoldViewHolder(private val binding: RecyclerFoldBinding): BaseViewHolder<Item.Fold>(binding) {
    override fun View.bind(parameter: Item.Fold) {
        binding.tvTitle.text = parameter.title
        binding.ivOpen.setOnClickListener {
            onClick(adapterPosition)
        }
    }

    companion object{
        private lateinit var onClick: (Int) -> Unit

        fun setOnClick(click: (Int) -> Unit){
            onClick = click
        }
    }
}