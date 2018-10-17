package com.example.pvnan.churrascore

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_futebol.*

class Futebol : AppCompatActivity() {
    var gols = 0
    var gols2 = 0
    var esquerda = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_futebol)
        cincof.setText(gols.toString())
        um.setText(gols2.toString())
        cincof.setOnClickListener()
        {
            esquerda = true
            cincof.setBackgroundColor(Color.CYAN)
            um.setBackgroundColor(Color.WHITE)
        }
        um.setOnClickListener()
        {
            esquerda = false
            cincof.setBackgroundColor(Color.WHITE)
            um.setBackgroundColor(Color.CYAN)
        }
        btnaddf.setOnClickListener(){
            if(esquerda == true) {
                gols++
                cincof.setText(gols.toString())
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
            cincof.setText(gols.toString())}
            else
            {
                gols2--
                um.setText(gols2.toString())
            }

        }
    }
}
