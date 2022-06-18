package com.company;

public class Healer extends Character {
    private int def;
    private int atk;
    private int HP;

    Healer(int def, int atk, int HP){
        super(def, atk, HP);
        this.def = def;
        this.atk = atk;
        this.HP = HP;
    }
    public boolean atk(){
        double Hit = Math.random();
        if(Hit < 0.85) {
            return true;
        }
        return false;
    }
    public void Heal(){
        System.out.println("Menggunakan skill heal");
    }
    public int getHp(){
        return this.HP + 25;
    }
    public void setHp(int HP){
        System.out.println(this.HP);
    }
}