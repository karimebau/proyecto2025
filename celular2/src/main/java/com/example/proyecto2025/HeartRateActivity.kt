package com.example.proyecto2025

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class HeartRateActivity : AppCompatActivity() {

    private lateinit var heartRateText: TextView
    private val handler = Handler(Looper.getMainLooper())
    private var isSimulating = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heart_rate)

        heartRateText = findViewById(R.id.textHeartRate)

        // Inicia la simulación
        simulateHeartRate()
    }

    private fun simulateHeartRate() {
        handler.post(object : Runnable {
            override fun run() {
                if (isSimulating) {
                    // Genera un valor aleatorio entre 60 y 110 BPM
                    val bpm = Random.nextInt(60, 110)
                    heartRateText.text = "💓 Ritmo cardíaco simulado: $bpm BPM"

                    // Vuelve a ejecutar cada segundo
                    handler.postDelayed(this, 1000)
                }
            }
        })
    }

    override fun onPause() {
        super.onPause()
        isSimulating = false
        handler.removeCallbacksAndMessages(null)
    }

    override fun onResume() {
        super.onResume()
        isSimulating = true
        simulateHeartRate()
    }
}
