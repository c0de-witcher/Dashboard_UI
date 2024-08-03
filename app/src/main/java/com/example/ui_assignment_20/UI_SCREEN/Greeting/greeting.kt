package com.example.ui_assignment_20.UI_SCREEN.Greeting

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui_assignment_20.ui.theme.Grey

@Composable
fun greeting(){
    Text(text = "Good morning", color = Grey, fontSize = 16.sp)
    Text(text = "Ajay Manva \uD83D\uDC4B",
        color = Color.Black,
        fontSize = 20.sp,
        modifier = Modifier.padding(top = 10.dp),
        fontWeight = FontWeight.Bold)
}