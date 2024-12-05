package ru.shoppinglistapp.models
import kotlinx.serialization.Serializable

@Serializable
data class ShoppingItem(
    val id: Int,
    val name: String,
    val quantity: Int,
    val crossedOff: Boolean = false
)