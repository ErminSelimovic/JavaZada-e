package com.company;

public class Main {

    public static void main(String[] args) {

        SmartWatch sat1 = new SmartWatch(1,"Watch GT2","Crna","Huawei",false);

        sat1.isConnected();
        sat1.showTime();
        sat1.showDate();
        sat1.dodatneOpcije();

    }
}
