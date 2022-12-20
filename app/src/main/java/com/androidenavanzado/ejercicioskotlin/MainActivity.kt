package com.androidenavanzado.ejercicioskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        miniMaxSum()

    }

    fun miniMaxSum(): Unit {

        val nums: Array<Int> = arrayOf(1, 3, 5, 7, 9)
        var contador = 1 // el contador tiene que ir sumando uno para lograr la suma
        var suma = 0

        nums.forEachIndexed { index, numero ->
            if (index != contador){
                suma += numero

            }
        }

        print("El valor es la suma es $suma")
    }
}