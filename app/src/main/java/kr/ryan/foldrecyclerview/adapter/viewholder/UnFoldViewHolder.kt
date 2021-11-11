package kr.ryan.foldrecyclerview.adapter.viewholder

import android.view.View
import kr.ryan.foldrecyclerview.data.Item
import kr.ryan.foldrecyclerview.databinding.RecyclerUnFoldBinding
import java.text.SimpleDateFormat
import java.util.*

/**
 * FoldRecyclerView
 * Class: UnFoldViewHolder
 * Created by pyg10.
 * Created On 2021-11-09.
 * Description:
 */
class UnFoldViewHolder(private val binding: RecyclerUnFoldBinding): BaseViewHolder<Item.UnFold>(binding) {
    override fun View.bind(parameter: Item.UnFold) {
        binding.run {
            tvTitle.text = parameter.title
            tvContent.text = parameter.content
            tvDate.text = SimpleDateFormat("yyyy년 MM월 dd일 HH:mm", Locale.getDefault()).format(parameter.date)
            ivClose.setOnClickListener {
                onClick(adapterPosition)
            }
        }
    }

    companion object{
        private lateinit var onClick: (Int) -> Unit

        fun setOnClick(click: (Int) -> Unit){
            onClick = click
        }
    }
}