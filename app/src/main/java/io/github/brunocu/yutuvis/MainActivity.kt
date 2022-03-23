package io.github.brunocu.yutuvis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.lang.IllegalArgumentException

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPlaySingle = findViewById<Button>(R.id.playVid)
        val btnMenu = findViewById<Button>(R.id.playPlay)

        btnPlaySingle.setOnClickListener(this)
        btnMenu.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val intent = when (view.id) {
            R.id.playVid -> Intent(this, YoutubePlayerActivity::class.java)
            R.id.playPlay -> Intent(this, Menu::class.java)

            else -> throw IllegalArgumentException("Invalid button")
        }
        startActivity(intent)
    }
}