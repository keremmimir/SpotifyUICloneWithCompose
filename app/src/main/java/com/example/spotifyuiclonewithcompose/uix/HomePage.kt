package com.example.spotifyuiclonewithcompose.uix


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.spotifyuiclonewithcompose.R
import com.example.spotifyuiclonewithcompose.data.entity.TopItem
import com.example.spotifyuiclonewithcompose.ui.theme.BackgroundColor
import com.example.spotifyuiclonewithcompose.ui.theme.TopCardColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage(navController: NavController) {
    val topItemList = remember { mutableStateListOf<TopItem>() }
    val recentlyItemList = remember { mutableStateListOf<TopItem>() }
    val releasesItemList = remember { mutableStateListOf<TopItem>() }

    fun addTopItemList() {
        topItemList.add(TopItem(R.drawable.top_image, "Machine Gun Kelly"))
        topItemList.add(TopItem(R.drawable.top_image2, "The Oral History of The Office"))
        topItemList.add(TopItem(R.drawable.top_image3, "Greta Van Fleet"))
        topItemList.add(TopItem(R.drawable.top_image4, "Bryce Vine"))
        topItemList.add(TopItem(R.drawable.top_image5, "Chon"))
        topItemList.add(TopItem(R.drawable.top_image6, "Tycho"))
    }

    fun recentlyItemList() {
        recentlyItemList.add(TopItem(R.drawable.recently_image1, "Tickets to my downfall"))
        recentlyItemList.add(TopItem(R.drawable.recently_image2, "Dance Gavin Dance"))
        recentlyItemList.add(TopItem(R.drawable.recently_image3, "Carnival"))
        recentlyItemList.add(TopItem(R.drawable.recently_image1, "Tickets to my downfall"))
        recentlyItemList.add(TopItem(R.drawable.recently_image2, "Dance Gavin Dance"))
        recentlyItemList.add(TopItem(R.drawable.recently_image3, "Carnival"))
    }

    fun releasesItemList() {
        releasesItemList.add(TopItem(R.drawable.bottom_image, "My Ex’s Best Friend"))
        releasesItemList.add(TopItem(R.drawable.bottom_image2, "Dance Gavin Dance"))
        releasesItemList.add(TopItem(R.drawable.bottom_image, "My Ex’s Best Friend"))
        releasesItemList.add(TopItem(R.drawable.bottom_image2, "Dance Gavin Dance"))
        releasesItemList.add(TopItem(R.drawable.bottom_image, "My Ex’s Best Friend"))
        releasesItemList.add(TopItem(R.drawable.bottom_image2, "Dance Gavin Dance"))
    }

    LaunchedEffect(true) {
        addTopItemList()
        recentlyItemList()
        releasesItemList()
    }

    Scaffold(topBar = {
        TopAppBar(
            title = { Text("Good Evening", color = Color.White, fontWeight = FontWeight.Bold) },
            colors = TopAppBarDefaults.topAppBarColors(BackgroundColor),
            actions = {
                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_settings_24),
                        contentDescription = "",
                        tint = Color.White
                    )
                }
            }
        )
    }) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(color = BackgroundColor)
        ) {
            item {
                LazyVerticalGrid(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                        .padding(10.dp),
                    columns = GridCells.Fixed(2)
                ) {
                    items(count = topItemList.count()) {
                        val item = topItemList[it]
                        Card(
                            modifier = Modifier.padding(5.dp),
                            shape = RoundedCornerShape(5.dp)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(TopCardColor),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(item.image),
                                    contentDescription = "",
                                    modifier = Modifier.size(60.dp, 60.dp)
                                )
                                Text(
                                    item.name,
                                    color = Color.White,
                                    fontSize = 14.sp,
                                    fontFamily = FontFamily.SansSerif,
                                    fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding(5.dp)
                                )
                            }
                        }
                    }
                }
            }
            item {
                Spacer(Modifier.height(10.dp))
                Text(
                    "Recently Played",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 15.dp)
                )
            }
            item {
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .padding(start = 10.dp)
                ) {
                    items(count = recentlyItemList.count()) {
                        val item = recentlyItemList[it]
                        Card(
                            modifier = Modifier
                                .width(100.dp)
                                .padding(5.dp),
                            shape = RoundedCornerShape(0.dp)
                        ) {
                            Column(
                                Modifier
                                    .fillMaxWidth()
                                    .background(BackgroundColor),
                                horizontalAlignment = Alignment.Start
                            ) {
                                Image(
                                    painter = painterResource(item.image),
                                    contentDescription = "",
                                    modifier = Modifier.size(100.dp)
                                )
                                Text(
                                    item.name,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    modifier = Modifier.fillMaxWidth(),
                                    lineHeight = 14.sp
                                )
                            }
                        }
                    }
                }
            }
            item {
                Spacer(Modifier.height(15.dp))
                Text(
                    "New Releases for you",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 15.dp)
                )
            }
            item {
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .padding(start = 10.dp)
                ) {
                    items(count = releasesItemList.count()) {
                        val item = releasesItemList[it]
                        Card(
                            modifier = Modifier
                                .width(150.dp)
                                .padding(5.dp),
                            shape = RoundedCornerShape(0.dp)
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(BackgroundColor),
                                horizontalAlignment = Alignment.Start
                            ) {
                                Image(
                                    painter = painterResource(item.image),
                                    contentDescription = "",
                                    modifier = Modifier.size(150.dp)
                                )
                                Text(
                                    item.name,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    modifier = Modifier.fillMaxWidth(),
                                    lineHeight = 14.sp
                                )
                            }
                        }
                    }
                }
            }
            item {
                Spacer(Modifier.height(15.dp))
                Text(
                    "New Releases for you",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 15.dp)
                )
            }
            item {
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(280.dp)
                        .padding(start = 10.dp)
                ) {
                    items(count = releasesItemList.count()) {
                        val item = releasesItemList[it]
                        Card(
                            modifier = Modifier
                                .width(150.dp)
                                .padding(5.dp),
                            shape = RoundedCornerShape(0.dp)
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(BackgroundColor),
                                horizontalAlignment = Alignment.Start
                            ) {
                                Image(
                                    painter = painterResource(item.image),
                                    contentDescription = "",
                                    modifier = Modifier.size(150.dp)
                                )
                                Text(
                                    item.name,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    modifier = Modifier.fillMaxWidth(),
                                    lineHeight = 14.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
