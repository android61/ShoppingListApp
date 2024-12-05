package ru.shoppinglistapp.models
import kotlinx.serialization.Serializable

@Serializable
data class ShoppingList(
    val id: Int,
    val name: String,
    val created: String,
    val items: List<ShoppingItem> = emptyList()
)