package com.bgenterprise.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textview.MaterialTextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /**
     * Note: I will use this project for the dice roller codelab.
     */

    private lateinit var imgView: ShapeableImageView
    private lateinit var btn_roll: MaterialButton
    private lateinit var btn_count: MaterialButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_roll = findViewById(R.id.btn_rollDice)
        btn_count = findViewById(R.id.btn_countUp)
        imgView = findViewById(R.id.imageView)

        btn_roll.setOnClickListener{ rollTheDice() }
    }

    private fun rollTheDice(){

        var randomInt: Int = (1..6).random()

        val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        imgView.setImageResource(drawableResource)

        //Add a toast.
        Toast.makeText(this, "Button has been clicked: " + randomInt.toString(),
                Toast.LENGTH_LONG).show()
    }

}
