package id.mentoring.kotlin2.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import id.mentoring.kotlin2.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener{
            //object
            val username = edtUsername.text.toString()
            val password = edtPassword.text.toString()
            //logic
            if (username.isEmpty()){
                edtUsername.setError("fill in your username")
            } else if (password.isEmpty()){
                edtPassword.setError("fill in your password")
            } else {
                if (username.equals("aditya") && (password.equals("12345"))){
                    startActivity(Intent(this, RecyclerViewActivity::class.java))
                } else {
                    Toast.makeText(this, "Your username or password not valid",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}