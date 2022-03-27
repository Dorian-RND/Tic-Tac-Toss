package com.example.tic_tac_toss;

public class CaseTicTacToe {

    private boolean empty;
    private int valeur;

    public CaseTicTacToe() {
        this.empty = true;
        this.valeur = 0;
    }

    public boolean isEmpty() {
        return (valeur == 0);
    }

    public void setNotEmpty (){
        this.empty = false;
    }

    public int getValeur(){
        return valeur;
    }

    public void setValeur(int val){
        this.valeur = val;
    }
}
