package io.github.thiminhnhut.singleton

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            val username = edtUsername.text.toString()
            SingletonSession.instance.setUsername(username)

            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
        }
    }
}
