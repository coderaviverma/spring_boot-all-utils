package com.example.demo.kotlin

fun main(){

    val depp = "http://m.rytr.in/independent-food-flow?utm=utm_refer"
    val utmRefer = depp.split("\\?".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[1].split("=")[1]

    println(utmRefer)
}