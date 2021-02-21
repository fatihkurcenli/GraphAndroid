package com.autumnsun.graphexample

import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.autumnsun.graphexample.databinding.ActivityMainBinding
import com.github.mikephil.charting.animation.Easing
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setLineChartData()


    }

    fun setLineChartData() {
        var xavier = ArrayList<String>()
        xavier.add("11.00 AM")
        xavier.add("12.00 AM")
        xavier.add("1.00 PM")
        xavier.add("2.00 PM")
        xavier.add("3.00 PM")

        val lineentry = ArrayList<Entry>()
        lineentry.add(Entry(20f, 0.0F))
        lineentry.add(Entry(30f, 3.0F))
        lineentry.add(Entry(40f, 2.0F))
        lineentry.add(Entry(50f, 1.0F))
        lineentry.add(Entry(60f, 4.0F))

        val lineyazisi = LineDataSet(lineentry, "First")
        lineyazisi.color = resources.getColor(R.color.purple_200)
        val data = LineData(lineyazisi)
        binding.getTheGraph.data = data
    }

   /* fun setLineChartData(){
        val entries = ArrayList<Entry>()

//Part2
        entries.add(Entry(1f, 10f))
        entries.add(Entry(2f, 2f))
        entries.add(Entry(3f, 7f))
        entries.add(Entry(4f, 20f))
        entries.add(Entry(5f, 16f))

//Part3
        val vl = LineDataSet(entries, "My Type")

//Part4
        vl.setDrawValues(false)
        vl.setDrawFilled(true)
        vl.lineWidth = 3f
        vl.fillColor = R.color.purple_200
        vl.fillAlpha = R.color.purple_700

//Part5
        binding.getTheGraph.xAxis.labelRotationAngle = 0f

//Part6
        binding.getTheGraph.data = LineData(vl)

//Part7
        binding.getTheGraph.axisRight.isEnabled = false
        //binding.linechart.xAxis.axisMaximum = j+0.1f

//Part8
        binding.getTheGraph.setTouchEnabled(true)
        binding.getTheGraph.setPinchZoom(true)

//Part9
        binding.getTheGraph.description.text = "Days"
        binding.getTheGraph.setNoDataText("No forex yet!")

//Part10
        binding.getTheGraph.animateX(1800, Easing.EaseInExpo)

//Part11
        /* val markerView = CustomMarker(this@ShowForexActivity, R.layout.marker_view)
         lineChart.marker = markerView */
    } */

   


}