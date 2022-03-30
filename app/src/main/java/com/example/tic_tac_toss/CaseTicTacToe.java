package com.example.tic_tac_toss;

public class CaseTicTacToe {

    private boolean empty;
    private int value;

    public CaseTicTacToe() {
        this.empty = true;
        this.value = 0;
    }

    public boolean isEmpty() {
        return (value == 0);
    }

    public void setNotEmpty (){
        this.empty = false;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int val){
        this.value = val;
    }
}
