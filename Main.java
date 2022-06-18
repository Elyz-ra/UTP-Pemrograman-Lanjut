package com.company;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pegawai> pegawai = new ArrayList<>();

        pegawai.add(new PegawaiTetap("Bayu", "350728490327424892342", 2000000));
        pegawai.add(new PegawaiTetap("Keqing", "350728490327424892345", 5000000));
        pegawai.add(new PegawaiTetap("Thoma", "350728490327424892348", 2500000));

        pegawai.add(new PegawaiHarian("Edo", "350728490327424892343", 8500, 40));
        pegawai.add(new PegawaiHarian("Diluc", "350728490327424892346", 9000, 42));
        pegawai.add(new PegawaiHarian("Ningguang", "350728490327424892349", 10000, 44));

        pegawai.add(new Sales("Tika", "350728490327424892344", 50, 50000));
        pegawai.add(new Sales("Jean", "350728490327424892347", 55, 55000));
        pegawai.add(new Sales("Sayu", "350728490327424892350", 60, 60000));

        for (int i = 0; i < pegawai.size(); i++){
            System.out.println(pegawai.get(i).toString());
        }
    }
}
