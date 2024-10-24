package lat.pam.utsproject

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ConfirmationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_confirmation)

        val foodName = intent.getStringExtra("foodName")
        val servings = intent.getStringExtra("servings")
        val name = intent.getStringExtra("name")
        val notes = intent.getStringExtra("notes")

        // Menampilkan data yang diterima
        val confirmationTextView: TextView = findViewById(R.id.confirmationTextView)
        confirmationTextView.text = "Order placed for $servings servings of $foodName by $name.\nNotes: $notes"
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}