package com.company;

public class Pegawai {
    private String nama;
    private String noKTP;

    public Pegawai(){
    }

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public double gaji(){
        return 0.0;
    }

    public String toString(){
        String returnString = "";
        returnString += String.format("%-20s: %s%n", "No.KTP", getNoKTP());
        return returnString;
    }
}
