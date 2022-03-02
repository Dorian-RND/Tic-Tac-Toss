package com.example.tic_tac_toss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class CreditsActivity extends AppCompatActivity {

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        this.layout = findViewById(R.id.page3Layout);

        layout.setOnTouchListener(new OnSwipeTouchListener(CreditsActivity.this){
            @Override
            public void onSwipeRight(){
                Intent goPage2 = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(goPage2);
                finish();
            }
        });
    }
}