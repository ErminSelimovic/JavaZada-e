package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Prvi zadatak
        int charNum = 0;
        int nums = 0;
        int symbols = 0;

        System.out.print("Molimo Vas unesite jedan string: ");
        String text = scan.nextLine();

        int allChar = text.length();

        while (!(allChar == 0)) {
            for (char i : text.toCharArray()) {
                if (Character.isLetter(i)) {
                    charNum++;
                }
                if (Character.isDigit(i)) {
                    nums++;
                }
                if (!(Character.isDigit(i)) && !(Character.isLetter(i))) {
                    symbols++;
                }
                allChar--;
            }
        }

        System.out.println("Karaktera: " + charNum);
        System.out.println("Brojeva: " + nums);
        System.out.println("Ostalih znakova: " + symbols);


        //Drugi zadatak


        StringBuilder div3 = new StringBuilder();
        StringBuilder div5 = new StringBuilder();
        StringBuilder div3and5 = new StringBuilder();

        int numStart = 1;

        while (numStart <= 100) {

            if (numStart % 3 == 0) {
                div3.append(",").append(numStart);
                if (numStart % 5 == 0) {
                    div3and5.append(",").append(numStart);
                }
            }
            if (numStart % 5 == 0) {
                div5.append(",").append(numStart);
            }

            numStart++;
        }
        System.out.println();
        System.out.println("Djeljivi sa 3: " + div3.substring(1));
        System.out.println("Djeljivi sa 5: " + div5.substring(1));
        System.out.println("Djeljivi sa 3 i 5: " + div3and5.substring(1));
        System.out.println();

        //Treći zadatak
        
        int sum = 0;
        int num;
        int i = 0;

        System.out.println("Molim vas unesite broj od 5 do 10");

        while (i < 5) {

            System.out.print(i + 1 + ".Broj: ");
            num = scan.nextInt();
            if (num > 4 && num < 11) {
                sum += num;
                i++;
            } else {
                System.out.print("Greška, broj nije u traženom opsegu\nMolim vas unesite broj od 5 do 10\n");
            }
        }

        double prosjek = (double) sum / 5;

        if (prosjek <= 5) {
            System.out.printf("Vaš prosjek je %.1f nažalost niste položli, potrudite se više.", prosjek);
        } else if (prosjek >= 6 && prosjek < 7) {
            System.out.printf("Vaš prosjek je %.1f položili ste ali može bolje.", prosjek);
        } else if (prosjek >= 7 && prosjek < 8) {
            System.out.printf("Vaš prosjek je %.1f položili ste.", prosjek);
        } else if (prosjek >= 8 && prosjek < 9) {
            System.out.printf("Vaš prosjek je %.1f položili ste. Vidi se vaš trud", prosjek);
        } else if (prosjek >= 9 && prosjek < 10) {
            System.out.printf("Vaš prosjek je %.1f položili ste. Zadovoljni smo vašim napretkom", prosjek);
        } else if (prosjek == 10) {
            System.out.printf("Vaš prosjek je %.1f Vaš rad je oduševljavajući", prosjek);
        }

    }
}
