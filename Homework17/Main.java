package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Prvi zadatak

        int[] nums = new int[10];
        System.out.println("Molimo Vas unesite 10 brojeva\n");
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("Unesite broj u niz[%d]-> ", i);
            nums[i] = scan.nextInt();
        }

        System.out.println("Unešeni niz je: " + Arrays.toString(nums));

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.printf("Suma niza je: %d", sum);


        //Drugi zadatak
        scan.nextLine();
        System.out.println("\nUnesite rečenicu po izboru");
        String textString = scan.nextLine();
        String textLower = textString.toLowerCase();
        int aInText = 0;
        for (char a : textLower.toCharArray()) {
            if (a == 'a') {
                aInText++;
            }
        }
        System.out.printf("U tekstu se nalazi %d slova \"a\"", aInText);


        //Treći zdatak
        System.out.print("\nUnesite godinu: ");
        int year = scan.nextInt();
        System.out.print("Unesite mjesec: ");
        int month = scan.nextInt();

        boolean isLeapYear;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeapYear = year % 400 == 0;
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(month + ". mjesec ima 31. dana");
            case 4, 6, 9, 30 -> System.out.println(month + ". mjesec ima 30. dana");
            case 2 -> {
                String text = isLeapYear ? month + ". mjesec u " + year + ".god ima 29. dana" : month + ". mjesec u " + year + ".god ima 28. dana";
                System.out.println(text);
            }
            default -> System.out.println("Mjesec ne postoji");
        }


    }
}
