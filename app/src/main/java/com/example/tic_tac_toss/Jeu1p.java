package com.example.tic_tac_toss;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.ImageView;

public class Jeu1p {

    private Activity activity;
    private boolean winP1;
    private boolean winP2;
    int tour;
    int cpt;

    public Jeu1p(){
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
            myPopup.setTitle(R.string.win_player);
            myPopup.setPositiveButton(R.string.home, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent accueil = new Intent(activity.getApplicationContext(), TicTacToeActivity.class);
                    accueil.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    activity.startActivity(accueil);
                    activity.finish();
                }
            }).setNegativeButton(R.string.play_again, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent rejouer = new Intent(activity.getApplicationContext(), TicTacToe1pEasyActivity.class);
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
            myPopup.setTitle(R.string.win_AI);
            myPopup.setPositiveButton(R.string.home, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent accueil = new Intent(activity.getApplicationContext(), TicTacToeActivity.class);
                    accueil.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    activity.startActivity(accueil);
                    activity.finish();
                }
            }).setNegativeButton(R.string.play_again, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent rejouer = new Intent(activity.getApplicationContext(), TicTacToe1pEasyActivity.class);
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
                    Intent goPage1 = new Intent(activity.getApplicationContext(), TicTacToe1pEasyActivity.class);
                    goPage1.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    activity.startActivity(goPage1);
                    activity.finish();
                }
            });
            myPopup.show();
        }
    }

    public int canWinLine(CaseTicTacToe[][] grid, int player){
        int i;

        for (i=0; i < 3; i++){
            if (grid[i][0].getValue() == player && grid[i][1].getValue() == player && grid[i][2].getValue() == 0){
                return i*3+3;
            }
            else if (grid[i][0].getValue() == player && grid[i][1].getValue() == 0 && grid[i][2].getValue() == player){
                return i*3+2;
            }
            else if (grid[i][0].getValue() == 0 && grid[i][1].getValue() == player && grid[i][2].getValue() == player){
                return i*3+1;
            }
        }
        return 0;
    }

    public int canWinRow(CaseTicTacToe[][] grid, int player){
        int i;

        for (i=0; i < 3; i++){
            if (grid[0][i].getValue() == player && grid[1][i].getValue() == player && grid[2][i].getValue() == 0){
                return 7+i;
            }
            else if (grid[0][i].getValue() == player && grid[1][i].getValue() == 0 && grid[2][i].getValue() == player){
                return 4+i;
            }
            else if (grid[0][i].getValue() == 0 && grid[1][i].getValue() == player && grid[2][i].getValue() == player){
                return 1+i;
            }
        }
        return 0;
    }

    public int canWinDiag(CaseTicTacToe[][] grid, int player){
        if (grid[0][0].getValue() == player && grid[1][1].getValue() == player && grid[2][2].getValue() == 0)
            return 9;
        else if (grid[0][0].getValue() == player && grid[1][1].getValue() == 0 && grid[2][2].getValue() == player)
            return 5;
        else if (grid[0][0].getValue() == 0 && grid[1][1].getValue() == player && grid[2][2].getValue() == player)
            return 1;
        else if (grid[0][2].getValue() == player && grid[1][1].getValue() == player && grid[2][0].getValue() == 0)
            return 7;
        else if (grid[0][2].getValue() == player && grid[1][1].getValue() == 0 && grid[2][0].getValue() == player)
            return 5;
        else if (grid[0][2].getValue() == 0 && grid[1][1].getValue() == player && grid[2][0].getValue() == player)
            return 3;
        else
            return 0;
    }

    public int canWin(CaseTicTacToe[][] grid, int player){
        if (canWinLine(grid, player) != 0)
            return canWinLine(grid,player);
        else {
            if (canWinRow(grid, player) != 0)
                return canWinRow(grid, player);
            else {
                if (canWinDiag(grid, player)!=0)
                    return canWinDiag(grid, player);
                else
                    return 0;
            }
        }
    }

    public void playAI(CaseTicTacToe[][] gridCase, ImageView[][] gridBtn){
        // check if can win
        int num;
        int numLine;
        int numRow;
        int nbCase = 3;
        num = canWin(gridCase, 2);
        if (num != 0){
            num = num - 1;
            numLine = num / nbCase;
            numRow =  num % nbCase;
            cpt++;
            gridBtn[numLine][numRow].setImageResource(R.drawable.circle);
            gridCase[numLine][numRow].setValue(2);
            tour = 1;
        }
        else {
            num = canWin(gridCase, 1);
            if (num != 0){
                num = num - 1;
                numLine = num / nbCase;
                numRow =  num % nbCase;
                cpt++;
                gridBtn[numLine][numRow].setImageResource(R.drawable.circle);
                gridCase[numLine][numRow].setValue(2);
                tour = 1;
            }
            else {
                // play in the first empty case
                int i;
                int j;
                for (i = 0; i<2; i++){
                    for (j=0; j<2; j++){
                        if (gridCase[i][j].isEmpty()) {
                            cpt++;
                            gridBtn[i][j].setImageResource(R.drawable.circle);
                            gridCase[i][j].setValue(2);
                            tour = 1;
                            return;
                        }
                    }
                }
            }
        }
    }

    public void playPlayer(CaseTicTacToe cases, ImageView btn){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(cases.isEmpty() && tour==1){
                    cpt++;
                    btn.setImageResource(R.drawable.cross);
                    cases.setNotEmpty();
                    cases.setValue(1);
                    tour = 2;
                }
            }
        }
    }

}
