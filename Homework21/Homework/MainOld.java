package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map<String, String> gradIDrzava = new HashMap<>();

        dodajGradiDrzavu(gradIDrzava);
        provjeraGrada(gradIDrzava);

    }

    //METODE
    private static void dodajGradiDrzavu(Map<String, String> gradIDrzava) {
        Scanner scan = new Scanner(System.in);
        int izbor;
        do {
            System.out.print("Unesite grad: ");
            String grad = scan.nextLine();
            System.out.print("Unesite državu: ");
            String drzava = scan.nextLine();
            gradIDrzava.put(grad, drzava);
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
    }

    private static void provjeraGrada(Map<String, String> gradIDrzava) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Koji grad želite posjetiti?");
        String posjetitiGrad = scan.nextLine();
        boolean postoji = false;
        for (String gradFind : gradIDrzava.keySet()) {
            if (gradFind.equals(posjetitiGrad)) {
                System.out.printf("Odlično, vaš grad %s se nalazi u %s", gradFind, gradIDrzava.get(gradFind));
                postoji = true;
                break;
            }
        }
        if(!postoji){
            System.out.printf("Vaš unos %s se ne nalazi u našoj bazi!", posjetitiGrad);
        }
    }
}
