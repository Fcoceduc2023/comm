package com.ceduc.comm

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

class SQLiteDB (context: Context):SQLiteOpenHelper(context,"productos", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

    fun agregarDatos(){

    }

    fun borrarDatos(id:Int){

    }

    fun actualizarDatos(){

    }
}