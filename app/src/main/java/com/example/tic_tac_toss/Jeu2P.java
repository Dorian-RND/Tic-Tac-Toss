package com.example.tic_tac_toss;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.ImageView;

public class Jeu2P {

    private Activity activity;
    private boolean winP1;
    private boolean winP2;
    int tour;
    int cpt;

    public Jeu2P(){
        this.winP1 = false;
        this.winP2 = false;
        this.tour = 1;
        this.cpt = 0;
    }

    public Activity getActivity(){
        return activity;
    }

    public void setActivity(Activity activity1){
        this.activity = activity1;
    }

    public void CheckLine(CaseTicTacToe[][] listCase){
        int j = 0;
        for(int i=0; i<3; i++){
            if((listCase[i][j].getValue() == 1) && (listCase[i][j+1].getValue() == 1) && listCase[i][j+2].getValue()==1){
                winP1 = true;
            }
            if((listCase[i][j].getValue() == 2) && (listCase[i][j+1].getValue() == 2) && listCase[i][j+2].getValue()==2){
                winP2 = true;
            }
        }
    }

    public void CheckRow(CaseTicTacToe[][] listCase){
        int i = 0;
        for(int j=0; j<3; j++){
            if((listCase[i][j].getValue() == 1) && (listCase[i+1][j].getValue() == 1) && listCase[i+2][j].getValue()==1){
                winP1 = true;
            }
            if((listCase[i][j].getValue() == 2) && (listCase[i+1][j].getValue() == 2) && listCase[i+2][j].getValue()==2){
                winP2 = true;
            }
        }
    }

    public void CheckDiagonale(CaseTicTacToe[][] listCase){
        int i = 0;
        int j1 = 0;
        int j2 = 2;
        if(((listCase[i][j1].getValue() == 1) && (listCase[i+1][j1+1].getValue() == 1) && (listCase[i+2][j2].getValue()==1)) || ((listCase[i][j2].getValue() == 1) && (listCase[i+1][j1+1].getValue() == 1) && (listCase[i+2][j1].getValue()==1))){
            winP1 = true;
        }
        if(((listCase[i][j1].getValue() == 2) && (listCase[i+1][j1+1].getValue() == 2) && (listCase[i+2][j2].getValue()==2)) || ((listCase[i][j2].getValue() == 2) && (listCase[i+1][j1+1].getValue() == 2) && (listCase[i+2][j1].getValue()==2))){
            winP2 = true;
        }
    }

    public boolean CheckWin(CaseTicTacToe[][] listCase){
        CheckLine(listCase);
        CheckRow(listCase);
        CheckDiagonale(listCase);

        if(winP1){
            AlertDialog.Builder myPopup = new AlertDialog.Builder(activity, R.style.AlertDialogStyle);
            myPopup.setTitle(R.string.win_player1);
            myPopup.setPositiveButton(R.string.home, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent accueil = new Intent(activity.getApplicationContext(), TicTacToeActivity.class);
                    accueil.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    activity.startActivity(accueil);
                    activity.finish();
                }
            }).setNegativeButton(R.string.play_again, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent rejouer = new Intent(activity.getApplicationContext(), TicTacToe2pActivity.class);
                    rejouer.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    activity.startActivity(rejouer);
                    activity.finish();
                }
            });
            myPopup.show();
            return true;
        }

        else if(winP2){
            AlertDialog.Builder myPopup = new AlertDialog.Builder(activity, R.style.AlertDialogStyle);
            myPopup.setTitle(R.string.win_player2);
            myPopup.setPositiveButton(R.string.home, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent accueil = new Intent(activity.getApplicationContext(), TicTacToeActivity.class);
                    accueil.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    activity.startActivity(accueil);
                    activity.finish();
                }
            }).setNegativeButton(R.string.play_again, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent rejouer = new Intent(activity.getApplicationContext(), TicTacToe2pActivity.class);
                    rejouer.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    activity.startActivity(rejouer);
                    activity.finish();
                }
            });
            myPopup.show();
            return true;
        }
        else{
            return false;
        }
    }

    public void CheckNull(){
        if(cpt == 9 && (!winP1 || !winP2)){
            AlertDialog.Builder myPopup = new AlertDialog.Builder(activity, R.style.AlertDialogStyle);
            myPopup.setTitle(R.string.draw);
            myPopup.setPositiveButton(R.string.home, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent accueil = new Intent(activity.getApplicationContext(), TicTacToeActivity.class);
                    accueil.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    activity.startActivity(accueil);
                    activity.finish();
                }
            }).setNegativeButton(R.string.play_again, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent goPage1 = new Intent(activity.getApplicationContext(), TicTacToe2pActivity.class);
                    goPage1.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    activity.startActivity(goPage1);
                    activity.finish();
                }
            });
            myPopup.show();
        }
    }

    public void play(CaseTicTacToe cases, ImageView btn){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(cases.isEmpty() && tour==1){
                    cpt++;
                    btn.setImageResource(R.drawable.cross);
                    cases.setNotEmpty();
                    cases.setValue(1);
                    tour = 2;
                }
                else if(cases.isEmpty() && tour==2){
                    cpt++;
                    btn.setImageResource(R.drawable.circle);
                    cases.setNotEmpty();
                    cases.setValue(2);
                    tour = 1;
                }
            }
        }
    }
}
