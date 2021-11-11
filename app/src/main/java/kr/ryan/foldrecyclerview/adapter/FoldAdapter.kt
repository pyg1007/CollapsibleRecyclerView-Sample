package kr.ryan.foldrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kr.ryan.foldrecyclerview.adapter.viewholder.FoldViewHolder
import kr.ryan.foldrecyclerview.adapter.viewholder.UnFoldViewHolder
import kr.ryan.foldrecyclerview.data.Item
import kr.ryan.foldrecyclerview.data.RootItem
import kr.ryan.foldrecyclerview.databinding.RecyclerFoldBinding
import kr.ryan.foldrecyclerview.databinding.RecyclerUnFoldBinding
import kr.ryan.foldrecyclerview.util.convertType

/**
 * FoldRecyclerView
 * Class: FoldAdapter
 * Created by pyg10.
 * Created On 2021-11-09.
 * Description:
 */
class FoldAdapter(private val item: List<RootItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object{
        private const val STATE_FOLD = 1
        private const val STATE_UN_FOLD = 2
    }

    private lateinit var imageViewOnClick: (Int) -> Unit

    fun setOnClick(onClick: (Int) -> Unit){
        imageViewOnClick = onClick
    }

    override fun getItemCount(): Int = if (item.isNullOrEmpty()) 0 else item.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType){
            STATE_FOLD -> {
                FoldViewHolder.setOnClick(imageViewOnClick)
                FoldViewHolder(RecyclerFoldBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            }
            STATE_UN_FOLD -> {
                UnFoldViewHolder.setOnClick(imageViewOnClick)
                UnFoldViewHolder(RecyclerUnFoldBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            }
            else -> {
                throw IllegalStateException("UnKnown ViewHolder")
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when{
            getItemViewType(position) == STATE_FOLD -> (holder as FoldViewHolder).onBind(convertType(item[position]) as Item.Fold)
            getItemViewType(position) == STATE_UN_FOLD -> (holder as UnFoldViewHolder).onBind(convertType(item[position]) as Item.UnFold)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when(convertType(item[position])){
            is Item.Fold -> {
                STATE_FOLD
            }
            is Item.UnFold -> {
                STATE_UN_FOLD
            }
        }
    }
}