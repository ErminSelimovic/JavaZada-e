package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> groceriesList = new ArrayList<>();
        int unos = -1;
        System.out.println("Molimo vas unesite artikle za kupovinu.");

        do {

            System.out.print("Artikal: ");
            groceriesList.add(scan.nextLine());
            System.out.println("Upišite 1 za dodavanje novog artikla ili 0 da završite spisak.");

            unos = scan.nextInt();
            if (unos < 0 || unos > 1) {
                while (unos < 0 || unos > 1) {
                    System.out.println("Unos nije validan, unesite 1 za dalje, 0 za prekid");
                    unos = scan.nextInt();
                }
            }
            scan.nextLine();
        } while (unos != 0);

        System.out.println("Ovo je vaš spisak za kupovinu");
        for (String list : groceriesList) {
            System.out.println((groceriesList.indexOf(list) + 1) + "." + list);
        }


        do {
            System.out.println("Unesite broj artikla koji želite skinuti sa liste");
            System.out.print("Izbriši->");
            unos = scan.nextInt();
            if (unos > 0 && unos <= groceriesList.size()) {
                groceriesList.remove((unos) - 1);
                System.out.println();
            } else {
                System.out.println("\nMolimo vas unesite samo brojeve sa liste");
            }
            for (String list : groceriesList) {
                System.out.println((groceriesList.indexOf(list) + 1) + "." + list);
            }
        } while (groceriesList.size() > 0);

        System.out.println("Vaša lista za kupovinu je prazna, uživajte.");


    }
}
