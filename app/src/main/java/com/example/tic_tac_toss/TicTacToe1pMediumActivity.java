package com.example.tic_tac_toss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TicTacToe1pMediumActivity extends AppCompatActivity {

      int player1 = 1;
      int npc = 2;
      private int[] grille = new int[9];
      private ImageView[] listeButton;

      @Override
      protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_tic_tac_toe1p_medium);

     }

}