package com.company;

public class DataMerchant {
    static Merchant[] merc = new Merchant[0];

    public static Merchant[] tambahMerchant (Merchant nama){
        Merchant[] merch = new Merchant[DataMerchant.merc.length + 1];
        for (int i = 0; i < DataMerchant.merc.length; i++){
            merch[i] = merc[i];
        }
        merch[DataMerchant.merc.length] = nama;
        return merch;
    }

    public static void tampilData(){
        for (Merchant mch1 : merc) {
            System.out.println("=== Tampilan Data Merchant UBFOOD ===");
            System.out.println("Nama Merchant   : " + mch1.getNamaMerchant());
            System.out.println("Nama Produk     : " + mch1.getNamaProduk());
            System.out.println("Harga           : " + (int) mch1.getHargaMakanan());
        }
    }

    public static Merchant cariMerchant (String nama){
        int i = 0;
        for (int j = 0; j < DataMerchant.merc.length; j++){
            if (DataMerchant.merc[j].getNamaMerchant().equals(nama)){
                i = j;
                break;
            }
        } return merc[i];
    }

    public static void tampilMerchant (Merchant nama){
        System.out.println("=== Tampilan Data Merchant UBFOOD ===");
        System.out.println("Nama Merchant   : " + nama.getNamaMerchant());
        System.out.println("Nama Produk     : " + nama.getNamaProduk());
        System.out.println("Harga           : " + (int) nama.getHargaMakanan());
    }

    public static void updateMerchant (Merchant nama, String namaMerchant, String namaProduk, double hargaMakanan){
        nama.setNamaMerchant(namaMerchant);
        nama.setNamaProduk(namaProduk);
        nama.setHargaMakanan(hargaMakanan);
    }
}
