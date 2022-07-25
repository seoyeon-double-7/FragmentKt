package com.example.fragmentkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFrag(0)

        val btn1 = findViewById<Button>(R.id.btn_fragment1)
        val btn2 = findViewById<Button>(R.id.btn_fragment2)
        val btn3 = findViewById<Button>(R.id.btn_fragment3)

        btn1.setOnClickListener{
            setFrag(0)
        }

        btn2.setOnClickListener{
            setFrag(1)
        }

        btn3.setOnClickListener{
            setFrag(2)
        }
    }

    private fun setFrag(fragNum : Int) {
        val ft = supportFragmentManager.beginTransaction()  //프래그먼트 교체
        when(fragNum)  //kind of switch문
        {
            0 -> {
                ft.replace(R.id.main_frame, Fragment1()).commit()
            }
            1-> {
                ft.replace(R.id.main_frame, Fragment2()).commit()
            }
            2-> {
                ft.replace(R.id.main_frame, Fragment3()).commit()
            }
        }
    }
}