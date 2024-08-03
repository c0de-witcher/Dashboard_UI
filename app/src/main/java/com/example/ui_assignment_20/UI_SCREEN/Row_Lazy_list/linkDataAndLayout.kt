package com.example.ui_assignment_20.UI_SCREEN.Row_Lazy_list

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.ui_assignment_20.R

@Composable
fun rowList(){
    val list = listOf(
        row_List_item(R.drawable.clicks,"123","Today's clicks", Color(0xFFeae6f8)),
        row_List_item(R.drawable.location,"Ahmedabad","Top Location", Color(0xFFe2edff)),
        row_List_item(R.drawable.globe,"Instagram","Top source", Color(0xFFffe8ed))
    )
    LazyRow {
        itemsIndexed(list){index, item ->
            row_list_Layout(item)

        }
    }

}