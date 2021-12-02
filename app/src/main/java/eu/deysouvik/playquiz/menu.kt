package eu.deysouvik.playquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class menu : AppCompatActivity() {
    var username=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        username=intent.getStringExtra("username").toString()
    }

    fun topic_1(view: View){
       val intent_to_quizQuestion=Intent(this,Quiz_Question::class.java)
        intent_to_quizQuestion.putExtra("username",username)
        intent_to_quizQuestion.putExtra("topic",1)
        startActivity(intent_to_quizQuestion)
        finish()
    }

    fun topic_2(view: View){
        val intent_to_quizQuestion=Intent(this,Quiz_Question::class.java)
        intent_to_quizQuestion.putExtra("username",username)
        intent_to_quizQuestion.putExtra("topic",2)
        startActivity(intent_to_quizQuestion)
        finish()
    }

    fun topic_3(view: View){
        val intent_to_quizQuestion=Intent(this,Quiz_Question::class.java)
        intent_to_quizQuestion.putExtra("username",username)
        intent_to_quizQuestion.putExtra("topic",3)
        startActivity(intent_to_quizQuestion)
        finish()
    }

    fun topic_4(view: View){
        val intent_to_quizQuestion=Intent(this,Quiz_Question::class.java)
        intent_to_quizQuestion.putExtra("username",username)
        intent_to_quizQuestion.putExtra("topic",4)
        startActivity(intent_to_quizQuestion)
        finish()
    }


}