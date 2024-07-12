package com.example.recyclefragment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclefragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // 데이터 리스트
        val dataList = mutableListOf<MyItem>()
        dataList.add(MyItem(R.drawable.bg_choco_1,"bg_choco_1","1"))
        dataList.add(MyItem(R.drawable.bg_choco_2,"bg_choco_2","2"))
        dataList.add(MyItem(R.drawable.bg_choco_3,"bg_choco_3","3"))
        dataList.add(MyItem(R.drawable.bg_choco_4,"bg_choco_4","4"))
        dataList.add(MyItem(R.drawable.bg_choco_5,"bg_choco_5","5"))
        dataList.add(MyItem(R.drawable.black_choco_1,"black_choco_1","6"))
        dataList.add(MyItem(R.drawable.black_choco_2,"black_choco_2","7"))
        dataList.add(MyItem(R.drawable.black_choco_3,"black_choco_3","8"))
        dataList.add(MyItem(R.drawable.black_choco_4,"black_choco_4","9"))
        dataList.add(MyItem(R.drawable.black_choco_5,"black_choco_5","10"))
        dataList.add(MyItem(R.drawable.space_choco_1,"space_choco_1","11"))

        val adapter = MyAdapter(dataList)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
}