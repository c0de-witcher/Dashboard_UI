package com.example.ui_assignment_20.UI_SCREEN.MiddleTabRowandLazy

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ui_assignment_20.ViewModel.viewnodel

@Composable
fun colim_Top_list_lazy(viewnodel2: viewnodel) {
    Box (modifier = Modifier
        .height(400.dp)
        .fillMaxWidth()
        .padding(top = 20.dp)){

        if(viewnodel2.top_link_on.value){
            LazyColumn {
                itemsIndexed(viewnodel2.top_link){index, it ->


                    colum_list_top(it)
                }
            }
        }
        else{
            LazyColumn {
                itemsIndexed(viewnodel2.recent_link){ index, it ->


                    colum_list_recent(it)
                }
            }
        }

    }

}