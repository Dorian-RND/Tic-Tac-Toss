package com.example.tic_tac_toss;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class TicTacToeActivity extends AppCompatActivity {

    private Button play1pEasy;
    private Button play2p;
    private Button play1pMed;

    LinearLayout layout;

    private TicTacToeActivity activity;


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.play1pEasy = findViewById(R.id.btnTicTacToss_1p_Easy);
        this.play1pMed = findViewById(R.id.btnTicTacToss_1p_Medium);
        this.play2p = findViewById(R.id.btnTicTacToss_2p);
        this.layout = findViewById(R.id.page1Layout);
        this.activity = this;

        play1pEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent player1Activity = new Intent(getApplicationContext(), TicTacToe1pEasyActivity.class);
                startActivity(player1Activity);
                onPause();
            }
        });

        play1pMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent player1Activity = new Intent(getApplicationContext(), TicTacToe1pMediumActivity.class);
                startActivity(player1Activity);
                onPause();
            }
        });

        play2p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent player2Activity = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                startActivity(player2Activity);
                onPause();
            }
        });

        layout.setOnTouchListener(new OnSwipeTouchListener(TicTacToeActivity.this){
            @Override
            public void onSwipeLeft(){
                Intent goPage2 = new Intent(getApplicationContext(), TossACoinActivity.class);
                startActivity(goPage2);
                finish();
            }
        });
    }
}