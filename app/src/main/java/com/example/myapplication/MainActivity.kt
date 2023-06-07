package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.clickcounter.Counter
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val clickCount = Counter()

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
            binding.clickCount = clickCount
        }
    }

    private fun incrementClickCount() {
        var prevCount = clickCount
        val clickCount
        clickCount++
        binding.clickCount = clickCount

        // Show toast message with the updated click count
        val message = "Click Count: $clickCount  Previous Count: $prevCount"
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }



//        decrementButton.setOnClickListener {
//            clickCount--
//            counterTextView.text = clickCount.toString()
//            Toast.makeText(this, "Current count: " + clickCount + " Previous Count: " + (clickCount+1), Toast.LENGTH_SHORT).show()
//        }
//
//        incrementButton.setOnClickListener {
//            clickCount++
//            counterTextView.text = clickCount.toString()
//            Toast.makeText(this, "Current count: " + clickCount + " Previous Count: " + (clickCount+1), Toast.LENGTH_SHORT).show()
//        }
//
//        resetButton.setOnClickListener {
//            val prevCount = clickCount
//            clickCount=0
//            counterTextView.text = clickCount.toString()
//            Toast.makeText(this, "Current count: $clickCount Previous Count: $prevCount", Toast.LENGTH_SHORT).show()
//        }

}
