package com.example.flashcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        val flashcardQuestion = findViewById<TextView>(R.id.flashcard_question)
        val mainLayout = findViewById<RelativeLayout>(R.id.main_layout)
        val flashcardAnswer = findViewById<TextView>(R.id.flashcard_answer)
        val flashcardAnswer2 = findViewById<TextView>(R.id.flashcard_answer2)
        val flashcardAnswer3 = findViewById<TextView>(R.id.flashcard_answer3)

        val isShowingAnswers = findViewById<ImageView>(R.id.toggle_choices_visibility)
        val ishow1 = findViewById<ImageView>(R.id.toggle123)



        flashcardQuestion.visibility = View.VISIBLE


        isShowingAnswers.setOnClickListener {
            if (flashcardAnswer.visibility == View.VISIBLE) {
                flashcardAnswer.visibility = View.INVISIBLE
                flashcardAnswer2.visibility = View.INVISIBLE
                flashcardAnswer3.visibility = View.INVISIBLE
                resetTextViewBackgrounds(flashcardAnswer, flashcardAnswer2, flashcardAnswer3)
                isShowingAnswers.visibility = View.INVISIBLE
                ishow1.visibility = View.VISIBLE
            } else {
                flashcardAnswer.visibility = View.VISIBLE
                flashcardAnswer2.visibility = View.VISIBLE
                flashcardAnswer3.visibility = View.VISIBLE
            }
        }
        ishow1.setOnClickListener {
            if (flashcardAnswer.visibility == View.INVISIBLE) {
                isShowingAnswers.visibility = View.VISIBLE
                flashcardAnswer.visibility = View.VISIBLE
                flashcardAnswer2.visibility = View.VISIBLE
                flashcardAnswer3.visibility = View.VISIBLE
                resetTextViewBackgrounds(flashcardAnswer, flashcardAnswer2, flashcardAnswer3)

                isShowingAnswers.visibility = View.VISIBLE
                ishow1.visibility = View.INVISIBLE

            }
            else {
                flashcardAnswer.visibility = View.INVISIBLE
                flashcardAnswer2.visibility = View.INVISIBLE
                flashcardAnswer3.visibility = View.INVISIBLE
            }
        }


        flashcardAnswer.setOnClickListener {
            findViewById<View>(R.id.flashcard_answer).setBackgroundColor(
                getResources().getColor(
                    R.color.Green,
                    null
                )
            )
        }
        flashcardAnswer2.setOnClickListener {
            findViewById<View>(R.id.flashcard_answer2).setBackgroundColor(
                getResources().getColor(
                    R.color.Red,
                    null
                )
            )
            findViewById<View>(R.id.flashcard_answer).setBackgroundColor(
                getResources().getColor(
                    R.color.Green,
                    null
                )
            )
        }
        flashcardAnswer3.setOnClickListener {
            findViewById<View>(R.id.flashcard_answer3).setBackgroundColor(
                getResources().getColor(
                    R.color.Red,
                    null
                )
            )
            findViewById<View>(R.id.flashcard_answer).setBackgroundColor(
                getResources().getColor(
                    R.color.Green,
                    null
                )


            )
        }
        mainLayout.setOnClickListener {
            resetTextViewBackgrounds(flashcardAnswer, flashcardAnswer2, flashcardAnswer3)
        }

    }


    private fun resetTextViewBackgrounds(vararg textViews: TextView) {
        for (textView in textViews) {
            textView.setBackgroundColor(resources.getColor(R.color.Rose))
        }
    }




}

