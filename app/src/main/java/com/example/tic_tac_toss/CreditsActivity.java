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
                Intent goPage2 = new Intent(getApplicationContext(), TossACoinActivity.class);
                startActivity(goPage2);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
            }
        });
    }
}