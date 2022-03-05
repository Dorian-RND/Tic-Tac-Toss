package com.example.tic_tac_toss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TicTacToe1pEasyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe1p_easy);

        ImageView img1 = findViewById(R.id.img_btn_1);

        /*img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img1.setImageResource(R.drawable.greentest);
            }
        });*/
    }
}