package com.example.a30daysapp

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30daysapp.module.CarburatorData
import com.example.a30daysapp.module.carb
import com.example.compose.AppTheme

@Composable
fun ThreeApp() {
    Scaffold(topBar = {
        CarbTopAppBar()
    }) { it ->
        LazyColumn(contentPadding = it) {
            items(carb) {
                HeroesItem(
                    carb = it
                )
            }
        }
    }
}

@Composable
fun HeroesItem(carb: CarburatorData, modifier: Modifier = Modifier) {
    var expanded by remember {
        mutableStateOf(false)
    }
    Card(
        modifier = modifier
            .clip(MaterialTheme.shapes.medium)
            .padding(bottom = 8.dp, top = 8.dp, start = 16.dp, end = 16.dp)
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioNoBouncy,
                    stiffness = Spring.StiffnessMedium
                )
            ),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
        ) {
            CarbInfo(carb.day, carb.variable)
            CarbIcon(carb.image, Modifier.align(alignment = Alignment.CenterHorizontally), onLongClick = {expanded = !expanded})
        }
        if (expanded) {
            CarbInfoPlus(carbRecommendation = carb.recommendation)
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CarbIcon(
    @DrawableRes icon: Int,
    modifier: Modifier = Modifier,
    onLongClick: (() -> Unit)?
) {
    Image(
        modifier = modifier.combinedClickable(
            enabled = true,
            onClick = {},
            onLongClick = onLongClick
        )
            .padding(start = 16.dp, end = 16.dp, bottom = 16.dp)
            .clip(MaterialTheme.shapes.small),
        painter = painterResource(icon),
        contentDescription = null,
    )
}

@Composable
fun CarbInfoPlus(
    @StringRes carbRecommendation: Int,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier.padding(start = 16.dp, bottom = 16.dp)) {
        Text(
            text = stringResource(carbRecommendation),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}


@Composable
fun CarbInfo(
    @StringRes carbDay: Int,
    @StringRes carbVar: Int,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(start = 16.dp, bottom = 16.dp, top = 16.dp)) {
        Text(
            text = stringResource(carbDay),
            style = MaterialTheme.typography.displayLarge
        )
        Text(
            text = stringResource(carbVar),
            style = MaterialTheme.typography.bodyLarge

        )
    }
}

@Preview
@Composable
fun Preview() {
    AppTheme {
        ThreeApp()
    }
}