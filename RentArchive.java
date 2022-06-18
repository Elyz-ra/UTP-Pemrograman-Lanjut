package com.company;
import java.util.ArrayList;

public class RentArchive {

    ArrayList<CarRent> rentData = new ArrayList<>();

    public void Rent(CarRider rider, Car car, int rentDur){

        CarRent newCarRent = new CarRent(rider,car,rentDur);
        rentData.add(newCarRent);

        if(car.isStatus()){
            System.out.println("Mobil berhasil disewa");
            car.setStatus("false");
        } else {
            System.out.println("Maaf, mobil sudah disewa");
            car.setStatus("true");
        }
    }

    public void info(){

        System.out.println("---------------------------------------------");
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("---------------------------------------------");

        for(CarRent rent : rentData){

            //buat ngetes aja
            System.out.println(rent.getCar().isStatus());

            System.out.println("NAMA PEMINJAM   : " + rent.getRider().getName());
            System.out.println("TIPE MOBIL      : " + rent.getCar().getCarType());
            System.out.println("NO POLISI       : " + rent.getCar().getPolNum());
            System.out.println("LAMA RENTAL     : " + rent.getRentDur());
            System.out.println("---------------------------------------------");

        }
    }
}
