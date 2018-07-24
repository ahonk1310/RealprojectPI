package com.hamzah.realprojectpi;

/**
 * Created by Hamzah on 24/07/2017.
 */

import android.content.Intent;
        import android.app.Activity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;


public class Highscore extends Activity {

    private QuestionBank mQuestionLibrary = new QuestionBank();
    private TextView mScoreView;   // view for current total score
    private int mScore = 0;  // current total score

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        setContentView(R.layout.activity_highscore);
        TextView txtScore = (TextView) findViewById(R.id.score_text);
        // receive the score from last activity by Intent
        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        // display current score
        txtScore.setText("Nilai kamu kali ini: " + score*5 + "/100");

    }


    public void onClick(View view)
    {
        Intent intent = new Intent(Highscore.this, QuizActivity.class);
        startActivity(intent);
    }
    public void onClick11(View view)
    {
        Intent intent = new Intent(Highscore.this, MainActivity.class);
        startActivity(intent);

    }
}
