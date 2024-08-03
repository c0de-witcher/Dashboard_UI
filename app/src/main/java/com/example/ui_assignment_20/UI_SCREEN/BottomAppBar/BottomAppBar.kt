package com.example.ui_assignment_20.UI_SCREEN.BottomAppBar

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui_assignment_20.R
import com.example.ui_assignment_20.ViewModel.viewnodel
import com.example.ui_assignment_20.ui.theme.Grey
import com.example.ui_assignment_20.ui.theme.White
import com.example.ui_assignment_20.ui.theme.light_Blue

@Composable
fun floating_button() {
    FloatingActionButton(onClick = { /*TODO*/ },
        shape = CircleShape,
        containerColor = light_Blue,
        elevation = FloatingActionButtonDefaults.elevation(
            defaultElevation = 5.dp,
            hoveredElevation = 5.dp
        ),
        modifier = Modifier.shadow(5.dp, CircleShape, spotColor = light_Blue)

    ) {
        Icon(imageVector = Icons.Filled.Add, contentDescription = "", tint = White)

    }
}

@Composable
fun bottom_bar(viewmodel1: viewnodel) {
    val Nav_items = listOf(
        bottom_bar_items(R.drawable.links,"Links")
        , bottom_bar_items(R.drawable.courses,"Courses"),
        bottom_bar_items(R.drawable.links,""),
        bottom_bar_items(R.drawable.megaphone,"Campaigns"),
        bottom_bar_items(R.drawable.user,"Profile")
    )




    BottomAppBar(
        containerColor = White,
        contentPadding = BottomAppBarDefaults.ContentPadding,


        ) {
        Nav_items.forEachIndexed() {index, bottomBarItems ->
            NavigationBarItem(selected = viewmodel1.selected.value==index,
                onClick = { viewmodel1.selected.value= index },
                icon = { Icon(painter = painterResource(id = bottomBarItems.icon!!),
                    contentDescription = bottomBarItems.tittle,
                    tint = if (viewmodel1.selected.value==index) Color.Black else Grey,
                    modifier = Modifier.size(20.dp))
                },
                label = { Text(text = bottomBarItems.tittle!!,
                    color = if (viewmodel1.selected.value==index) Color.Black else Grey,
                    fontSize = 10.sp)
                },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = Color.Transparent

                ),
                modifier = Modifier.align(Alignment.CenterVertically),


                )

        }
    }



}



data class bottom_bar_items(
    val icon : Int?,
    val tittle : String?
)