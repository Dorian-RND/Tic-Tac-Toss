package com.example.tic_tac_toss;

import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Jeu {

    CaseTicTacToe case1 = new CaseTicTacToe();
    CaseTicTacToe case2 = new CaseTicTacToe();
    CaseTicTacToe case3 = new CaseTicTacToe();
    CaseTicTacToe case4 = new CaseTicTacToe();
    CaseTicTacToe case5 = new CaseTicTacToe();
    CaseTicTacToe case6 = new CaseTicTacToe();
    CaseTicTacToe case7 = new CaseTicTacToe();
    CaseTicTacToe case8 = new CaseTicTacToe();
    CaseTicTacToe case9 = new CaseTicTacToe();

    ImageView btn1;
    ImageView btn2;
    ImageView btn3;
    ImageView btn4;
    ImageView btn5;
    ImageView btn6;
    ImageView btn7;
    ImageView btn8;
    ImageView btn9;

    CaseTicTacToe[] case_morpion = {case1, case2, case3, case4, case5, case6, case7, case8, case9};
    ImageView[] bouton = {btn1, btn2, btn3, btn4, btn5, btn5, btn6, btn7, btn8, btn9};

    int player1 = 1;
    int player2 = 2;
    int tour = 0;

    public Jeu(ImageView[] btn1, CaseTicTacToe[] case_tic_tac_toe) {
        this.bouton = btn1;
        this.case_morpion = case_tic_tac_toe;
    }

    public void validation(){
        for(int tour=0; tour<8; tour++){
            for(int i=0; i<8; i++){
                if (case_morpion[i].isEmpty()){
                    bouton[i].setImageResource(R.drawable.cross);
                    case_morpion[i].setNotEmpty();
                    case_morpion[i].setValeur(player1);
                }
                else if (case_morpion[i].isEmpty() && tour==2){
                    bouton[i].setImageResource(R.drawable.circle);
                    case_morpion[i].setNotEmpty();
                    case_morpion[i].setValeur(player2);
                }
                else {
                    if (case_morpion[i].getValeur() == player1) {
                        bouton[i].setImageResource(R.drawable.cross);
                        case_morpion[i].setValeur(player1);
                    }
                    else {
                        bouton[i].setImageResource(R.drawable.circle);
                        case_morpion[i].setValeur(player2);
                    }
                }
            }
        }
    }
}
