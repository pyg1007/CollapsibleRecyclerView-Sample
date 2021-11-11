package kr.ryan.foldrecyclerview.data

import java.util.*

/**
 * FoldRecyclerView
 * Class: MockData
 * Created by pyg10.
 * Created On 2021-11-08.
 * Description:
 */
object MockData {

    fun createMockData() : List<RootItem>{
        return listOf(
            RootItem("1번 제목", "1번 내용", Date(), false)
            , RootItem("2번 제목", "2번 내용", Date(), false)
            , RootItem("3번 제목", "3번 내용", Date(), false)
            , RootItem("4번 제목", "4번 내용", Date(), false)
            , RootItem("5번 제목", "5번 내용", Date(), false)
            , RootItem("6번 제목", "6번 내용", Date(), false)
            , RootItem("7번 제목", "7번 내용", Date(), false)
            , RootItem("8번 제목", "8번 내용", Date(), false)
            , RootItem("9번 제목", "9번 내용", Date(), false)
            , RootItem("10번 제목", "10번 내용", Date(), false)
            , RootItem("11번 제목", "11번 내용", Date(), false)
            , RootItem("12번 제목", "12번 내용", Date(), false)
        )
    }

}