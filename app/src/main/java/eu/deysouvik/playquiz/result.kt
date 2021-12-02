package eu.deysouvik.playquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class result : AppCompatActivity() {

    var username=""
    var score=0
    var fullScore=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

       username=intent.getStringExtra("username").toString()    //getting thr username form Quiz_question activity
        score=intent.getIntExtra("score",0)
       fullScore=intent.getIntExtra("fullScore",0)
        user_name.text=username

        tv_score.text="$score"+"/"+"$fullScore"
    }

    fun play_again_btn(view: View){

        val intent_to_mainactivity=Intent(this,MainActivity::class.java)
        startActivity(intent_to_mainactivity)
        finish()
    }
}