package com.example.tugaskalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun inputNilai(view: View) {
        when((view as Button).text.toString()){


            "="-> {
                var dummy = findViewById<TextView>(R.id.angkakedua).text.toString();

                if ('+' in dummy) {
                    val angkasemua = dummy.split("+")

                    if (angkasemua.size > 1) {
                        var total = 0.0

                        for (i in 0 until angkasemua.size) {
                            total = total + angkasemua[i].toDouble()
                        }
                        findViewById<TextView>(R.id.angkapertama).text =
                            dummy + " = " + total.toString()
                        findViewById<TextView>(R.id.angkakedua).text = total.toString()
                    }
                } else if ('-' in dummy) {
                    val angkasemua = dummy.split("-")

                    if (angkasemua.size > 1) {
                        var total = angkasemua[0].toDouble()

                        for (i in 1 until angkasemua.size) {
                            total = total - angkasemua[i].toDouble()
                        }
                        findViewById<TextView>(R.id.angkapertama).text =
                            dummy + " = " + total.toString()
                        findViewById<TextView>(R.id.angkakedua).text = total.toString()
                    }
                } else if ('*' in dummy) {
                    val angkasemua = dummy.split("*")

                    if (angkasemua.size > 1) {
                        var total = angkasemua[0].toDouble()

                        for (i in 1 until angkasemua.size) {
                            total = total * angkasemua[i].toDouble()
                        }
                        findViewById<TextView>(R.id.angkapertama).text =
                            dummy + " = " + total.toString()
                        findViewById<TextView>(R.id.angkakedua).text = total.toString()
                    }
                } else if (':' in dummy) {
                    val angkasemua = dummy.split(":")

                    if (angkasemua.size > 1) {
                        var total = angkasemua[0].toDouble()

                        for (i in 1 until angkasemua.size) {
                            total = total / angkasemua[i].toDouble()
                        }
                        findViewById<TextView>(R.id.angkapertama).text =
                            dummy + " = " + total.toString()
                        findViewById<TextView>(R.id.angkakedua).text = total.toString()
                    }
                }
            }
            "AC" -> {
                findViewById<TextView>(R.id.angkakedua).text = ""
            }
            else->{
                findViewById<TextView>(R.id.angkakedua).text =
                    findViewById<TextView>(R.id.angkakedua).text.toString()+(view as Button).text.toString()
            }
        }
    }

}