package com.example.ui_assignment_20.UI_SCREEN.Dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui_assignment_20.R
import com.example.ui_assignment_20.ViewModel.viewnodel
import com.example.ui_assignment_20.ui.theme.White
import com.example.ui_assignment_20.ui.theme.blury

@Composable
fun dashboard(viewnodel2: viewnodel) {
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(30.dp, 20.dp, 30.dp, bottom = 20.dp,),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically){
        Text(text = "Dashboard", color = White,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            // fontFamily = FontFamily(Font(R.font.inter)),
            modifier = Modifier
        )

        IconButton(onClick = { /*TODO*/ },modifier = Modifier
            .background(blury, RoundedCornerShape(10.dp))
            .padding(0.dp)) {
            Image(painter = painterResource(id = R.drawable.settings), contentDescription = "",
                modifier = Modifier.size(30.dp))

        }


    }

}