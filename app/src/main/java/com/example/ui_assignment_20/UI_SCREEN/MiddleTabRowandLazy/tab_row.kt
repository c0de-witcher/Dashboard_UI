package com.example.ui_assignment_20.UI_SCREEN.MiddleTabRowandLazy

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.ui_assignment_20.R
import com.example.ui_assignment_20.ViewModel.viewnodel
import com.example.ui_assignment_20.ui.theme.Grey
import com.example.ui_assignment_20.ui.theme.White
import com.example.ui_assignment_20.ui.theme.border_grey
import com.example.ui_assignment_20.ui.theme.light_Blue

@Composable
fun middle_tab_row(viewnodel2 : viewnodel) {
    var selected by remember {
        mutableIntStateOf(0)
    }


    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(top = 30.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly){
        Button(onClick = { selected=0
            viewnodel2.top_link_on.value = true
            viewnodel2.recent_link_on.value=false},
            colors = ButtonDefaults.buttonColors(
                containerColor = if (viewnodel2.top_link_on.value) light_Blue else Color.Transparent

            )) {
            Text(text = "Top Links",color = if (viewnodel2.top_link_on.value) White else Grey)
        }
        Button(onClick = { selected=1
            viewnodel2.top_link_on.value = false
            viewnodel2.recent_link_on.value=true},
            colors = ButtonDefaults.buttonColors(
                containerColor = if (viewnodel2.recent_link_on.value) light_Blue else Color.Transparent

            )) {
            Text(text = "Recent Links", color = if (viewnodel2.recent_link_on.value) White else Grey)
        }
        Box(modifier = Modifier
            .clickable {
            }
            .border(1.dp, border_grey, RoundedCornerShape(10.dp))
            .padding(10.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.search),
                contentDescription = "search",
                colorFilter = ColorFilter.tint(Grey))
        }
    }
}