package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input data merchant
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Rose", "Ayam Kota Ekstra Nasi", 8000));

        System.out.println("Nama    :Elyzia Janara K");
        System.out.println("Nim     :215150707111024");
        DataMerchant.tampilData();
        System.out.println();

        System.out.println("===Masukkan Data Merchant===");
        System.out.print("Input Nama Merchant   : ");
        String namaMerchant = input.nextLine();
        System.out.print("Input Nama Produk     : ");
        String namaProduk = input.nextLine();
        System.out.print("Input Harga Produk    : ");
        double hargaMakanan = input.nextDouble();
        input.nextLine();
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(namaMerchant, namaProduk, hargaMakanan));
        System.out.println();
        DataMerchant.tampilData();
        System.out.println();

        DataMerchant.updateMerchant(DataMerchant.cariMerchant("Ayam Geprek Kak Rose"), "Ayam Geprek Kak Rose", "Mie Zelenial", 12000);
        System.out.println("===Tampilan Data Merchant yang sudah di update===");
        DataMerchant.tampilMerchant(DataMerchant.cariMerchant("Ayam Geprek Kak Rose"));
        System.out.println();
        System.out.println("Nama    :Elyzia Janara K");
        System.out.println("Nim     :215150707111024");
    }
}
