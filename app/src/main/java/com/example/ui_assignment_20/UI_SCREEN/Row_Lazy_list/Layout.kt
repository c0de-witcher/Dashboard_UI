package com.example.ui_assignment_20.UI_SCREEN.Row_Lazy_list

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.ui_assignment_20.ui.theme.Grey
import com.example.ui_assignment_20.ui.theme.White

@Composable
fun row_list_Layout(item: row_List_item) {
    Card (shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = White
        ), elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 3.dp
        ),
        modifier = Modifier
            .padding(top = 20.dp, start = 7.dp, end = 7.dp, bottom = 7.dp)
            .clickable { }){

        Column (modifier = Modifier
            .padding(5.dp)
            .width(130.dp)
            .height(130.dp)){
            Box (modifier = Modifier
                .padding(10.dp)
                .background(item.background_Color, CircleShape)
                .padding(10.dp)){
                Image(painter = painterResource(id = item.image), contentDescription = "")
            }

            Text(text = item.title, color = Color.Black, fontSize = 20.sp, modifier = Modifier
                .padding(top = 8.dp, start = 10.dp)
                .width(100.dp), overflow = TextOverflow.Ellipsis, maxLines = 1)
            Text(text = item.subtitle, color = Grey, fontSize = 15.sp, modifier = Modifier.padding(start = 10.dp,5.dp))
        }


    }
}