package com.example.tic_tac_toss;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder myPopUp = new AlertDialog.Builder(this);
        myPopUp.setTitle("Binevenue");
        myPopUp.setMessage("Le message");
        myPopUp.setPositiveButton("GOT IT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "C'est parti", Toast.LENGTH_SHORT).show();
            }
        });

        myPopUp.show();

    }


}