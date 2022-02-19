package com.company;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite dva broja broja(dozvoljeno je unjeti double) ");
        System.out.print("Num1=");
        double num1 = scanner.nextDouble();

        System.out.print("Num2=");
        double num2 = scanner.nextDouble();

        System.out.println("\nU nastavku sve aritmetičke operacije nad ova dva broja");
        double sabiranje = num1 + num2;
        double oduzimanje = num1 - num2;
        double mnozenje = num1 * num2;
        double dijeljenje = num1 / num2;
        double modul = num1 % num2;

        System.out.println("Zbir dva broja: " + sabiranje +
                "\nOduzimanje dva broja: " + oduzimanje +
                "\nMnoženje dva broja: " + mnozenje +
                "\nDijeljenje dva broja: " + dijeljenje +
                "\nModul dva broja: " + modul);

        System.out.println("Najveći broj između svih rezultata je: " +
                Math.max(Math.max(Math.max(sabiranje, oduzimanje), Math.max(mnozenje, dijeljenje)), modul)
        );

        System.out.print("\nUnesite jedan string: ");
        scanner.nextLine();
        String stringText = scanner.nextLine();
        int stringLength = stringText.length();
        System.out.println("Dužina stringa je " + stringLength + " slova\n" +
                "a korijen iz " + stringLength + " je " + Math.sqrt(stringText.length()));

        System.out.print("\nUnesite jedan (long) broj: ");
        long longNum = scanner.nextLong();
        String longToString = valueOf(longNum);

        System.out.println("Broj koji ste unjeli je: " + longNum +
                "\na dužina ovog broja kao string je " + longToString.length());
    }
}
