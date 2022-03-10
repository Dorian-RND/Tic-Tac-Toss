package com.example.tic_tac_toss;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.*;
import android.net.Uri;
import java.util.Random;

public class TossACoinActivity extends AppCompatActivity {

    Button tossACoin;
    LinearLayout layout;
    VideoView simpleVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toss_a_coin);

        this.tossACoin = findViewById(R.id.btnTossACoin);
        this.layout = findViewById(R.id.page2Layout);

        // initiate a video view
        this.simpleVideoView = (VideoView) findViewById(R.id.testVideoView);


        tossACoin.setOnClickListener(view -> launchToss());

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

    public void launchToss(){

        Random r = new Random();
        int nbRand = r.nextInt(3);

        switch (nbRand) {
            case 0 : this.simpleVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.roll_the_dice));
                break;
            case 1 : this.simpleVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dice_1));
                break;
            default : this.simpleVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dice_2));
                break;
        }
        this.simpleVideoView.start(); // start a video

    }

}