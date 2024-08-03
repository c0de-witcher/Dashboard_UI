package com.example.ui_assignment_20.TokenManager

import android.content.Context

class tokenManager(context: Context){
    val tokenFile = "token_file"
    private var pref  = context.getSharedPreferences(tokenFile,Context.MODE_PRIVATE)


    fun saveToken(token:String){
        var editor = pref.edit()
        editor.putString("token",token)
        editor.commit()

    }

    fun gettoken():String?{
        return pref.getString("token",null)

    }

}