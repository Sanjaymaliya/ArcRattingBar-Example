package com.arc.rattingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.maliyabrothers.arcrattingbar.ArcRatingBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ArcRatingBar.ArcRatingChangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ratingBar.setRatingChangeListener(this)

    }

    override fun onRatingChanged(rating: Int) {
        Log.e("Ratting Value",""+rating)
    }
}
