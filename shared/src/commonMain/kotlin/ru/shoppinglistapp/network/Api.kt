package ru.shoppinglistapp.network



object ApiClient {
    private const val BASE_URL = "https://cyberprot.ru/shopping/v2/"
    private val client = HttpClient {
        install(JsonFeature) {
            serializer = KotlinxSerializer(Json { ignoreUnknownKeys = true })
        }
        install(Logging) {
            level = LogLevel.ALL
        }
    }

    suspend fun get(endpoint: String): String {
        return client.get("$BASE_URL$endpoint")
    }

    suspend fun post(endpoint: String, parameters: Map<String, String>): String {
        return client.post("$BASE_URL$endpoint") {
            parameters.forEach { (key, value) -> parameter(key, value) }
        }
    }
}