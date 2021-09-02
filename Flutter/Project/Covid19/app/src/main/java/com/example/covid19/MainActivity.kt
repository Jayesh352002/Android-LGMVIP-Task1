package com.example.covid19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    public var state_name : String? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val state = resources.getStringArray(R.array.State)
        val spinner = findViewById<Spinner>(R.id.spin_state)
        if(spinner != null){
            val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,state)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(p0: AdapterView<*>?, view: View, p2: Int, p3: Long) {
                    state_name = state[p2]
                }

                override fun onNothingSelected(p0: AdapterView<*>?){
                }

            }
        }
    }

    fun Go(view: View) {
        if(state_name=="Select" ){
            Toast.makeText(this,"Select Your State",Toast.LENGTH_LONG).show()
        }
        else{
            val intent = Intent(this , AllCities::class.java)
            intent.putExtra(AllCities.State_name,state_name)
            startActivity(intent)
        }
    }
}