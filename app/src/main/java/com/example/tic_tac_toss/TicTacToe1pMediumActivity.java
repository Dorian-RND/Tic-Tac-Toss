package com.example.tic_tac_toss;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TicTacToe1pMediumActivity extends AppCompatActivity {

    private TicTacToe1pMediumActivity activity;
    protected Jeu1pMed jeu = new Jeu1pMed();
    protected CaseTicTacToe case1;
    protected CaseTicTacToe case2;
    protected CaseTicTacToe case3;
    protected CaseTicTacToe case4;
    protected CaseTicTacToe case5;
    protected CaseTicTacToe case6;
    protected CaseTicTacToe case7;
    protected CaseTicTacToe case8;
    protected CaseTicTacToe case9;

    protected ImageView btn1;
    protected ImageView btn2;
    protected ImageView btn3;
    protected ImageView btn4;
    protected ImageView btn5;
    protected ImageView btn6;
    protected ImageView btn7;
    protected ImageView btn8;
    protected ImageView btn9;

    protected int cpt = 0;
    protected int tour = 1;

    CaseTicTacToe[][] listCase = {{case1, case2, case3}, {case4, case5, case6}, {case7, case8, case9}};
    ImageView[][] listBtn = {{btn1, btn2, btn3}, {btn4, btn5, btn6}, {btn7, btn8, btn9}};


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe2p);

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                listCase[i][j] = new CaseTicTacToe();
            }
        }

        listBtn[0][0] = findViewById(R.id.img_btn_1);
        listBtn[0][1] = findViewById(R.id.img_btn_2);
        listBtn[0][2] = findViewById(R.id.img_btn_3);
        listBtn[1][0] = findViewById(R.id.img_btn_4);
        listBtn[1][1] = findViewById(R.id.img_btn_5);
        listBtn[1][2] = findViewById(R.id.img_btn_6);
        listBtn[2][0] = findViewById(R.id.img_btn_7);
        listBtn[2][1] = findViewById(R.id.img_btn_8);
        listBtn[2][2] = findViewById(R.id.img_btn_9);

        this.activity = this;

        jeu.setActivity(this);

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                int finalIndice_i = i;
                int finalIndice_j = j;
                listBtn[i][j].setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        jeu.playPlayer(listCase[finalIndice_i][finalIndice_j], listBtn[finalIndice_i][finalIndice_j]);
                        if (jeu.CheckWin(listCase)){
                            return;
                        }
                        if(!jeu.CheckWin(listCase)) {
                            jeu.CheckNull();
                        }
                        jeu.playAI(listCase, listBtn);
                        jeu.CheckWin(listCase);
                        if(!jeu.CheckWin(listCase)) {
                            jeu.CheckNull();
                        }
                    }
                });
            }
        }
    }

}