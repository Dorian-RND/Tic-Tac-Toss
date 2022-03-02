package com.example.tic_tac_toss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity {

    Button tossACoin;

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        this.tossACoin = findViewById(R.id.btnToss);
        this.layout = findViewById(R.id.page2Layout);

        tossACoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tossActivity = new Intent(getApplicationContext(), TicTacToe1pEasyActivity.class);
                startActivity(tossActivity);
                onPause();
            }
        });

        layout.setOnTouchListener(new OnSwipeTouchListener(MainActivity2.this){
            @Override
            public void onSwipeRight(){
                Intent goPage1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(goPage1);
                onStop();
            }
        });

    }
}