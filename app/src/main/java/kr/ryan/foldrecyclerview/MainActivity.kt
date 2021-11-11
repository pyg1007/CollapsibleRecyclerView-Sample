package kr.ryan.foldrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kr.ryan.foldrecyclerview.adapter.FoldAdapter
import kr.ryan.foldrecyclerview.data.MockData
import kr.ryan.foldrecyclerview.databinding.ActivityMainBinding
import kr.ryan.foldrecyclerview.util.Divider

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var foldAdapter: FoldAdapter
    private val mockData = MockData.createMockData()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
        recyclerClickEvent()
    }

    private fun initRecyclerView() {
        foldAdapter = FoldAdapter(mockData)
        binding.foldRecycler.apply {
            adapter = foldAdapter
            val color = ContextCompat.getColor(this@MainActivity, R.color.black)
            addItemDecoration(Divider(5f, 0f, color))
        }
    }

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

}