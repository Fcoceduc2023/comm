package com.ceduc.comm

import android.content.Context
import android.content.Intent
import android.content.LocusId
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun onCreate(db: SQLiteDatabase?) {
            val CREATE_PRODUCTS_TABLE =
                "CREATE TABLE products ( " +
                        "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "name TEXT, " +
                        "description TEXT, " +
                        "price REAL, " +
                        "image_url TEXT)"
            db?.execSQL(CREATE_PRODUCTS_TABLE)
        }

        fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
            db?.execSQL("DROP TABLE IF EXISTS products")
            onCreate(db)

            data class Product(val id: Int, val name: String, val description: String, val price: Double, val imageUrl: String)

            val ingrese = findViewById<Button>(R.id.button6)
            ingrese.setOnClickListener {
                val intencion = Intent(this, Dron ::class.java)
                startActivity(intencion)
            }



            val ingrese = findViewById<Button>(R.id.button2)
            ingrese.setOnClickListener {
                val intencion = Intent(this, Computador ::class.java)
                startActivity(intencion)
            }


        }



    }
}