package com.example.a30daysapp.module

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30daysapp.R

data class CarburatorData(
    @StringRes val day: Int,
    @StringRes val variable: Int,
    @DrawableRes val image: Int,
    @StringRes val recommendation: Int
)

val carb = listOf(
    CarburatorData(R.string.day1, R.string.Var1, R.drawable.toyota_cressida_964884, R.string.zero),
    CarburatorData(R.string.day2, R.string.Var1, R.drawable.carburetorstep1, R.string.one),
    CarburatorData(
        R.string.day3,
        R.string.Var1,
        R.drawable.v4_728px_adjust_a_carburetor_step_2,
        R.string.two
    ),
    CarburatorData(
        R.string.day4,
        R.string.Var1,
        R.drawable.v4_728px_adjust_a_carburetor_step_3,
        R.string.three
    ),
    CarburatorData(
        R.string.day5,
        R.string.Var1,
        R.drawable.v4_728px_adjust_a_carburetor_step_4,
        R.string.four
    ),
    CarburatorData(
        R.string.day6,
        R.string.Var1,
        R.drawable.v4_728px_adjust_a_carburetor_step_5,
        R.string.five
    ),
    CarburatorData(
        R.string.day7,
        R.string.Var1,
        R.drawable.v4_728px_adjust_a_carburetor_step_6,
        R.string.six
    ),
    CarburatorData(
        R.string.day8,
        R.string.Var1,
        R.drawable.v4_728px_adjust_a_carburetor_step_7,
        R.string.seven
    ),
    CarburatorData(
        R.string.day9,
        R.string.Var1,
        R.drawable.v4_728px_adjust_a_carburetor_step_8,
        R.string.eight
    ),
    CarburatorData(
        R.string.day10,
        R.string.Var1,
        R.drawable.v4_728px_adjust_a_carburetor_step_9,
        R.string.nine
    ),
    CarburatorData(
        R.string.day11,
        R.string.Var1,
        R.drawable.v4_728px_adjust_a_carburetor_step_9,
        R.string.ten
    ),
    CarburatorData(
        R.string.day12,
        R.string.Var1,
        R.drawable.v4_728px_adjust_a_carburetor_step_11,
        R.string.eleven
    ),
    CarburatorData(
        R.string.day13,
        R.string.Var1,
        R.drawable.v4_728px_adjust_a_carburetor_step_11,
        R.string.twelve
    ),
    CarburatorData(
        R.string.day14,
        R.string.Var1,
        R.drawable.v4_728px_adjust_a_carburetor_step_13,
        R.string.theerteen
    ),
    CarburatorData(
        R.string.day15,
        R.string.Var2,
        R.drawable.v4_728px_jump_your_battery_step_13,
        R.string.fourteen
    ),
    CarburatorData(R.string.day16, R.string.Var2, R.drawable.carburetorstep1, R.string.eight),
    CarburatorData(
        R.string.day17,
        R.string.Var2,
        R.drawable.v4_728px_adjust_a_carburetor_step_13,
        R.string.fifteen
    ),
    CarburatorData(
        R.string.day18,
        R.string.Var2,
        R.drawable.v4_728px_adjust_a_carburetor_step_17,
        R.string.sixteen
    ),
    CarburatorData(
        R.string.day19,
        R.string.Var2,
        R.drawable.v4_728px_adjust_a_carburetor_step_18,
        R.string.seventeen
    ),
    CarburatorData(
        R.string.day20,
        R.string.Var2,
        R.drawable.v4_728px_adjust_a_carburetor_step_19,
        R.string.eighteen
    ),
    CarburatorData(
        R.string.day21,
        R.string.Var2,
        R.drawable.v4_728px_adjust_a_carburetor_step_20,
        R.string.nineteen
    ),
    CarburatorData(
        R.string.day22,
        R.string.Var2,
        R.drawable.v4_728px_adjust_a_carburetor_step_20,
        R.string.twenty
    ),
    CarburatorData(
        R.string.day23,
        R.string.Var2,
        R.drawable.v4_728px_adjust_a_carburetor_step_19,
        R.string.twenty1
    ),
    CarburatorData(
        R.string.day24,
        R.string.Var2,
        R.drawable.v4_728px_adjust_a_carburetor_step_3,
        R.string.twenty2
    ),
)