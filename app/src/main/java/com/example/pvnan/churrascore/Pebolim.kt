package com.example.pvnan.churrascore

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pebolim.*

class Pebolim : AppCompatActivity() {
    var gols = 0
    var gols2 = 0
    var esquerda = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pebolim)
        cinco.setText(gols.toString())
        um.setText(gols2.toString())
        cinco.setOnClickListener()
        {
            esquerda = true
            cinco.setBackgroundColor(Color.CYAN)
            um.setBackgroundColor(Color.WHITE)
        }
        um.setOnClickListener()
        {
            esquerda = false
            cinco.setBackgroundColor(Color.WHITE)
            um.setBackgroundColor(Color.CYAN)
        }
        btnaddf.setOnClickListener(){
            if(esquerda == true) {
                gols++
                cinco.setText(gols.toString())
            }
            else
            {
                gols2++
                um.setText(gols2.toString())
            }
        }
        botao.setOnClickListener(){
            if(esquerda == true)
            {
                gols--
                cinco.setText(gols.toString())}
            else
            {
                gols2--
                um.setText(gols2.toString())
            }

        }
    }
}

