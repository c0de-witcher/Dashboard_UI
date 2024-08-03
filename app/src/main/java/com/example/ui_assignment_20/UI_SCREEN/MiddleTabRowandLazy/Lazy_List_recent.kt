package com.example.ui_assignment_20.UI_SCREEN.MiddleTabRowandLazy

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.ui_assignment_20.API.Data_fetched.RecentLink
import com.example.ui_assignment_20.R
import com.example.ui_assignment_20.ui.theme.Grey
import com.example.ui_assignment_20.ui.theme.White
import com.example.ui_assignment_20.ui.theme.light_Blue

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun colum_list_recent(it: RecentLink) {

    Card (modifier = Modifier
        .fillMaxWidth()
        .padding(top = 10.dp, bottom = 10.dp)
        .background(White, RoundedCornerShape(10.dp)),
        colors = CardDefaults.cardColors(
            containerColor = White
        ),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 3.dp,
            hoveredElevation = 3.dp
        )
    ){
        Column(modifier = Modifier.fillMaxSize()) {
            Row (verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)){
                Box(modifier = Modifier
                    .border(1.dp, Grey, RoundedCornerShape(10.dp))
                ) {
                    GlideImage(model = it.original_image, contentDescription = "", modifier = Modifier
                        .size(50.dp)
                        .clip(
                            RoundedCornerShape(10.dp)
                        ), contentScale = ContentScale.Crop)
                }
                Column(modifier = Modifier.padding(start = 15.dp)) {
                    Text(text = it.title, fontSize = 15.sp, maxLines = 1, overflow = TextOverflow.Ellipsis, modifier = Modifier
                        .width(180.dp)
                        .clickable { }, color = Color.Black)
                    Text(text = it.times_ago, color = Grey, fontSize = 13.sp, modifier = Modifier.clickable {  })
                }
                Column(modifier = Modifier
                    .padding(start = 15.dp)
                    .align(Alignment.CenterVertically),
                    horizontalAlignment = Alignment.End) {
                    Text(text = it.total_clicks.toString(), fontSize = 15.sp, maxLines = 1, overflow = TextOverflow.Ellipsis, color = Color.Black)
                    Text(text = "Clicks", color = Grey, fontSize = 13.sp)
                }
            }
            Card (modifier = Modifier
                .fillMaxWidth()
                .border(
                    0.5f.dp,
                    light_Blue,
                    RoundedCornerShape(bottomEnd = 12.dp, bottomStart = 12.dp)
                )
                .background(
                    Color(0xFFe2edff),
                    RoundedCornerShape(bottomStart = 10.dp, bottomEnd = 10.dp)
                )
                .padding(10.dp),
                colors = CardDefaults.cardColors(Color(0xFFe2edff))){
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(text = it.web_link, maxLines = 1, overflow = TextOverflow.Ellipsis, modifier = Modifier
                        .width(200.dp)
                        .clickable { }, color = light_Blue
                    )
                    Image(painter = painterResource(id = R.drawable.copy), contentDescription = "copy",
                        Modifier
                            .size(15.dp)
                            .clickable { })

                }
            }


        }

    }

}