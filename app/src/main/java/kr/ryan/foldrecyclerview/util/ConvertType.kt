package kr.ryan.foldrecyclerview.util

import kr.ryan.foldrecyclerview.data.Item
import kr.ryan.foldrecyclerview.data.RootItem

/**
 * FoldRecyclerView
 * Class: ConvertType
 * Created by pyg10.
 * Created On 2021-11-09.
 * Description:
 */


fun convertType(parameter: RootItem): Item{
    return if (!parameter.state)
        Item.Fold(parameter.title)
    else
        Item.UnFold(parameter.title, parameter.content, parameter.date)
}