package com.example.ui_assignment_20.ViewModel

import android.content.Context
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.ui_assignment_20.API.Data_fetched.RecentLink
import com.example.ui_assignment_20.API.Data_fetched.TopLink
import com.example.ui_assignment_20.API.Destination
import com.example.ui_assignment_20.API.serviceBuilder
import com.example.ui_assignment_20.TokenManager.tokenManager


import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class viewnodel() : ViewModel() {


    var recent_link : List<RecentLink> = emptyList()
    var top_link : List<TopLink> = emptyList()
    var load = mutableStateOf(false)
    var top_link_on = mutableStateOf(true)
    var recent_link_on = mutableStateOf(false)
    var selected = mutableIntStateOf(0)



    fun  Api_request(token: String) {

        val retrofit = serviceBuilder.getInstance().create(Destination::class.java)

        CoroutineScope(Dispatchers.IO).launch {
            val result = retrofit.getDestination(token)
            if (result.isSuccessful){
                recent_link = result.body()!!.data.recent_links
                top_link = result.body()!!.data.top_links
                Log.i("shivam", top_link[0].original_image)
                load.value = true
                Log.i("shivam","true")
            }
            else{
                Log.i("shivam","false")
            }
        }
    }
}



