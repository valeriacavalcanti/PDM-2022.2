package br.eti.valeria.ifcrud

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class BancoHelper (var context: Context): SQLiteOpenHelper(context, "ifcrud.db", null, 1) {

    override fun onCreate(db: SQLiteDatabase?) {
        val sql = "create table pessoas(id integer primary key autoincrement, nome text, data integer)"
        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, anterior: Int, atual: Int) {

    }
}