package com.letsbuildthatapp.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            timePickerDialog()
        }

    }

    private fun timePickerDialog (){
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener{ _, hourOfDay, _ ->
                val h = hourOfDay
                if (h in 2 until 10){
                    textView1.text = "おはよう"
                }else if (h in 10 until 18){
                    textView1.text = "こんにちは"
                }else{
                    textView1.text = "こんばんは"
                }
            }, 13, 0, true
        )

        timePickerDialog.show()
    }

}
