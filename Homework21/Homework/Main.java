package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> dodajGradiDrzavu = dodajGradiDrzavu();

        provjeraGrada(dodajGradiDrzavu);

    }

    //METODE
    private static HashMap<String, String>dodajGradiDrzavu() {
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> dodajGradiDrzavu = new HashMap<>();
        int izbor;
        do {
            System.out.print("Unesite grad: ");
            String grad = scan.nextLine();
            System.out.print("Unesite državu: ");
            String drzava = scan.nextLine();
            dodajGradiDrzavu.put(grad, drzava);
            System.out.println("\n1. Dodaj novi unos\n0. Završi unos");
            izbor = scan.nextInt();

            while (izbor > 1 || izbor < 0) {
                if (izbor > 1) {
                    System.out.println("Pogrešan unos, pokušajte ponovo");
                    System.out.println("\n1. Dodaj novi unos\n0. Završi unos");
                    izbor = scan.nextInt();
                }
                if (izbor == 0) {
                    System.out.println("To je to, Hvala");
                }
            }
            scan.nextLine();
            if (izbor == 0) {
                System.out.println("To je to, Hvala");
            }

        } while (izbor == 1);
        return dodajGradiDrzavu;
    }

    private static void provjeraGrada(HashMap<String, String> dodajGradiDrzavu) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Koji grad želite posjetiti?");
        String posjetitiGrad = scan.nextLine();
        boolean postoji = false;
        for (String gradFind : dodajGradiDrzavu.keySet()) {
            if (gradFind.equals(posjetitiGrad)) {
                System.out.printf("Odlično, vaš grad %s se nalazi u %s", gradFind, dodajGradiDrzavu.get(gradFind));
                postoji = true;
                break;
            }
        }
        if (!postoji){
            System.out.printf("Vaš unos %s se ne nalazi u našoj bazi!", posjetitiGrad);
        }

    }
}
