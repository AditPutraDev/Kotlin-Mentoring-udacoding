package id.mentoring.kotlin2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import id.mentoring.kotlin2.ui.CalculatorActivity
import id.mentoring.kotlin2.ui.RecyclerViewActivity
import id.mentoring.kotlin2.ui.LoginActivity

class   MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnFormLogin: Button = findViewById(R.id.btnFormLogin)
        val btnCalculator: Button = findViewById(R.id.btnCalculator)
        val btnRv: Button = findViewById(R.id.btnRV)

        btnFormLogin.setOnClickListener(this)
        btnCalculator.setOnClickListener(this)
        btnRv.setOnClickListener(this)
    }
    override fun onClick(v:View){
        when (v.id){
            R.id.btnFormLogin -> {
                val moveIntent = Intent(this@MainActivity, LoginActivity::class.java)
                startActivity(moveIntent);
            }
            R.id.btnCalculator -> {
                val moveIntent = Intent(this@MainActivity, CalculatorActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btnRV -> {
                val moveIntent = Intent(this@MainActivity, RecyclerViewActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}