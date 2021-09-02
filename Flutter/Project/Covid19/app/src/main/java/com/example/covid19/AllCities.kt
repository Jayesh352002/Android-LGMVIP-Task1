package com.example.covid19

import android.os.Build
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import org.json.JSONException
import java.util.*
import kotlin.collections.ArrayList
class AllCities : AppCompatActivity() {
    companion object{
        const val State_name = ""
    }
    private lateinit var state: String
    private val citydata : ArrayList<Cities> = ArrayList()
    private val city : ArrayList<String> = ArrayList()
    private lateinit var cAdapter: CityAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_cities)
        val recycle = findViewById<RecyclerView>(R.id.recycle)
        val text = findViewById<TextView>(R.id.txt1)
        state = intent.getStringExtra(State_name).toString()
        recycle.layoutManager = GridLayoutManager(this,1)
        text.text=state
        fetch()
        cAdapter = CityAdapter(this)
        recycle.adapter = cAdapter

    }

    fun fetch(){
        val url = "https://data.covid19india.org/state_district_wise.json"
        val jsonObjectRequest = JsonObjectRequest(Request.Method.GET, url, null,
            Response.Listener {
                try{
                    val stateJsonObject = it.getJSONObject(state)
                    val district = stateJsonObject.getJSONObject("districtData")
                    val keys : Iterator<String> = district.keys()
                    while(keys.hasNext()){
                        val cityName = keys.next()
                        if(cityName=="Unknown"||cityName=="Other States"){
                            continue
                        }
                        city.add(cityName)
                        val c = district.getJSONObject(cityName)
                        val city = Cities(
                            c.getInt("active"),
                            c.getInt("confirmed"),
                            c.getInt("deceased"),
                            c.getInt("recovered")
                        )
                        citydata.add(city)
                    }
                    cAdapter.updatedata(citydata,city)
                }
                catch (e : JSONException){
                    e.printStackTrace()
                    Toast.makeText(this , " Something went wrong \n check Internet connection or restart the app",Toast.LENGTH_LONG).show()
                }
            },
            Response.ErrorListener {
                Toast.makeText(this, "Error Occured", Toast.LENGTH_SHORT).show()
            }
        )
        Single.getInstance(this).addToRequestQueue(jsonObjectRequest)
    }
}