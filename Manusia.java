package com.company;

public class Manusia {
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean getMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan() {
        double tunjangan;
        if (this.getMenikah() == true) {
            if (this.getJenisKelamin() == true) {
                tunjangan = 25;
            } else {
                tunjangan = 20;
            }
        } else {
            tunjangan = 15;
        }
        return tunjangan;
    }

    public double getPendapatan() {
        double pendapatan = getTunjangan();
        return pendapatan;
    }

    @Override
    public String toString() {
        System.out.printf("%-25s%s%s","Nama", ":", this.getNama());
        System.out.printf("\n%-25s%s%s", "NIK", ":", this.getNIK());
        System.out.printf("\n%-25s%s%s","Jenis Kelamin", ":", (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.printf("\n%-25s%s%s%s\n","Pendapatan", ":", "$", this.getPendapatan());
        return " ";
    }
}

