package com.bgenterprise.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /**
     * Note: I will use this project for the dice roller codelab.
     */

    private lateinit var txtView: MaterialTextView
    private lateinit var btn_roll: MaterialButton
    private lateinit var btn_count: MaterialButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_roll = findViewById(R.id.btn_rollDice)
        btn_count = findViewById(R.id.btn_countUp)
        txtView = findViewById(R.id.textView)

        btn_roll.setOnClickListener{ rollTheDice() }
        btn_count.setOnClickListener{ countUpDice() }
    }

    private fun rollTheDice(){

        var randomInt: Int = (1..9).random()
        txtView.text = randomInt.toString()

        //Add a toast.
        Toast.makeText(this, "Button has been clicked",
                Toast.LENGTH_LONG).show()
    }

    private fun countUpDice(){

        var dice_value: String = txtView.text.toString()
        var count_value: Int = dice_value.toInt() + 1

        textView.text = count_value.toString()

        //Add toast
        Toast.makeText(this, "We increased the value",
            Toast.LENGTH_LONG).show()
    }
}
