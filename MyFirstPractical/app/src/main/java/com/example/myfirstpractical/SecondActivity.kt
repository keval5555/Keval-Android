package com.example.myfirstpractical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {


    val tvName : TextView
    get() = findViewById(R.id.tv_name)

    val tvEmail : TextView
    get() = findViewById(R.id.tv_email)

    val tvAge : TextView
    get() = findViewById(R.id.tv_age)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


      /*  val name = intent.getStringExtra("NAME")
        val email = intent.getStringExtra("EMAIL")
        val age = intent.getIntExtra("AGE" , 0)


        tvName.text = "NAME : $name"
        tvEmail.text = "EMAIL : $email"
        tvAge.text = "AGE : $age"*/


        var user = intent.getParcelableExtra<User>("USER")

        user?.let {

            tvName.text = "NAME : ${it.name}"
            tvEmail.text = "EMAIL : ${it.email}"
            tvAge.text = "AGE : ${it.age}"
        }






    }
}