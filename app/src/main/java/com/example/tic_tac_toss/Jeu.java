package com.example.tic_tac_toss;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.ImageView;

public class Jeu {

    private Activity activity;
    private boolean winP1;
    private boolean winP2;
    int tour;
    int cpt;

    public Jeu(){
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

    public void CheckLigne(CaseTicTacToe[][] listCase){
        int j = 0;
        for(int i=0; i<3; i++){
            if((listCase[i][j].getValeur() == 1) && (listCase[i][j+1].getValeur() == 1) && listCase[i][j+2].getValeur()==1){
                winP1 = true;
            }
            if((listCase[i][j].getValeur() == 2) && (listCase[i][j+1].getValeur() == 2) && listCase[i][j+2].getValeur()==2){
                winP2 = true;
            }
        }
    }

    public void CheckColonne(CaseTicTacToe[][] listCase){
        int i = 0;
        for(int j=0; j<3; j++){
            if((listCase[i][j].getValeur() == 1) && (listCase[i+1][j].getValeur() == 1) && listCase[i+2][j].getValeur()==1){
                winP1 = true;
            }
            if((listCase[i][j].getValeur() == 2) && (listCase[i+1][j].getValeur() == 2) && listCase[i+2][j].getValeur()==2){
                winP2 = true;
            }
        }
    }

    public void CheckDiagonale(CaseTicTacToe[][] listCase){
        int i = 0;
        int j1 = 0;
        int j2 = 2;
        if(((listCase[i][j1].getValeur() == 1) && (listCase[i+1][j1+1].getValeur() == 1) && (listCase[i+2][j2].getValeur()==1)) || ((listCase[i][j2].getValeur() == 1) && (listCase[i+1][j1+1].getValeur() == 1) && (listCase[i+2][j1].getValeur()==1))){
            winP1 = true;
        }
        if(((listCase[i][j1].getValeur() == 2) && (listCase[i+1][j1+1].getValeur() == 2) && (listCase[i+2][j2].getValeur()==2)) || ((listCase[i][j2].getValeur() == 2) && (listCase[i+1][j1+1].getValeur() == 2) && (listCase[i+2][j1].getValeur()==2))){
            winP2 = true;
        }
    }

    public boolean CheckWin(CaseTicTacToe[][] listCase){
        CheckLigne(listCase);
        CheckColonne(listCase);
        CheckDiagonale(listCase);

        if(winP1){
            AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
            myPopup.setTitle("Joueur 1 a gagné");
            myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent accueil = new Intent(activity.getApplicationContext(), TicTacToeActivity.class);
                    accueil.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    activity.startActivity(accueil);
                    activity.finish();
                }
            }).setNegativeButton("Rejouer", new DialogInterface.OnClickListener() {
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
            AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
            myPopup.setTitle("Joueur 2 a gagné");
            myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent accueil = new Intent(activity.getApplicationContext(), TicTacToeActivity.class);
                    accueil.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    activity.startActivity(accueil);
                    activity.finish();
                }
            }).setNegativeButton("Rejouer", new DialogInterface.OnClickListener() {
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
            AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
            myPopup.setTitle("Aucun joueur n'a gagné");
            myPopup.setPositiveButton("Accueil", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent accueil = new Intent(activity.getApplicationContext(), TicTacToeActivity.class);
                    accueil.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    activity.startActivity(accueil);
                    activity.finish();
                }
            }).setNegativeButton("Rejouer", new DialogInterface.OnClickListener() {
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
                    cases.setValeur(1);
                    tour = 2;
                }
                else if(cases.isEmpty() && tour==2){
                    cpt++;
                    btn.setImageResource(R.drawable.circle);
                    cases.setNotEmpty();
                    cases.setValeur(2);
                    tour = 1;
                }
            }
        }
    }
}
