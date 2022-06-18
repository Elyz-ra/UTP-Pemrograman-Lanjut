package com.company;

public class Sales extends  Pegawai{
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public String toString() {
        String print = "";
        System.out.printf("%-20s: %s%n","Sales", getNama());
        print += String.format("%-20s: %d%n", "Total Penjualan", getPenjualan());
        print += String.format("%-20s: %.1f%n", "Besaran Komisi", getKomisi());
        print += String.format("%-20s: Rp %d%n", "Pendapatan", (int) (getPenjualan() * getKomisi()));

        return super.toString() + print;
    }
}
