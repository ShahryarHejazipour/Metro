package com.tispunshahryar960103.metro.utils

import android.content.Context
import android.content.SharedPreferences
import com.tispunshahryar960103.metro.models.Line

class AppConfig (val context: Context) {

    var sharedPreferences:SharedPreferences
    lateinit var editor: SharedPreferences.Editor

    init {

        sharedPreferences=context.getSharedPreferences("Setting",0)
        editor=sharedPreferences.edit()


    }

    fun setTitle(title:String){
        editor.putString("title",title)
        editor.commit()
    }

    fun  getTitle(): String? {
        return sharedPreferences.getString("title","")
    }


    fun setEnglishTitle(englishTitle:String){
        editor.putString("englishTitle",englishTitle)
        editor.commit()
    }

    fun getEnglishTitle(): String? {
        return sharedPreferences.getString("englishTitle","")

    }





}