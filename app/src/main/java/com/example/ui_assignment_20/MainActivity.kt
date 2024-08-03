package com.example.ui_assignment_20

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import com.example.ui_assignment_20.TokenManager.tokenManager
import com.example.ui_assignment_20.UI_SCREEN.Loading.loading

import com.example.ui_assignment_20.UI_SCREEN.pratice
import com.example.ui_assignment_20.ViewModel.st
import com.example.ui_assignment_20.ViewModel.viewnodel
import com.example.ui_assignment_20.ui.theme.UI_Assignment_20Theme


class MainActivity : ComponentActivity() {
    lateinit var viewmodel1 : viewnodel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // enableEdgeToEdge()
        viewmodel1 = ViewModelProvider(this)[viewnodel::class.java]
        val token = tokenManager(this.applicationContext)

        token.saveToken(st)


        setContent {
            UI_Assignment_20Theme {
                if(viewmodel1.load.value){
                    //Imagecheck()
                    Log.i("shivam","Viewmodel  not Call")
                    pratice(viewmodel1)
                }
                else{
                    Log.i("shivam","Viewmodel Call")
                    loading()
                    viewmodel1.Api_request(token.gettoken()!!)
                }


            }
        }
    }
}





