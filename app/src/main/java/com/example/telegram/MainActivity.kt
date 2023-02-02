package com.example.telegram

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import com.example.telegram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("RtlHardcoded")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.menu.setOnClickListener {

            binding.drawer.openDrawer(Gravity.LEFT)
        }



        binding.navView.setNavigationItemSelectedListener { item ->
            when (item.itemId) {

                R.id.dashboard -> {
                    Toast.makeText(applicationContext, "Dashboard", Toast.LENGTH_SHORT).show()
                }

                R.id.setting -> {
                    Toast.makeText(applicationContext, "Setting", Toast.LENGTH_SHORT).show()
                }

                R.id.profile -> {
                    Toast.makeText(applicationContext, "Profile", Toast.LENGTH_SHORT).show()
                }

                R.id.about -> {
                    Toast.makeText(applicationContext, "About us", Toast.LENGTH_SHORT).show()
                }
            }

            false
        }
    }
}