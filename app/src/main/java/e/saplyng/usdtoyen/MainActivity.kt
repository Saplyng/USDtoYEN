package e.saplyng.usdtoyen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usdTOyen = 114.01
        val yenTOusd = 0.0088


        idButton.setOnClickListener {
            if (idNumber.text.isBlank() == false) {
                if (idSwitch.isChecked() == false) {
                    val format = NumberFormat.getCurrencyInstance(Locale.JAPAN)
                    val amount = (idNumber.text).toString().toDouble()
                    if (amount <= 10000) {
                        val total = amount * usdTOyen
                        idTextView.text = format.format(total).toString()
                    } else {
                        Toast.makeText(this, "Choose a number lower than $10,000", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    val format = NumberFormat.getCurrencyInstance(Locale.US)
                    val amount = (idNumber.text).toString().toDouble()
                    if (amount <= 1140075) {
                        val total = amount * yenTOusd
                        idTextView.text = format.format(total).toString()
                    } else {
                        Toast.makeText(this, "Choose a number lower than ¥1,140,075", Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                Toast.makeText(this, "please enter a number", Toast.LENGTH_SHORT).show()
            }
        }












    }
}
