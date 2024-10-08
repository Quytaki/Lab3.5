package com.example.lab35_1

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import kotlin.random.Random

class CircleView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val paint = Paint().apply {
        color = Color.RED // Màu sắc mặc định của vòng tròn
        isAntiAlias = true // Chống hiện tượng răng cưa
    }

    // Phương thức onDraw để vẽ vòng tròn
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        // Vẽ vòng tròn ở giữa View
        canvas.drawCircle(width / 2f, height / 2f, width / 3f, paint)
    }

    // Xử lý sự kiện chạm
    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if (event?.action == MotionEvent.ACTION_DOWN) {
            // Thay đổi màu sắc ngẫu nhiên
            paint.color = getRandomColor() // Cập nhật màu sắc
            invalidate() // Yêu cầu vẽ lại View
            return true
        }
        return super.onTouchEvent(event)
    }

    // Hàm để lấy màu sắc ngẫu nhiên
    private fun getRandomColor(): Int {
        return Color.rgb(Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
    }
}
