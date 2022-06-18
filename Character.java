package com.company;

public abstract class Character {
    private int def;
    private int atk;
    private int HP;

    Character(int def,int atk,int HP){
        this.def = def;
        this.atk = atk;
        this.HP = HP;
    }
    public abstract boolean atk();

    public void receiveDamage(int dmg){
        if(dmg > def){
            this.HP = (HP + def) - dmg;
            if(this.HP <= 0)
                HP = 0;
        }
    }
    public void info(){
        System.out.println("-------------- STATUS -------------" + "\nROLE\t: " + getClass().getSimpleName() + "\nHP\t\t: " + getHp() + "\nATTACK\t: " + getAtk() + "\nDEFENSE\t: " + getDef());
    }
    public int getDef(){
        return this.def;
    }
    public int getAtk(){
        return this.atk;
    }
    public int getHp(){
        return this.HP;
    }
    public void setDef(int def){
        System.out.println(this.def);
    }
    public void setAtk(int atk){
        System.out.println(this.atk);
    }
    public void setHp(int HP){
        System.out.println(this.HP);
    }
}