package com.example.tic_tac_toss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Arrays;


public class TicTacToe1pEasyActivity extends AppCompatActivity {

    int player1 = 1;
    int npc = 2;
    private int[] grille = new int[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe1p_easy);

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

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (case1.isEmpty()){
                    btn1.setImageResource(R.drawable.cross);
                    case1.setNotEmpty();
                    case1.setValeur(player1);
                }
                else {
                    if (case1.getValeur() == player1) {
                        btn1.setImageResource(R.drawable.cross);
                        case1.setValeur(npc);
                    }
                    else {
                        btn1.setImageResource(R.drawable.circle);
                        case1.setValeur(player1);
                    }
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (case2.isEmpty()){
                    btn2.setImageResource(R.drawable.cross);
                    case2.setNotEmpty();
                    case2.setValeur(player1);
                }
                else {
                    if (case2.getValeur() == player1) {
                        btn2.setImageResource(R.drawable.cross);
                        case2.setValeur(npc);
                    }
                    else {
                        btn2.setImageResource(R.drawable.circle);
                        case2.setValeur(player1);
                    }
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (case3.isEmpty()){
                    btn3.setImageResource(R.drawable.cross);
                    case3.setNotEmpty();
                    case3.setValeur(player1);
                }
                else {
                    if (case3.getValeur() == player1) {
                        btn3.setImageResource(R.drawable.cross);
                        case3.setValeur(npc);
                    }
                    else {
                        btn3.setImageResource(R.drawable.circle);
                        case3.setValeur(player1);
                    }
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (case4.isEmpty()){
                    btn4.setImageResource(R.drawable.cross);
                    case4.setNotEmpty();
                    case4.setValeur(player1);
                }
                else {
                    if (case4.getValeur() == player1) {
                        btn4.setImageResource(R.drawable.cross);
                        case4.setValeur(npc);
                    }
                    else {
                        btn4.setImageResource(R.drawable.circle);
                        case4.setValeur(player1);
                    }
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (case5.isEmpty()){
                    btn5.setImageResource(R.drawable.cross);
                    case5.setNotEmpty();
                    case5.setValeur(player1);
                }
                else {
                    if (case5.getValeur() == player1) {
                        btn5.setImageResource(R.drawable.cross);
                        case5.setValeur(npc);
                    }
                    else {
                        btn5.setImageResource(R.drawable.circle);
                        case5.setValeur(player1);
                    }
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (case6.isEmpty()){
                    btn6.setImageResource(R.drawable.cross);
                    case6.setNotEmpty();
                    case6.setValeur(player1);
                }
                else {
                    if (case6.getValeur() == player1) {
                        btn6.setImageResource(R.drawable.cross);
                        case6.setValeur(npc);
                    }
                    else {
                        btn6.setImageResource(R.drawable.circle);
                        case6.setValeur(player1);
                    }
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (case7.isEmpty()){
                    btn7.setImageResource(R.drawable.cross);
                    case7.setNotEmpty();
                    case7.setValeur(player1);
                }
                else {
                    if (case7.getValeur() == player1) {
                        btn7.setImageResource(R.drawable.cross);
                        case7.setValeur(npc);
                    }
                    else {
                        btn7.setImageResource(R.drawable.circle);
                        case7.setValeur(player1);
                    }
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (case8.isEmpty()){
                    btn8.setImageResource(R.drawable.cross);
                    case8.setNotEmpty();
                    case8.setValeur(player1);
                }
                else {
                    if (case8.getValeur() == player1) {
                        btn8.setImageResource(R.drawable.cross);
                        case8.setValeur(npc);
                    }
                    else {
                        btn8.setImageResource(R.drawable.circle);
                        case8.setValeur(player1);
                    }
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (case9.isEmpty()){
                    btn9.setImageResource(R.drawable.cross);
                    case9.setNotEmpty();
                    case9.setValeur(player1);
                }
                else {
                    if (case9.getValeur() == player1) {
                        btn9.setImageResource(R.drawable.cross);
                        case9.setValeur(npc);
                    }
                    else {
                        btn9.setImageResource(R.drawable.circle);
                        case9.setValeur(player1);
                    }
                }
            }
        });
    }

}