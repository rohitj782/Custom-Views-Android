package com.rohitrj.customview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rohitrj.customview.viewclass.ClippedView

class ClippingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ClippedView(this))
    }
}
