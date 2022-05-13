package com.example.iot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val buttonClick1 = findViewById<TextView>(R.id.signuplink)
        buttonClick1.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }
        val buttonClick2 = findViewById<TextView>(R.id.signinbtn)
        buttonClick2.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}