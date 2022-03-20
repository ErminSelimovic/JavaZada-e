package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);

        System.out.println("Unesite broj za koji želite dobiti tablicu množenja");
        System.out.print("Broj: ");
        int num = scan.nextInt();
        tablicaMnozenja(num);

        //*******************************************//

        scan.nextLine();
        System.out.println("\nMolimo Vas unesite jedan string");
        String textString = scan.nextLine();
        splitString(textString);
        System.out.println();
	    
        //*******************************************//
	    
        System.out.println("\nMolimo Vas unesite godinu");
        System.out.print("Godina: ");
        int year = scan.nextInt();

        System.out.print("\nMolimo Vas unesite jedan broj od 1-12");
        int month = 0;
        System.out.print("\nMjesec: ");
        while (month < 1 || month > 12) {
            month = scan.nextInt();
            if (month < 0 || month > 12) {
                System.out.println("Greška, nedozvoljen unos, pokušajte ponovo.");
                System.out.print("Mjesec: ");
            }
        }
        returnMonth(month, year);

        //*******************************************//

    }

    private static void returnMonth(int month, int year) {
        String monthName = "Unknown";
        int numberOfDays = 0;
        String nameDays = " dana";
        switch (month) {
            case 1 -> {
                monthName = "Januar";
                numberOfDays = 31;
            }
            case 2 -> {
                monthName = "Februar";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }
            }
            case 3 -> {
                monthName = "Mart";
                numberOfDays = 31;
            }
            case 4 -> {
                monthName = "Arpil";
                numberOfDays = 30;
            }
            case 5 -> {
                monthName = "Maj";
                numberOfDays = 31;
            }
            case 6 -> {
                monthName = "Juni";
                numberOfDays = 30;
            }
            case 7 -> {
                monthName = "Juli";
                numberOfDays = 31;
            }
            case 8 -> {
                monthName = "August";
                numberOfDays = 31;
            }
            case 9 -> {
                monthName = "Septembar";
                numberOfDays = 30;
            }
            case 10 -> {
                monthName = "Oktobar";
                numberOfDays = 31;
            }
            case 11 -> {
                monthName = "Novembar";
                numberOfDays = 30;
            }
            case 12 -> {
                monthName = "Decembar";
                numberOfDays = 31;
            }
        }
        if (numberOfDays == 31) {
            nameDays = " dan";
        }
        System.out.println(monthName + " - " + year + ".god ima " + numberOfDays + nameDays);

    }

    public static void splitString(String textString) {
        String[] textArr = textString.split(" ");
        for (int i = 0; i < textArr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(textArr[i].toUpperCase() + " ");
            } else {
                System.out.print(textArr[i].toLowerCase() + " ");
            }
        }
    }

    public static void tablicaMnozenja(int num) {
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%s*%s=%d\n", num, i, (num * i));
        }
    }
}
