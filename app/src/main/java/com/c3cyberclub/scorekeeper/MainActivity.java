package com.c3cyberclub.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String LOG_TAG=MainActivity.class.getSimpleName();

    Button plus_six_a;
    Button plus_six_b;

    Button plus_three_a;
    Button plus_three_b;

    Button plus_one_a;
    Button plus_one_b;

    Button plus_two_a;
    Button plus_two_b;

    Button plus_two_a2;
    Button plus_two_b2;

    Button reset;

    TextView score_A;
    TextView score_B;

    private int scoreA;
    private int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG,"on Create Activity");
        scoreA = 0;
        scoreB = 0;

        plus_six_a = (Button) this.findViewById(R.id.plus_six_a);
        plus_six_b = (Button) this.findViewById(R.id.plus_six_b);

        plus_three_a = (Button) this.findViewById(R.id.plus_three_a);
        plus_three_b = (Button) this.findViewById(R.id.plus_three_b);

        plus_one_a = (Button) this.findViewById(R.id.plus_one_a);
        plus_one_b = (Button) this.findViewById(R.id.plus_one_b);

        plus_two_a = (Button) this.findViewById(R.id.plus_two_a);
        plus_two_b = (Button) this.findViewById(R.id.plus_two_b);

        plus_two_a2 = (Button) this.findViewById(R.id.plus_two_a2);
        plus_two_b2 = (Button) this.findViewById(R.id.plus_two_b2);

        reset = (Button) this.findViewById(R.id.reset);

        score_A = (TextView) this.findViewById(R.id.team_a_score);
        score_B = (TextView) this.findViewById(R.id.team_b_score);

        initiateButtonClickListeners();
    }

    private void initiateButtonClickListeners() {
        plus_six_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA += 6;
                score_A.setText(String.valueOf(scoreA));
            }
        });

        plus_six_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB += 6;
                score_B.setText(String.valueOf(scoreB));
            }
        });

        plus_three_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA += 3;
                score_A.setText(String.valueOf(scoreA));
            }
        });

        plus_three_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB += 3;
                score_B.setText(String.valueOf(scoreB));
            }
        });

        plus_one_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA += 1;
                score_A.setText(String.valueOf(scoreA));
            }
        });

        plus_one_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB += 1;
                score_B.setText(String.valueOf(scoreB));
            }
        });

        plus_two_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA += 2;
                score_A.setText(String.valueOf(scoreA));
            }
        });

        plus_two_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB += 2;
                score_B.setText(String.valueOf(scoreB));
            }
        });

        plus_two_a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA += 2;
                score_A.setText(String.valueOf(scoreA));
            }
        });

        plus_two_b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB += 2;
                score_B.setText(String.valueOf(scoreB));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA = 0;
                score_A.setText(String.valueOf(scoreA));
                scoreB = 0;
                score_B.setText(String.valueOf(scoreB));
            }
        });

    }
}
