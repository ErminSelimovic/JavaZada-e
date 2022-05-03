package com.company;

import java.util.Scanner;

public class MnozenjeTriBroja {

    public static void unesiTriBroja(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Unesite broj 1: ");
        int broj1 = scan.nextInt();

        System.out.print("Unesite broj 2: ");
        int broj2 = scan.nextInt();

        System.out.print("Unesite broj 3: ");
        int broj3 = scan.nextInt();

        mnozenjeTriBroja(broj1, broj2, broj3);

    }

    private static void mnozenjeTriBroja(int broj1, int broj2, int broj3) {
        int rezultat = Math.multiplyExact(Math.multiplyExact(broj1, broj2),broj3);

        System.out.println("Rezultat množenja tri broja: "+rezultat);
    }

}
