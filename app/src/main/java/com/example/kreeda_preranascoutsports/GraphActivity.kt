package com.example.kreeda_preranascoutsports

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet

class GraphActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_graph)

        val chart = findViewById<LineChart>(R.id.lineChart)

        val rahul = arrayListOf(
            Entry(1f,14f),
            Entry(2f,13f),
            Entry(3f,12f),
            Entry(4f,11f)
        )

        val kiran = arrayListOf(
            Entry(1f,15f),
            Entry(2f,14f),
            Entry(3f,13f),
            Entry(4f,12f)
        )

        val manju = arrayListOf(
            Entry(1f,16f),
            Entry(2f,15f),
            Entry(3f,14f),
            Entry(4f,13f)
        )

        val set1 = LineDataSet(rahul, "Rahul")
        set1.color = Color.BLUE
        set1.circleRadius = 5f
        set1.lineWidth = 3f

        val set2 = LineDataSet(kiran, "Kiran")
        set2.color = Color.GREEN
        set2.circleRadius = 5f
        set2.lineWidth = 3f

        val set3 = LineDataSet(manju, "Manju")
        set3.color = Color.RED
        set3.circleRadius = 5f
        set3.lineWidth = 3f

        chart.data = LineData(set1, set2, set3)

        chart.description.text = "Participants Comparison"
        chart.xAxis.position = XAxis.XAxisPosition.BOTTOM
        chart.xAxis.granularity = 1f
        chart.axisRight.isEnabled = false

        chart.setTouchEnabled(true)
        chart.setPinchZoom(true)
        chart.animateX(1500)
        chart.invalidate()
    }
}