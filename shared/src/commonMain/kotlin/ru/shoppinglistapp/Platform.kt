package ru.shoppinglistapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform