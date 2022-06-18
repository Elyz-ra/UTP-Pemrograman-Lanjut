package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Magician mg = new Magician(10, 60, 100);
        Healer sp = new Healer(10, 10, 70);
        Warrior fg = new Warrior(30, 40, 100);
        Titan mons = new Titan(0, 45, 200);

        System.out.println("Selamat datang di game Defense FILKOM !");
        System.out.print("Silahkan masukkan nama player : ");
        String nama = input.nextLine();
        int choose = 0;

        do{
            try{
                System.out.println("Silahkan pilih karakter yang anda inginkan :");
                String[] Role = {"1. Magician", "2. Healer", "3. Warrior"};
                for(String Hero : Role) {
                    System.out.println(Hero);
                }
                choose = input.nextInt();

                if (choose < 1 || choose > 3) throw new NumberFormatException();
            } catch (Exception e){
                if(e instanceof NumberFormatException) {
                    System.out.println("Silahkan masukan angka 1 - 3");
                } else{
                    System.err.println("Silahkan masukkan angka !!!");
                    input.next();
                }
            }
        }while (choose == 0);
        System.out.println("Selamat datang, " + nama);

        if (choose == 1) {
            int i = 1;
            mg.info();

            while (mg.getHp() != 0 && mons.getHp() != 0) {
                System.out.println("==============" + " TURN " + i + " ==============");

                if (mg.atk()) {
                    mons.receiveDamage(mg.getAtk());
                }
                if (mons.atk()) {
                    mg.receiveDamage(mons.getAtk());
                }
                System.out.println("Enemy's HP\t: " + mons.getHp());
                System.out.println(nama + "'s HP\t\t: " + mg.getHp());
                i++;
            }
            System.out.println("====================================");
            if (mons.getHp() == 0) {
                System.out.println(nama + " menang\n");
            }
            if (mg.getHp() == 0) {
                System.out.println("Titan menang\n");
            }

            System.out.println("============== PLAYER ==============");
            mg.info();
            System.out.println();
            System.out.println("============== MUSUH ==============");
            mons.info();
        } else if (choose == 2) {
            int j = 1;
            sp.info();

            while (sp.getHp() != 0 && mons.getHp() != 0) {
                System.out.println("==============" + " TURN " + j + " ==============");
                if (j % 2 == 0) {
                    sp.Heal();
                }
                if (sp.atk()) {
                    mons.receiveDamage(sp.getAtk());
                }
                if (mons.atk()) {
                    sp.receiveDamage(mons.getAtk());
                }

                System.out.println("Enemy's HP\t: " + mons.getHp());
                System.out.println(nama + "'s HP\t: " + sp.getHp());
                j++;
            }

            System.out.println("====================================");

            if (mons.getHp() == 0)
                System.out.println(nama + " menang\n");
            if (sp.getHp() == 0)
                System.out.println("Titan menang\n");

            System.out.println("============== PLAYER ==============");
            sp.info();
            System.out.println();
            System.out.println("============== MUSUH ==============");
            mons.info();
        } else if (choose == 3) {
            int k = 1;
            fg.info();

            while (fg.getHp() != 0 && mons.getHp() != 0) {
                System.out.println("==============" + " TURN " + k + " ==============");
                if (fg.atk()) {
                    mons.receiveDamage(fg.getAtk());
                }
                if (mons.atk()) {
                    fg.receiveDamage(mons.getAtk());
                }
                System.out.println("Enemy's HP\t: " + mons.getHp());
                System.out.println(nama + "'s HP\t: " + fg.getHp());
                k++;
            }

            System.out.println("====================================");

            if (mons.getHp() == 0)
                System.out.println(nama + " menang\n");
            if (fg.getHp() == 0)
                System.out.println("Titan menang\n");

            System.out.println("============== PLAYER ==============");
            fg.info();
            System.out.println();
            System.out.println("============== MUSUH ==============");
            mons.info();
        }
    }

}