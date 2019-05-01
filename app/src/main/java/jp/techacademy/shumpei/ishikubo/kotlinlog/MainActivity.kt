package jp.techacademy.shumpei.ishikubo.kotlinlog

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sapporo = Human("sapporo", 3 ,"asahi")
        val asahi = Human("asahi", 12 ,"sapporo")

        sapporo.say()
        sapporo.think()

        asahi.say()
        asahi.think()
    }
}
