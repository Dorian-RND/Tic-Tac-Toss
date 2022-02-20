package com.example.tic_tac_toss;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private Button play1p;
    private Button play2p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder myPopUp = new AlertDialog.Builder(this);
        myPopUp.setTitle("Bienvenue");
        myPopUp.setMessage("Le message");
        myPopUp.setPositiveButton("GOT IT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "C'est parti", Toast.LENGTH_SHORT).show();
            }
        });

        myPopUp.show();

        this.play1p = (Button)findViewById(R.id.button1p);
        this.play2p = (Button)findViewById(R.id.button2p);

        play1p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent player1Activity = new Intent(getApplicationContext(), TicTacToe1pActivity.class);
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