package com.akirachix.enwallet

import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= ActivityMainBinding.inflate(layoutInflater)
       setContentView(binding.root)
        binding.rvdetails.layoutManager=LinearLayoutManager(this)
        displayDetails()
    }
fun displayDetails(){
    val detail1= Details("salary","KES 40000","1 July")
    val detail2= Details("salary","KES 40000","1 July")
    val detail3= Details("salary","KES 40000","1 July")
    val detail4= Details("salary","KES 40000","1 July")

    val detailsList= listOf(detail1, detail2,detail3,detail4)
    val detailAdapter= DetailsAdapter(detailsList)
    binding.rvdetails.adapter=detailAdapter
}
}


