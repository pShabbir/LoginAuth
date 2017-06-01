package com.example.sh.loginauth

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit  var name : EditText
    lateinit var pass   : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       name = findViewById(R.id.user) as EditText
         pass = findViewById(R.id.pass) as EditText


    }

    fun  btClick(view : View){
        var s1 = name.text
        var s2 = name.text

        var i = Intent(this,Main2Activity :: class.java);
        i.putExtra("name",s1)   
        i.putExtra("pass",s2)
        startActivity(i)
    }
}
