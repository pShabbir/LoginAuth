package com.example.sh.loginauth

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var b = intent.extras
        var name = b["name"]
        var pass = b["pass"]

        val a = findViewById(R.id.textView) as TextView

        a.setText("Name is : " +name)
    }
}
