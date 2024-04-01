package com.example.trafficlight

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.trafficlight.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.red.setBackgroundColor(Color.RED)
        binding.yellow.setBackgroundColor(Color.GRAY)
        binding.green.setBackgroundColor(Color.GRAY)
    }

    fun SwitchClick(view: View)
    {
        val redC = findViewById<ImageView>(R.id.red)
        val yellowC = findViewById<ImageView>(R.id.yellow)
        val greenColor = findViewById<ImageView>(R.id.green)

        if (redC.visibility == View.VISIBLE )
        {
            counter = 0
            redC.visibility = View.INVISIBLE
            yellowC.visibility = View.VISIBLE

        }
        else if(yellowC.visibility == View.VISIBLE && counter == 0)
        {
            yellowC.visibility = View.INVISIBLE
            greenColor.visibility = View.VISIBLE
        }
        else if (greenColor.visibility == View.VISIBLE)
        {
            counter = 1
            greenColor.visibility = View.INVISIBLE
            yellowColor.visibility = View.VISIBLE
        }
        else if(orangeColor.visibility == View.VISIBLE && counter == 1)
        {
            redC.visibility = View.VISIBLE
           yellowC.visibility = View.INVISIBLE
        }


    }
}

    }    }