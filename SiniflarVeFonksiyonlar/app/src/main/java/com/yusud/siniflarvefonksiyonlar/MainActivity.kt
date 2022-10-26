package com.yusud.siniflarvefonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var j = 0

        if(j == 0){
            ilkFonksiyon()
        }else{
            ikinciFonksiyon()
        }
    }

    fun ilkFonksiyon(){
        println("Genel Fonksiypn Mantığı")
    }

    fun ikinciFonksiyon(){
        println("Geliştirilecek")
    }
}