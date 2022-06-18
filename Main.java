package com.company;

public class Main {

    public static void main(String[] args) {
	 CarRider Diluc = new CarRider("Diluc",33,"08000000000");
     CarRider Ning = new CarRider ("Ningguang",37,"081111111111");
     CarRider Keqing = new CarRider ("Keqing",30,"081222222222");
     CarRider Kazu = new CarRider ("Kazuha",22,"081233333333");

     CarData data = new CarData ();
     data.addCar ("SUV", "N 1111 AB", "Honda");
     data.addCar ("SPORT", "N 2222 AB", "SSC Tuatara");
     data.addCar ("TRUCK", "N 3333 AB", "Suzuki");
     data.addCar ("SPORT", "N 4444 AB", "Honda");

     data.listOfCar ();

     RentArchive arsip = new RentArchive();
     arsip.Rent(Diluc, data.carList.get(2), 6);
     arsip.Rent(Ning, data.carList.get(0), 3);
     arsip.Rent(Keqing, data.carList.get(1), 1);
     arsip.Rent(Kazu, data.carList.get(1), 2);

     System.out.println(" ");
     arsip.info();

    }
}
