package ru.shoppinglistapp.logic

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import models.ShoppingList
import network.ApiClient
import ru.shoppinglistapp.models.ShoppingList
import ru.shoppinglistapp.network.ApiClient

class ShoppingListManager {
    private val _shoppingLists = MutableStateFlow<List<ShoppingList>>(emptyList())
    val shoppingLists: StateFlow<List<ShoppingList>> = _shoppingLists

    suspend fun loadShoppingLists(key: String) {
        val response = ApiClient.get("GetAllMyShopLists?key=$key")
        // Обработка ответа сервера и обновление _shoppingLists
    }
}