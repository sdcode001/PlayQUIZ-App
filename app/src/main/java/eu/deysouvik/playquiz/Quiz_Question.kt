package eu.deysouvik.playquiz

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_question.*
import java.time.temporal.TemporalAdjusters.next
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random



class Quiz_Question : AppCompatActivity() {
    var username=""
    var Questions:ArrayList<Question_structure>?=null
    var position=0
    var indicator=0
    var question_no=1
    var question:Question_structure?=null
    var selected_option=0
    var score=0
    var submit=0
    var topic=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        username=intent.getStringExtra("username").toString()     //getting thr username form  mainactivity
        topic=intent.getIntExtra("topic",0)

        when(topic){
            1-> Questions = datasrc.getdata()
            2-> Questions = sportsdata.getdata()
            3-> Questions = historydata.getdata()
            4-> Questions = movieQuestion.getdata()
        }

        position=Random.nextInt(1,45)   //45 questions are here

        question= Questions!![position-1]
        tv_question.text=question!!.Question
        image.setImageResource(question!!.image)
        progress_bar.setProgress(question_no)
        tv_progress.text="$question_no"+"/"+progress_bar.max
        option1.text=question!!.option1
        option2.text=question!!.option2
        option3.text=question!!.option3
        option4.text=question!!.option4

    }

    fun default_option(){
        var options=ArrayList<TextView>()
        options.add(option1)
        options.add(option2)
        options.add(option3)
        options.add(option4)
        for(option in options){
            option.setTextColor(Color.parseColor("#FFFFFFFF"))
            option.background=ContextCompat.getDrawable(this,R.drawable.option_style) }
     }

    fun option1_click(view: View){
        if(submit==0){
        default_option()
        option1.setTextColor(Color.parseColor("#fc7703"))
        option1.background=ContextCompat.getDrawable(this,R.drawable.selected_option)
        selected_option=1}
    }
    fun option2_click(view: View){
        if(submit==0){
        default_option()
        option2.setTextColor(Color.parseColor("#fc7703"))
        option2.background=ContextCompat.getDrawable(this,R.drawable.selected_option)
        selected_option=2}
    }
    fun option3_click(view: View){
        if(submit==0){
        default_option()
        option3.setTextColor(Color.parseColor("#fc7703"))
        option3.background=ContextCompat.getDrawable(this,R.drawable.selected_option)
        selected_option=3}
    }
    fun option4_click(view: View){
        if(submit==0){
        default_option()
        option4.setTextColor(Color.parseColor("#fc7703"))
        option4.background=ContextCompat.getDrawable(this,R.drawable.selected_option)
        selected_option=4}
    }



    fun submit_click(view: View){
         submit=1
        if(selected_option==question!!.correctAns){
            score++
            when(selected_option){
                1 -> {
                    option1.background = ContextCompat.getDrawable(this, R.drawable.correct_option)
                    option1.setTextColor(Color.parseColor("#40ff00"))
                }
                2 -> {
                    option2.background = ContextCompat.getDrawable(this, R.drawable.correct_option)
                    option2.setTextColor(Color.parseColor("#40ff00"))
                }
                3 -> {
                option3.background = ContextCompat.getDrawable(this, R.drawable.correct_option)
                option3.setTextColor(Color.parseColor("#40ff00"))
            }
                4 -> {
                option4.background = ContextCompat.getDrawable(this, R.drawable.correct_option)
                option4.setTextColor(Color.parseColor("#40ff00"))
            }
            }
        }
        else{
            when(selected_option){
                1 -> {
                    option1.background = ContextCompat.getDrawable(this, R.drawable.wrong_option)
                    option1.setTextColor(Color.parseColor("#ff0000"))
                }
                2 -> {
                    option2.background = ContextCompat.getDrawable(this, R.drawable.wrong_option)
                    option2.setTextColor(Color.parseColor("#ff0000"))
                }
                3 -> {
                    option3.background = ContextCompat.getDrawable(this, R.drawable.wrong_option)
                    option3.setTextColor(Color.parseColor("#ff0000"))
                }
                4 -> {
                    option4.background = ContextCompat.getDrawable(this, R.drawable.wrong_option)
                    option4.setTextColor(Color.parseColor("#ff0000"))
                }
            }
            when(question!!.correctAns){
                1 -> {
                    option1.background = ContextCompat.getDrawable(this, R.drawable.correct_option)
                    option1.setTextColor(Color.parseColor("#40ff00"))
                }
                2 -> {
                    option2.background = ContextCompat.getDrawable(this, R.drawable.correct_option)
                    option2.setTextColor(Color.parseColor("#40ff00"))
                }
                3 -> {
                    option3.background = ContextCompat.getDrawable(this, R.drawable.correct_option)
                    option3.setTextColor(Color.parseColor("#40ff00"))
                }
                4 -> {
                    option4.background = ContextCompat.getDrawable(this, R.drawable.correct_option)
                    option4.setTextColor(Color.parseColor("#40ff00"))
                }
            }


        }

    }


    fun next_click(view:View){
        position=Random.nextInt(1,45)   //45 questions are here
        question_no++
        indicator++
        submit=0
        if(indicator==10){     //only 10 question will show out of 45

            val intent_to_result=Intent(this,result::class.java)
            intent_to_result.putExtra("username",username)
            intent_to_result.putExtra("score",score)
            intent_to_result.putExtra("fullScore",10)
            startActivity(intent_to_result)
            finish()
        }
        else{
            question=Questions!![position-1]

            tv_question.text=question!!.Question
            image.setImageResource(question!!.image)
            progress_bar.setProgress(question_no)
            tv_progress.text="$question_no"+"/"+progress_bar.max
            option1.text=question!!.option1
            option2.text=question!!.option2
            option3.text=question!!.option3
            option4.text=question!!.option4

            default_option()
        }
    }
}