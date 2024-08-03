package com.example.ui_assignment_20.UI_SCREEN.Buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.ui_assignment_20.R
import com.example.ui_assignment_20.ui.theme.border_grey

@Composable
fun analytic(){
    OutlinedButton(onClick = { /*TODO*/ },
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        border = BorderStroke(1.dp, border_grey)
    ) {
        Image(painter = painterResource(id = R.drawable.analytic), contentDescription = "")
        Text(text = "View Analytics", color = Color.Black, modifier = Modifier.padding(start = 20.dp))
    }

}



@Composable
fun view_ALl_links(){
    OutlinedButton(onClick = { /*TODO*/ },
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp)
            .clickable { },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        border = BorderStroke(1.dp, border_grey)
    ) {
        Image(painter = painterResource(id = R.drawable.links), contentDescription = "")
        Text(text = "View all Links", color = Color.Black, modifier = Modifier.padding(start = 20.dp))
    }
}


@Composable
fun Whatsapp_button(){
    OutlinedButton(onClick = { /*TODO*/ },
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 40.dp)
            .clickable { }
            .height(60.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFe1f0e3)
        ),
        border = BorderStroke(1.dp, Color(0xFFb1e6b6))
    ) {
        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Start, modifier = Modifier.fillMaxWidth()) {
            Image(painter = painterResource(id = R.drawable.whatsapp), contentDescription = "",)
            Text(text = "Talk with us", color = Color.Black, modifier = Modifier.padding(start = 20.dp))
        }
    }

}



@Composable
fun Frequently_asked(){
    OutlinedButton(onClick = { /*TODO*/ },
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 15.dp, bottom = 120.dp)
            .clickable { }
            .height(60.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFe8f1ff)
        ),
        border = BorderStroke(1.dp, Color(0xFFa0c6ff))
    ) {
        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Start, modifier = Modifier.fillMaxWidth()) {
            Image(painter = painterResource(id = R.drawable.interrogation), contentDescription = "interrogation",)
            Text(text = "Frequently Asked Questions", color = Color.Black, modifier = Modifier.padding(start = 20.dp))
        }
    }
}