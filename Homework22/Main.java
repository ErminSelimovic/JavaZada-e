package com.company;

public class Main {

    public static void main(String[] args) {

        SmartWatch sat1 = new SmartWatch(1,"Watch GT2","Crna","Huawei",true);
        System.out.printf("Vaš uređaj je %s branda %s boja %s i trenutno %s",sat1.imeSata,sat1.brand, sat1.boja,
                ((sat1.bluetoothConnect) ? "je konektovan" : "nije konektovan"));
        sat1.isConnected();
        sat1.showTime();
        sat1.showDate();
        sat1.dodatneOpcije();

    }
}
