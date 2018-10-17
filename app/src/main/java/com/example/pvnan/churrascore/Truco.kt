package com.example.pvnan.churrascore

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_truco.*

class Truco : AppCompatActivity() {

    var pontos1 = 0
    var pontos2 = 0
    var vitorias1 = 0
    var vitorias2 = 0
    var esquerda = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_truco)
        cincot.setText(pontos1.toString())
        um.setText(pontos2.toString())


        cincot.setOnClickListener()
        {
            cincot.setBackgroundColor(Color.CYAN)
            esquerda = true
            um.setBackgroundColor(Color.WHITE)
        }
        um.setOnClickListener()
        {
            um.setBackgroundColor(Color.CYAN)
            esquerda = false
            cincot.setBackgroundColor(Color.WHITE)
        }
        botao1t.setOnClickListener() {
            if (esquerda == true) {
                        pontos1++
                        cincot . setText (pontos1.toString())
            }
            else
            {
                        pontos2++
                        um.setText(pontos2.toString())
            }
            if(pontos1 >= 12)
            {
                vitorias1++
                vitorias.setText("vitórias:"+vitorias1.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
            }
            if(pontos2 >= 12)
            {
                vitorias2++
                vit.setText("vitórias:"+vitorias2.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
            }
        }
        botaot.setOnClickListener() {
            if(esquerda == true) {
                pontos1--
                cincot.setText(pontos1.toString())
            }
            else
            {
                pontos2--
                um.setText(pontos2.toString())
            }
            if(pontos1 >= 12)
            {
                vitorias1++
                vitorias.setText("vitórias:"+vitorias1.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
            }
            if(pontos2 >= 12)
            {
                vitorias2++
                vit.setText("vitórias:"+vitorias2.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
            }
        }
        botao3.setOnClickListener()
        {
            if(esquerda == true) {
                pontos1 = pontos1 + 3
                cincot.setText(pontos1.toString())
            }
            else
            {
                pontos2 = pontos2 + 3
                um.setText(pontos2.toString())
            }
            if(pontos1 >= 12)
            {
                vitorias1++
                vitorias.setText("vitórias:"+vitorias1.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
            }
            if(pontos2 >= 12)
            {
                vitorias2++
                vit.setText("vitórias:"+vitorias2.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
            }
        }
        botao6.setOnClickListener()
        {
            if(esquerda == true) {
                pontos1 = pontos1 + 6
                cincot.setText(pontos1.toString())
            }
            else
            {
                pontos2 = pontos2 + 6
                um.setText(pontos2.toString())
            }
            if(pontos1 >= 12)
            {
                vitorias1++
                vitorias.setText("vitórias:"+vitorias1.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
            }
            if(pontos2 >= 12)
            {
                vitorias2++
                vit.setText("vitórias:"+vitorias2.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
            }
        }
        botao9.setOnClickListener()
        {
            if(esquerda == true) {
                pontos1 = pontos1 + 9
                cincot.setText(pontos1.toString())
            }
            else
            {
                pontos2 = pontos2 + 9
                um.setText(pontos2.toString())
            }
            if(pontos1 >= 12)
            {
                vitorias1++
                vitorias.setText("vitórias:"+vitorias1.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
            }
            if(pontos2 >= 12)
            {
                vitorias2++
                vit.setText("vitórias:"+vitorias2.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
            }
        }
        botao12.setOnClickListener()
        {
            if(esquerda == true)
            {
            pontos1 = pontos1 + 12
            cincot.setText(pontos1.toString())}
            else
            {
                pontos2 = pontos2 + 12
                um.setText(pontos2.toString())
            }
            if(pontos1 >= 12)
            {
                vitorias1++
                vitorias.setText("vitórias:"+vitorias1.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
            }
            if(pontos2 >= 12)
            {
                vitorias2++
                vit.setText("vitórias:"+vitorias2.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
            }
        }
    }
}
