package com.company;

public class Main {

    static Manusia manusia[];
    static MahasiswaFILKOM mahasiswa[];
    static Pekerja pekerja[];
    static Manager manager[];

    public static void main(String[] args) {
        //Class Manusia
       manusia = new Manusia[3];

       System.out.printf("%35s\n","Class Manusia");
        System.out.println("===========================================================");

        manusia[0] = new Manusia("Sangonomiya Kokomi", "666555444222", false, false);
        manusia[1] = new Manusia("Albedo Kreidenprinze", "888444666111", true, false);
        manusia[2] = new Manusia("Kujou Sara", "999666333777", false, true);

        System.out.println(manusia[0].toString());
        System.out.println(manusia[1].toString());
        System.out.println(manusia[2].toString());

        //Class MahasiswaFILKOM
        mahasiswa = new MahasiswaFILKOM[3];

        System.out.printf("\n%35s\n","Class Mahasiswa");
        System.out.println("===========================================================");

        mahasiswa[0] = new MahasiswaFILKOM("215150707111024", 3.9, "Elyzia Janara", "123456789123", false, false);
        mahasiswa[1] = new MahasiswaFILKOM("202090300911002", 3.8, "Xiao", "987654321987", true, false);
        mahasiswa[2] = new MahasiswaFILKOM("202150406611999", 3.3, "Eula Lawrence", "321456987452", false, true);

        System.out.println(mahasiswa[0].toString());
        System.out.println(mahasiswa[1].toString());
        System.out.println(mahasiswa[2].toString());

        //Class Pekerja
        pekerja = new Pekerja[4];

        System.out.printf("\n%35s\n", "Class Pekerja ");
        System.out.println("===========================================================");

        pekerja[0] = new Pekerja(9, 30, "314127229647", "Yae Miko", "666777888999", false, true);
        pekerja[1] = new Pekerja(8, 29, "323325329957", "Kamisato Ayaka", "111222333444", false, true);
        pekerja[2] = new Pekerja(7, 28, "3322256291648", "Kaedehara Kazuha", "444333222111", true, false);
        pekerja[3] = new Pekerja(6, 27, "1412259291648", "Kaeya Alberich", "999888777666", true, false);

        System.out.println(pekerja[0].toString());
        System.out.println(pekerja[1].toString());
        System.out.println(pekerja[2].toString());
        System.out.println(pekerja[3].toString());

        //Class Manager
        manager = new Manager[3];

        System.out.printf("\n%35s\n","Class Manager");
        System.out.println("===========================================================");

        manager[0] = new Manager(3000, 6, 30, "301095729156", "Kamisato Ayato", "222000777999", true, false);
        manager[1] = new Manager(2000, 7, 24, "102215820906", "Diluc Ragnvindr", "666444222111", true, true);
        manager[2] = new Manager(1000, 8, 20, "103295521236", "Jean Gunnhildr", "999333000444", false, true);

        System.out.println(manager[0].toString());
        System.out.println(manager[1].toString());
        System.out.println(manager[2].toString());

        //Jumlah
        System.out.printf("\n%45s\n","Total Keseluruhan yang Terdaftar ");
        System.out.println("===========================================================");
        System.out.println("Ada " + manusia.length +" Manusia");
        System.out.println("Ada " + mahasiswa.length +" Mahasiswa Aktif");
        System.out.println("Ada " + pekerja.length +" Pekerja Aktif");
        System.out.println("Ada " + manager.length +" Manager Aktif");
    }
}