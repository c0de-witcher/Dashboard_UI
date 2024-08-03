package com.example.ui_assignment_20.API

import com.example.ui_assignment_20.API.Data_fetched.Data
import com.example.ui_assignment_20.API.Data_fetched.response
import com.example.ui_assignment_20.API.Data_fetched.whole_data
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface Destination {

    //@Headers("Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MjU5MjcsImlhdCI6MTY3NDU1MDQ1MH0.dCkW0ox8tbjJA2GgUx2UEwNlbTZ7Rr38PVFJevYcXFI")
    @GET("dashboardNew")
   suspend fun getDestination(@Header("Authorization") token: String): Response<response>
}