package com.example.kreeda_preranascoutsports

import com.google.ai.client.generativeai.GenerativeModel
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

object GeminiClient {
    // Note: You should replace "YOUR_API_KEY" with a real API key from Google AI Studio.
    // For production, it's safer to store this in local.properties or use a backend.
    private const val API_KEY = "YOUR_API_KEY"

    private val generativeModel = GenerativeModel(
        modelName = "gemini-1.5-flash",
        apiKey = API_KEY
    )

    private val scope = MainScope()

    fun askGemini(prompt: String, callback: (String) -> Unit) {
        scope.launch {
            try {
                val response = generativeModel.generateContent(prompt)
                callback(response.text ?: "No response from Gemini")
            } catch (e: Exception) {
                callback("Error: ${e.message}")
            }
        }
    }
}
