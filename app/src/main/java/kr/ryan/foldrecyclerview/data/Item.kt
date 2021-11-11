package kr.ryan.foldrecyclerview.data

import java.util.*

/**
 * FoldRecyclerView
 * Class: FoldState
 * Created by pyg10.
 * Created On 2021-11-08.
 * Description:
 */
sealed class Item{
    data class Fold(val title: String) : Item()
    data class UnFold(val title: String, val content: String, val date: Date) : Item()
}
