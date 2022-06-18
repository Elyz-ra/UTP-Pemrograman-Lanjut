package com.company;

public class Manager extends Pekerja{
    private int lamaKerja;

    public Manager(int lamaKerja, int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(jamKerja, hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public String toString() {
        System.out.printf("%-25s%s%s", "Nama", ":", this.getNama());
        System.out.printf("\n%-25s%s%s", "NIK", ":", this.getNIK());
        System.out.printf("\n%-25s%s%s", "NIP", ":", this.getNIP());
        System.out.printf("\n%-25s%s%s", "Jenis Kelamin", ":", (this.getJenisKelamin() ? "Laki-laki" : "Perempuan"));
        System.out.printf("\n%-25s%s%s%s", "Pendapatan", ":", "$", (this.getGaji() + (this.getBonus() + (this.getBonus() * 35 / 100)) + (this.getTunjangan() + 15)));
        System.out.printf("\n%-25s%s%s%s", "Bonus", ":", "$", (this.getBonus() + (this.getBonus() * 35 / 100)));
        System.out.printf("\n%-25s%s%s%s","Gaji", ":", "$", this.getGaji());
        System.out.printf("\n%-25s%s%s","Status", ":", this.getStatus());
        System.out.printf("\n%-25s%s%s%s\n","Lama Kerja", ":", this.getLamaKerja(), " hari");
        return "";
    }
}