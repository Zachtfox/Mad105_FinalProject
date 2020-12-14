package com.example.final2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val acro: TextView = findViewById(R.id.idAcrobatics)
        val ani:TextView = findViewById(R.id.idAnimal)
        val arc: TextView = findViewById(R.id.idArcana)
        val ath: TextView = findViewById(R.id.idAthletics)
        val dec: TextView = findViewById(R.id.idDeception)
        val his:TextView = findViewById(R.id.idHistory)
        val ins: TextView = findViewById(R.id.idInsight)
        val int: TextView = findViewById(R.id.idIntimidation)
        val inv: TextView = findViewById(R.id.idInvestigation)
        val med: TextView = findViewById(R.id.idMedicine)
        val nat: TextView = findViewById(R.id.idNature)
        val perc: TextView = findViewById(R.id.idPerception)
        val perf: TextView = findViewById(R.id.idPerformance)
        val pers: TextView = findViewById(R.id.idPersuasion)
        val rel: TextView = findViewById(R.id.idReligion)
        val sle: TextView = findViewById(R.id.idSleight)
        val ste: TextView = findViewById(R.id.idStealth)
        val sur: TextView = findViewById(R.id.idSurvival)

        val intent = intent
        val str = intent.getStringExtra("strengthMod")
        val dex = intent.getStringExtra("dexMod")
        val con = intent.getStringExtra("conMod")
        val intel = intent.getStringExtra("intelMod")
        val wis = intent.getStringExtra("wisMod")
        val chr = intent.getStringExtra("chrMod")

        acro.text = "$dex"
        ani.text = "$wis"
        arc.text = "$int"
        ath.text = "$str"
        dec.text = "$chr"
        his.text = "$int"
        ins.text = "$wis"
        int.text = "$chr"
        inv.text = "$intel"
        med.text = "$wis"
        nat.text = "$int"
        perc.text = "$wis"
        perf.text = "$chr"
        pers.text = "$chr"
        rel.text = "$intel"
        sle.text = "$dex"
        ste.text = "$dex"
        sur.text = "$wis"

    }
}