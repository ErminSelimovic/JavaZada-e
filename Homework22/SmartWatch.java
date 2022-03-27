package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class SmartWatch {

    Scanner scan = new Scanner(System.in);

    int id;
    public String imeSata;
    public String boja;
    public String brand;
    public boolean bluetoothConnect;
    Date time = new Date();

    public SmartWatch(int id, String imeSata, String boja, String brand, boolean bluetoothConnect) {
        this.id = id;
        this.imeSata = imeSata;
        this.boja = boja;
        this.brand = brand;
        this.bluetoothConnect = bluetoothConnect;
    }

    public void isConnected(){
        if (!bluetoothConnect){
            System.out.printf("%s nije konektovan\nŽelite li konektovati\n", imeSata);
            System.out.println("0-> NO  | 1-> YES\n");
            System.out.print("Odabir: ");
            int unos = scan.nextInt();
            switch (unos) {
                case 0 -> {
                    System.out.println("Konekcija odbijena");
                    bluetoothConnect = false;
                }
                case 1 -> {
                    System.out.println("Sat konektovan");
                    bluetoothConnect = true;
                }
                default -> {
                    System.out.println("Pogrešan unos, konekcija odbijena\n");
                    isConnected();
                }
            }
        }else{
            System.out.printf("Vaš %s je konektovan",imeSata);
        }
    }

    public void showTime(){
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss\n");
        System.out.printf("Trenutno vrijeme je %s", (formatter.format(time)));
    }

    public void showDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy\n");
        System.out.printf("Trenutni datum je %s", (formatter.format(time)));
    }

    public void dodatneOpcije(){
        System.out.print("""
                \nDodatne opcije:
                1.Prikaži vremensku prognozu
                2.Pusti muziku
                3.Prikaži vrijeme
                4.Prikaži datum
                """);
        if (bluetoothConnect){
            System.out.print("5.Diskonektuj Bluetooth");
        }else{
            System.out.print("5.Konektuj Bluetooth");
        }
        System.out.println();
        System.out.print("Odabir: ");
        int unos = scan.nextInt();
        switch (unos){
            case 1 -> showWeather();
            case 2-> playMusic();
            case 3-> showTime();
            case 4-> showDate();
            case 5->{
                if (bluetoothConnect){
                    System.out.printf("Vaš %s je diskonektovan",imeSata);
                    bluetoothConnect = false;
                    dodatneOpcije();
                }else{
                    System.out.printf("Vaš %s je konektovan",imeSata);
                    bluetoothConnect = true;
                    dodatneOpcije();
                }
            }
            default -> {
                System.out.println("Pogrešan unos, pokušajte opet!\n");
                dodatneOpcije();
            }
        }
    }

    private void playMusic() {
        System.out.println("Trenutno nema dodanih pjesama!");
        dodatneOpcije();
    }

    private void showWeather() {
        System.out.println("Vrijeme je odlično!");
        dodatneOpcije();
    }

}
