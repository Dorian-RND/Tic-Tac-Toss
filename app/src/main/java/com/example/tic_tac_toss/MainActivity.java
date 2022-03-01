package com.example.tic_tac_toss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private Button play1pEasy;
    private Button play2p;
    private Button play1pMed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.play1pEasy = (Button)findViewById(R.id.btnTicTacToss_1p_Easy);
        this.play1pMed = (Button)findViewById(R.id.btnTicTacToss_1p_Medium);
        this.play2p = (Button)findViewById(R.id.btnTicTacToss_2p);

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

    }


}