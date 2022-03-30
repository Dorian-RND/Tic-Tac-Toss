package com.example.tic_tac_toss;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.*;
import android.net.Uri;
import java.util.Random;

public class TossACoinActivity extends AppCompatActivity {

    private Button tossACoin;
    LinearLayout layout;
    private VideoView simpleVideoView;
    private Activity thisActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toss_a_coin);

        this.tossACoin = findViewById(R.id.btnTossACoin);
        this.layout = findViewById(R.id.page2Layout);
        thisActivity = this;

        // initiate a video view
        this.simpleVideoView = findViewById(R.id.testVideoView);

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
        int nbRand = r.nextInt(4);

        switch (nbRand) {
            case 0 : this.simpleVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.head_1));
                break;
            case 1 : this.simpleVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.head_2));
                break;
            case 2 : this.simpleVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.tails_1));
                break;
            default : this.simpleVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.tails_2));
                break;
        }
        this.simpleVideoView.start(); // start a video

        simpleVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                AlertDialog.Builder myPopup = new AlertDialog.Builder(thisActivity, R.style.AlertDialogStyle);
                if (nbRand == 0 || nbRand == 1){
                    myPopup.setTitle(getString(R.string.toss_result_heads));
                }
                else {
                    myPopup.setTitle(getString(R.string.toss_result_tails));

                }
                myPopup.setPositiveButton(getString(R.string.btnPopUp), (dialogInterface, i) -> {});
                myPopup.show();
            }
        });
    }

}