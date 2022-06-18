package com.company;

public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public String toString() {
        String print = "";
        System.out.printf("%-20s: %s%n", "Pegawai Harian", getNama());
        print += String.format("%-20s: Rp %.1f%n", "Upah/Jam", getUpahPerJam());
        print += String.format("%-20s: %d%n", "Total Jam Kerja", getTotalJam());

        if ((int) getTotalJam() <= 40) {
            print += String.format("%-20s: Rp %d%n", "Pendapatan", (int) (getUpahPerJam() * getTotalJam()));
        }else {
            print += String.format("%-20s: Rp %d%n", "Pendapatan", (int) ((40 * getUpahPerJam()) + ((getTotalJam() - 40) * getUpahPerJam() * 1.5)));
        }

        return super.toString() + print;
    }
}
