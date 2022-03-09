package com.example.tic_tac_toss;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TicTacToe2pActivity extends AppCompatActivity {

    int player1 = 1;
    int player2 = 2;
    int tour=1;
    protected int cpt = 0;
    protected boolean win = false;
    private TicTacToe2pActivity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe2p);

        CaseTicTacToe case1 = new CaseTicTacToe();
        CaseTicTacToe case2 = new CaseTicTacToe();
        CaseTicTacToe case3 = new CaseTicTacToe();
        CaseTicTacToe case4 = new CaseTicTacToe();
        CaseTicTacToe case5 = new CaseTicTacToe();
        CaseTicTacToe case6 = new CaseTicTacToe();
        CaseTicTacToe case7 = new CaseTicTacToe();
        CaseTicTacToe case8 = new CaseTicTacToe();
        CaseTicTacToe case9 = new CaseTicTacToe();

        ImageView btn1 = findViewById(R.id.img_btn_1);
        ImageView btn2 = findViewById(R.id.img_btn_2);
        ImageView btn3 = findViewById(R.id.img_btn_3);
        ImageView btn4 = findViewById(R.id.img_btn_4);
        ImageView btn5 = findViewById(R.id.img_btn_5);
        ImageView btn6 = findViewById(R.id.img_btn_6);
        ImageView btn7 = findViewById(R.id.img_btn_7);
        ImageView btn8 = findViewById(R.id.img_btn_8);
        ImageView btn9 = findViewById(R.id.img_btn_9);

        CaseTicTacToe[] case_tic_tac_toe = {case1, case2, case3, case4, case5, case6, case7, case8, case9};
        ImageView[] btn = {btn1, btn2, btn3, btn4, btn5, btn5, btn6, btn7, btn8, btn9};

        this.activity = this;



        btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    cpt++;
                    if(case1.isEmpty() && tour == 1){
                        btn1.setImageResource(R.drawable.cross);
                        case1.setNotEmpty();
                        case1.setValeur(player1);
                        tour = 2;
                    }
                    else if (case1.isEmpty() && tour == 2){
                        btn1.setImageResource(R.drawable.circle);
                        case1.setNotEmpty();
                        case1.setValeur(player2);
                        tour = 1;
                    }
                    if (case1.getValeur() == player1 && case2.getValeur() == player1 && case3.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case1.getValeur() == player1 && case4.getValeur() == player1 && case7.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case1.getValeur() == player1 && case5.getValeur() == player1 && case9.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case1.getValeur() == player2 && case2.getValeur() == player2 && case3.getValeur() == player2){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 2 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case1.getValeur() == player2 && case4.getValeur() == player2 && case7.getValeur() == player2){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 2 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case1.getValeur() == player2 && case5.getValeur() == player2 && case9.getValeur() == player2){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 2 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if(cpt == 9 && win==false){
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Aucun joueur n'a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    cpt++;
                    if(case2.isEmpty() && tour == 1){
                        btn2.setImageResource(R.drawable.cross);
                        case2.setNotEmpty();
                        case2.setValeur(player1);
                        tour = 2;
                    }
                    else if (case2.isEmpty() && tour == 2){
                        btn2.setImageResource(R.drawable.circle);
                        case2.setNotEmpty();
                        case2.setValeur(player2);
                        tour = 1;
                    }
                    if (case1.getValeur() == player1 && case2.getValeur() == player1 && case3.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case2.getValeur() == player1 && case5.getValeur() == player1 && case8.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case1.getValeur() == player1 && case2.getValeur() == player1 && case3.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case2.getValeur() == player2 && case5.getValeur() == player2 && case8.getValeur() == player2){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 2 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if(cpt == 9 && win==false){
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Aucun joueur n'a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                }
            });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    cpt++;
                    if(case3.isEmpty() && tour == 1){
                        btn3.setImageResource(R.drawable.cross);
                        case3.setNotEmpty();
                        case3.setValeur(player1);
                        tour = 2;
                    }
                    else if (case3.isEmpty() && tour == 2){
                        btn3.setImageResource(R.drawable.circle);
                        case3.setNotEmpty();
                        case3.setValeur(player2);
                        tour = 1;
                    }
                    if (case1.getValeur() == player1 && case2.getValeur() == player1 && case3.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case3.getValeur() == player1 && case5.getValeur() == player1 && case7.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case3.getValeur() == player1 && case6.getValeur() == player1 && case9.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case1.getValeur() == player2 && case2.getValeur() == player2 && case3.getValeur() == player2){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 2 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case3.getValeur() == player2 && case5.getValeur() == player2 && case7.getValeur() == player2){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 2 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case3.getValeur() == player2 && case6.getValeur() == player2 && case9.getValeur() == player2){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 2 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if(cpt == 9 && win==false){
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Aucun joueur n'a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                }
            });

            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    cpt++;
                    if(case4.isEmpty() && tour == 1){
                        btn4.setImageResource(R.drawable.cross);
                        case4.setNotEmpty();
                        case4.setValeur(player1);
                        tour = 2;
                    }
                    else if (case4.isEmpty() && tour == 2){
                        btn4.setImageResource(R.drawable.circle);
                        case4.setNotEmpty();
                        case4.setValeur(player2);
                        tour = 1;
                    }
                    if (case4.getValeur() == player1 && case5.getValeur() == player1 && case6.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case4.getValeur() == player1 && case1.getValeur() == player1 && case7.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case4.getValeur() == player2 && case5.getValeur() == player2 && case6.getValeur() == player2){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 2 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case4.getValeur() == player2 && case1.getValeur() == player2 && case7.getValeur() == player2){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 2 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if(cpt == 9 && win==false){
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Aucun joueur n'a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                }
            });

            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    cpt++;
                    if(case5.isEmpty() && tour == 1){
                        btn5.setImageResource(R.drawable.cross);
                        case5.setNotEmpty();
                        case5.setValeur(player1);
                        tour = 2;
                    }
                    else if (case5.isEmpty() && tour == 2){
                        btn5.setImageResource(R.drawable.circle);
                        case5.setNotEmpty();
                        case5.setValeur(player2);
                        tour = 1;
                    }
                    if (case4.getValeur() == player1 && case5.getValeur() == player1 && case6.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case5.getValeur() == player1 && case2.getValeur() == player1 && case8.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case4.getValeur() == player2 && case5.getValeur() == player2 && case6.getValeur() == player2){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 2 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case5.getValeur() == player2 && case2.getValeur() == player2 && case8.getValeur() == player2){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 2 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if(cpt == 9 && win==false){
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Aucun joueur n'a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                }
            });

            btn6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    cpt++;
                    if(case6.isEmpty() && tour == 1){
                        btn6.setImageResource(R.drawable.cross);
                        case6.setNotEmpty();
                        case6.setValeur(player1);
                        tour = 2;
                    }
                    else if (case6.isEmpty() && tour == 2){
                        btn6.setImageResource(R.drawable.circle);
                        case6.setNotEmpty();
                        case6.setValeur(player2);
                        tour = 1;
                    }
                    if (case4.getValeur() == player1 && case5.getValeur() == player1 && case6.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case6.getValeur() == player1 && case3.getValeur() == player1 && case9.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case4.getValeur() == player2 && case5.getValeur() == player2 && case6.getValeur() == player2){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case6.getValeur() == player2 && case3.getValeur() == player2 && case9.getValeur() == player2){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if(cpt == 9 && win==false){
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Aucun joueur n'a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                }
            });

            btn7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    cpt++;
                    if(case7.isEmpty() && tour == 1){
                        btn7.setImageResource(R.drawable.cross);
                        case7.setNotEmpty();
                        case7.setValeur(player1);
                        tour = 2;
                    }
                    else if (case7.isEmpty() && tour == 2){
                        btn7.setImageResource(R.drawable.circle);
                        case7.setNotEmpty();
                        case7.setValeur(player2);
                        tour = 1;
                    }
                    if (case7.getValeur() == player1 && case8.getValeur() == player1 && case9.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case7.getValeur() == player1 && case4.getValeur() == player1 && case1.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case7.getValeur() == player1 && case5.getValeur() == player1 && case3.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case7.getValeur() == player2 && case8.getValeur() == player2 && case9.getValeur() == player2){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 2 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case7.getValeur() == player2 && case4.getValeur() == player2 && case1.getValeur() == player2){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 2 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case7.getValeur() == player2 && case5.getValeur() == player2 && case3.getValeur() == player2){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 2 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if(cpt == 9 && win==false){
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Aucun joueur n'a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                }
            });

            btn8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    cpt++;
                    if(case8.isEmpty() && tour == 1){
                        btn8.setImageResource(R.drawable.cross);
                        case8.setNotEmpty();
                        case8.setValeur(player1);
                        tour = 2;
                    }
                    else if (case8.isEmpty() && tour == 2){
                        btn8.setImageResource(R.drawable.circle);
                        case8.setNotEmpty();
                        case8.setValeur(player2);
                        tour = 1;
                    }
                    if (case7.getValeur() == player1 && case8.getValeur() == player1 && case9.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case8.getValeur() == player1 && case5.getValeur() == player1 && case2.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case7.getValeur() == player2 && case8.getValeur() == player2 && case9.getValeur() == player2){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 2 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case8.getValeur() == player2 && case5.getValeur() == player2 && case2.getValeur() == player2){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 2 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if(cpt == 9 && win==false){
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Aucun joueur n'a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                }
            });

            btn9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    cpt++;
                    if(case9.isEmpty() && tour == 1){
                        btn9.setImageResource(R.drawable.cross);
                        case9.setNotEmpty();
                        case9.setValeur(player1);
                        tour = 2;
                    }
                    else if (case9.isEmpty() && tour == 2){
                        btn9.setImageResource(R.drawable.circle);
                        case9.setNotEmpty();
                        case9.setValeur(player2);
                        tour = 1;
                    }
                    if (case7.getValeur() == player1 && case8.getValeur() == player1 && case9.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case9.getValeur() == player1 && case6.getValeur() == player1 && case3.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case9.getValeur() == player1 && case5.getValeur() == player1 && case1.getValeur() == player1){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 1 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case7.getValeur() == player2 && case8.getValeur() == player2 && case9.getValeur() == player2){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 2 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case9.getValeur() == player2 && case6.getValeur() == player2 && case3.getValeur() == player2){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 2 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if (case9.getValeur() == player2 && case5.getValeur() == player2 && case1.getValeur() == player2){
                        win = true;
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Player 2 a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                    if(cpt == 9 && win==false){
                        AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                        myPopup.setMessage("Aucun joueur n'a gagné");
                        myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToeActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.setNegativeButton("Rejouer", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){
                                Intent goPage1 = new Intent(getApplicationContext(), TicTacToe2pActivity.class);
                                startActivity(goPage1); finish();                           }
                        });
                        myPopup.show();
                    }
                }
            });
    }
}