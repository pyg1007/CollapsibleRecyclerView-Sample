# CollapsibleRecyclerView-Sample

리사이클러뷰 아이콘 클릭시 접었다가 폈다가하는 샘플 프로젝트입니다.  

![collapsible](https://user-images.githubusercontent.com/8927650/141417675-87257742-4ec1-4679-a9df-53071e1650ca.gif)

펼칠수 있는 최대한도는 1개로 설정해두었으며, 해당내용은 아래와 같습니다.

```kotlin
private fun recyclerClickEvent() {
    foldAdapter.setOnClick { position->
        mockData.forEachIndexed { index, rootItem ->
            if (rootItem.state) {
                rootItem.state = !rootItem.state
                foldAdapter.notifyItemChanged(index)
            }
        }
        mockData[position].state = !mockData[position].state
        foldAdapter.notifyItemChanged(position)
    }
}
```

이 프로젝트에서는 sealed class 를 이용하여 상태구분을 하였지만 다른방법도 있습니다.
ex) SparseBooleanArray  

## 사용 기술
viewBinding

## 사용 언어
Kotlin

## 사용 버전
Android Studio Arctic Fox | 2020.3.1 PATCH 3
