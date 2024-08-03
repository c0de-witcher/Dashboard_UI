package com.example.ui_assignment_20.UI_SCREEN

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.Hyphens
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.ui_assignment_20.API.Data_fetched.RecentLink
import com.example.ui_assignment_20.API.Data_fetched.TopLink
import com.example.ui_assignment_20.R
import com.example.ui_assignment_20.UI_SCREEN.Buttons.Frequently_asked
import com.example.ui_assignment_20.UI_SCREEN.Buttons.Whatsapp_button
import com.example.ui_assignment_20.UI_SCREEN.Buttons.analytic
import com.example.ui_assignment_20.UI_SCREEN.Buttons.view_ALl_links
import com.example.ui_assignment_20.UI_SCREEN.Dashboard.dashboard
import com.example.ui_assignment_20.UI_SCREEN.Graph.chart_box_card
import com.example.ui_assignment_20.UI_SCREEN.Greeting.greeting
import com.example.ui_assignment_20.UI_SCREEN.MiddleTabRowandLazy.colim_Top_list_lazy
import com.example.ui_assignment_20.UI_SCREEN.MiddleTabRowandLazy.colum_list_recent
import com.example.ui_assignment_20.UI_SCREEN.MiddleTabRowandLazy.colum_list_top
import com.example.ui_assignment_20.UI_SCREEN.MiddleTabRowandLazy.middle_tab_row
import com.example.ui_assignment_20.UI_SCREEN.Row_Lazy_list.rowList
import com.example.ui_assignment_20.ViewModel.viewnodel
import com.example.ui_assignment_20.ui.theme.Grey
import com.example.ui_assignment_20.ui.theme.White
import com.example.ui_assignment_20.ui.theme.blury
import com.example.ui_assignment_20.ui.theme.border_grey
import com.example.ui_assignment_20.ui.theme.light_Blue
import com.example.ui_assignment_20.ui.theme.light_White
import ir.ehsannarmani.compose_charts.LineChart
import ir.ehsannarmani.compose_charts.extensions.format
import ir.ehsannarmani.compose_charts.models.GridProperties
import ir.ehsannarmani.compose_charts.models.HorizontalIndicatorProperties
import ir.ehsannarmani.compose_charts.models.LabelHelperProperties
import ir.ehsannarmani.compose_charts.models.LabelProperties
import ir.ehsannarmani.compose_charts.models.Line
import ir.ehsannarmani.compose_charts.models.ZeroLineProperties

@Composable
fun Content(viewmodel1: viewnodel) {

    Box (modifier = Modifier
        .fillMaxSize()
        .background(light_Blue)){
        Column {
            dashboard(viewmodel1)
            middle_Content(viewmodel1)

        }

    }

}


@Composable
fun middle_Content(viewnodel2: viewnodel) {

    Box (modifier = Modifier
        .fillMaxSize()
        .background(light_White, RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp))){
        Column(modifier = Modifier
            .padding(20.dp, 30.dp, 20.dp, 20.dp)
            .verticalScroll(rememberScrollState())
            ) {


            greeting()
            chart_box_card()
            rowList()
            analytic()
            middle_tab_row(viewnodel2)

            colim_Top_list_lazy(viewnodel2)
            view_ALl_links()
            Whatsapp_button()
            Frequently_asked()






        }

    }
}


































@Preview(showSystemUi = true)
@Composable
private fun view() {
    val viewmodel1 = viewnodel()
    Content(viewmodel1)

}






