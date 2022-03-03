package com.example.tic_tac_toss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.*;
import android.net.Uri;

public class TossACoinActivity extends AppCompatActivity {

    Button tossACoin;

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toss_a_coin);

        this.tossACoin = findViewById(R.id.btnTossACoin);
        this.layout = findViewById(R.id.page2Layout);

        // initiate a video view
        VideoView simpleVideoView = (VideoView) findViewById(R.id.testVideoView);
        simpleVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.roll_the_dice));

        tossACoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simpleVideoView.start(); // start a video
            }
        });

        layout.setOnTouchListener(new OnSwipeTouchListener(TossACoinActivity.this){
            @Override
            public void onSwipeRight(){
                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                startActivity(goPage1);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
            }
            public void onSwipeLeft(){
                Intent goPage3 = new Intent(getApplicationContext(), CreditsActivity.class);
                startActivity(goPage3);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
            }
        });

    }

}