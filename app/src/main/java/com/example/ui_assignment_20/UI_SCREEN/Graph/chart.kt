package com.example.ui_assignment_20.UI_SCREEN.Graph

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.Hyphens
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui_assignment_20.R
import com.example.ui_assignment_20.ui.theme.Grey
import com.example.ui_assignment_20.ui.theme.White
import com.example.ui_assignment_20.ui.theme.border_grey
import com.example.ui_assignment_20.ui.theme.light_Blue
import ir.ehsannarmani.compose_charts.LineChart
import ir.ehsannarmani.compose_charts.extensions.format
import ir.ehsannarmani.compose_charts.models.GridProperties
import ir.ehsannarmani.compose_charts.models.HorizontalIndicatorProperties
import ir.ehsannarmani.compose_charts.models.LabelHelperProperties
import ir.ehsannarmani.compose_charts.models.LabelProperties
import ir.ehsannarmani.compose_charts.models.Line
import ir.ehsannarmani.compose_charts.models.ZeroLineProperties

@Composable
fun chart_box_card(){
    Card (modifier = Modifier
        .wrapContentHeight()
        .fillMaxWidth()
        .padding(top = 30.dp),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 2.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = White
        ),
        shape = RoundedCornerShape(10.dp)

    ){
        Column (modifier = Modifier
            .fillMaxSize()
            .padding(20.dp), ){
            Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically){
                Text(text = "Overview", color = Grey, fontSize = 15.sp)
                Box(modifier = Modifier
                    .border(1.dp, border_grey, RoundedCornerShape(10.dp))
                    .padding(start = 10.dp, end = 10.dp, bottom = 5.dp, top = 5.dp)
                    .clickable { }) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "22 Aug - 23 Sept", fontSize = 13.sp, modifier = Modifier.padding(end = 10.dp))
                        Image(painter = painterResource(id = R.drawable.clock), contentDescription = "clock", modifier = Modifier.size(15.dp))
                    }
                }

            }
            chart_box()

        }

    }

}


@Composable
fun chart_box(){

    Box (modifier = Modifier
        .background(White)
        .wrapContentHeight()
        .horizontalScroll(rememberScrollState())
        .padding(top = 20.dp)){
        LineChart(data = listOf(
            Line(
                values = listOf(12.0,30.0,50.0,80.0,75.0,100.0,25.0,100.0,75.0,10.0,34.0,48.0),
                label = "jan",
                color = SolidColor(light_Blue),
                firstGradientFillColor = Color(0xFFc7deff),
                secondGradientFillColor = White,

                )
        ),
            modifier = Modifier
                .height(150.dp)
                .width(400.dp)
                .padding(10.dp),
            maxValue = 100.0,
            minValue = 0.0,
            gridProperties = GridProperties(
                xAxisProperties = GridProperties.AxisProperties(
                    color = SolidColor(Color(0xFFf2f3f3)),
                    lineCount = 5
                ),
                yAxisProperties = GridProperties.AxisProperties(
                    color = SolidColor(Color(0xFFf2f3f3)),
                    lineCount = 12
                )
            ),
            zeroLineProperties = ZeroLineProperties(
                enabled = false,
                color = SolidColor(Color(0xFFf2f3f3))

            ),
            curvedEdges = false,
            labelHelperProperties = LabelHelperProperties(
                enabled = false,
                textStyle = TextStyle.Default.copy(
                    color = Grey,
                    fontSize = 5.sp

                )

            ),

            indicatorProperties = HorizontalIndicatorProperties(
                enabled = true,
                textStyle = TextStyle.Default.copy(
                    color = Grey,
                    hyphens = Hyphens.Auto,
                    textAlign = TextAlign.End,
                    fontSize = 8.sp


                ),
                contentBuilder = {

                    it.format(2)
                },
                padding = 10.dp,

                ),
            labelProperties = LabelProperties(
                enabled = true,
                labels = listOf("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"),
                textStyle = TextStyle.Default.copy(
                    color = Grey,
                    fontSize = 8.sp
                )
            )

        )




    }
}