package com.example.tic_tac_toss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class TossACoinActivity extends AppCompatActivity {

    Button tossACoin;

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toss_a_coin);

        this.tossACoin = findViewById(R.id.btnTossACoin);
        this.layout = findViewById(R.id.page2Layout);

        tossACoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tossActivity = new Intent(getApplicationContext(), TicTacToe1pEasyActivity.class);
                startActivity(tossActivity);
                onPause();
            }
        });

        layout.setOnTouchListener(new OnSwipeTouchListener(TossACoinActivity.this){
            @Override
            public void onSwipeRight(){
                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                startActivity(goPage1);
                finish();
            }
            public void onSwipeLeft(){
                Intent goPage3 = new Intent(getApplicationContext(), CreditsActivity.class);
                startActivity(goPage3);
                finish();
            }
        });

    }
}