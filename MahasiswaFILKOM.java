package com.company;

public class MahasiswaFILKOM extends Manusia {
    private String NIM;
    private double IPK;

    public MahasiswaFILKOM(String NIM, double IPK, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus() {
        String angkatan = "";
        String jurusan = "";
        angkatan = "20" + NIM.substring(0, 2);

        switch (NIM.substring(6, 7)) {
            case "2":
                jurusan = "Teknik Meniup Gelembung";
                break;
            case "3":
                jurusan = "Teknik Berburu Ubur Ubur";
                break;
            case "4":
                jurusan = "Sistem Perhamburgeran";
                break;
            case "6":
                jurusan = "Pendidikan Chum Bucket";
                break;
            case "7":
                jurusan = "Teknologi Telepon Kerang";
                break;
        }
        return jurusan + "," + angkatan;
    }

    public double getBeasiswa() {
        double beasiswa;
        if (IPK >= 3.0 && IPK <= 3.5) {
            beasiswa = 50;
        } else if (IPK > 3.5 && IPK <= 4) {
            beasiswa = 75;
        } else {
            beasiswa = 0;
        }
        return beasiswa;
    }

    public String toString() {
        System.out.printf("%-25s%s%s","Nama", ":", this.getNama());
        System.out.printf("\n%-25s%s%s", "NIK", ":", this.getNIK());
        System.out.printf("\n%-25s%s%s","Jenis Kelamin", ":", (this.getJenisKelamin() ? "Laki-laki" : "Perempuan"));
        System.out.printf("\n%-25s%s%s%s","Pendapatan", ":", "$", (this.getBeasiswa() + this.getTunjangan()));
        System.out.printf("\n%-25s%s%s","NIM", ":", this.getNIM());
        System.out.printf("\n%-25s%s%s","IPK",":", this.getIPK());
        System.out.printf("\n%-25s%s%s\n","Status", ":", this.getStatus());
        return "";
    }
}
