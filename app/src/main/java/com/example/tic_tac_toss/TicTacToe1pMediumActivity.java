package com.example.tic_tac_toss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TicTacToe1pMediumActivity extends AppCompatActivity {

      int player1 = 1;
      int npc = 2;
      private int[][] grille;
      private ImageView[][] listeButton;

      protected CaseTicTacToe case1;
      protected CaseTicTacToe case2;
      protected CaseTicTacToe case3;
      protected CaseTicTacToe case4;
      protected CaseTicTacToe case5;
      protected CaseTicTacToe case6;
      protected CaseTicTacToe case7;
      protected CaseTicTacToe case8;
      protected CaseTicTacToe case9;

      CaseTicTacToe[][] listeCase = {{case1,case2,case3},{case4,case5,case6},{case7,case8,case9}};

      @Override
      protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_tic_tac_toe1p_medium);

           int i,j;
           for (i=0; i<3; i++){
               for (j=0; j<3; j++){
                   listeCase[i][j] = new CaseTicTacToe();
               }
           }

     }

}