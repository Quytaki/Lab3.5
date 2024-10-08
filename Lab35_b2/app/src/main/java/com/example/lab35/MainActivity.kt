package com.example.lab35

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Liên kết nút
        val customButton: Button = findViewById(R.id.customButton)

        // Xử lý sự kiện khi nhấn nút
        customButton.setOnClickListener {
            // Thay đổi màu nền khi nhấn
            customButton.setBackgroundColor(Color.parseColor("#FF5722"))
        }
    }
}
