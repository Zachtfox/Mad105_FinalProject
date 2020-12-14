package com.example.final2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val submit: Button = findViewById<Button>(R.id.idBtnSub)

        val strength: EditText = findViewById(R.id.idStrengthIn)
        val dex: EditText = findViewById(R.id.idDexIn)
        val con: EditText = findViewById(R.id.idConIn)
        val intel: EditText = findViewById(R.id.idIntelIn)
        val wis: EditText = findViewById(R.id.idWisIn)
        val chr: EditText = findViewById(R.id.idChrIn)

        var strengthMod = strength.text.toString()
        var dexMod = dex.text.toString()
        var conMod = con.text.toString()
        var intelMod = intel.text.toString()
        var wisMod = wis.text.toString()
        var chrMod = chr.text.toString()

        submit.setOnClickListener {

            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("strengthMod", strengthMod)
            intent.putExtra("dexMod", dexMod)
            intent.putExtra("conMod", conMod)
            intent.putExtra("intelMod", intelMod)
            intent.putExtra("wisMod", wisMod)
            intent.putExtra("chrMod", chrMod)
            startActivity(intent)
        }



    }

    }
