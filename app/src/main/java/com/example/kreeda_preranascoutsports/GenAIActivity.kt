package com.example.kreeda_preranascoutsports

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GenAIActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this)
        textView.text = "🤖 Asking Gemini AI..."
        textView.textSize = 18f
        textView.setPadding(24, 24, 24, 24)

        setContentView(textView)

        val prompt = """
You are a sports coach AI.

Analyze athletes and give:
- Best training advice
- Talent prediction
- Improvement plan

Keep response simple and useful for school sports system.
        """.trimIndent()

        GeminiClient.askGemini(prompt) { result ->
            runOnUiThread {
                textView.text = "🤖 GEMINI AI REPORT\n\n$result"
            }
        }
    }
}