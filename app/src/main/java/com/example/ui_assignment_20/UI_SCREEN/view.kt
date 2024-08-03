package com.example.ui_assignment_20.UI_SCREEN

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui_assignment_20.R
import com.example.ui_assignment_20.UI_SCREEN.BottomAppBar.bottom_bar
import com.example.ui_assignment_20.UI_SCREEN.BottomAppBar.floating_button
import com.example.ui_assignment_20.ViewModel.viewnodel
import com.example.ui_assignment_20.ui.theme.Grey
import com.example.ui_assignment_20.ui.theme.White
import com.example.ui_assignment_20.ui.theme.light_Blue
import com.example.ui_assignment_20.ui.theme.light_White

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun pratice(viewmodel1: viewnodel) {

    Scaffold(
        containerColor = light_White,
        bottomBar = {
            bottom_bar(viewmodel1)
        },
        floatingActionButtonPosition = FabPosition.EndOverlay,
        floatingActionButton = {

            Row( horizontalArrangement = Arrangement.Center, modifier = Modifier
                .fillMaxWidth()
                .offset(18.dp)) {
            Box(modifier = Modifier
                .clip(CircleShape)
                .background(White)
                .padding(10.dp),
                contentAlignment = Alignment.Center) {
                floating_button()
            }
        }},



    ) {
        Content(viewmodel1)
    }

}





