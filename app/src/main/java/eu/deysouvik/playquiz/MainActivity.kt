package eu.deysouvik.playquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var username=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_FULLSCREEN //to make the ui toolbar free.

    }

   fun start_click(view: View){
       if(name_input.text.toString().isEmpty()){
           Toast.makeText( this, "Please Enter Your Name",Toast.LENGTH_SHORT).show()
       }
       else{
           username=name_input.text.toString()
           val intent_next= Intent(this,menu::class.java)
           intent_next.putExtra("username",username)
           startActivity(intent_next)
           finish()
       }
   }
}