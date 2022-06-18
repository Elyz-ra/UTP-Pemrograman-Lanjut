package com.company;

public class Magician extends Character {
    private int def;
    private int atk;
    private int HP;

    Magician(int def, int atk, int HP){
        super(def, atk, HP);
        this.def = def;
        this.atk = atk;
        this.HP = HP;
    }
    public boolean atk(){
        double Hit = Math.random();
        if(Hit < 0.35)
            return true;

        return false;
    }
}