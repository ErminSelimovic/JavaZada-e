package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite jednu riječ: ");
        String text = scanner.nextLine();


        //Prvi način
        if (text.substring(0,3).contains("Naj") || text.substring(0,3).contains("naj")){
            System.out.println("You are using a superlative in Bosnian");
        }else{
            System.out.println("It's a regular word.");
        }

        //Drugi način
        /*
        text=text.toUpperCase();
        boolean prvaTriSlova = text.startsWith("NAJ");
        if (prvaTriSlova){
            System.out.println("You are using a superlative in Bosnian");
        }else{
            System.out.println("It's a regular word.");
        }
        */

        /*
        Treći, najkomplikovaniji način

        if (text.charAt(0) == 'n' || text.charAt(0) == 'N') {
            if (text.charAt(1) == 'a' || text.charAt(1) == 'A') {
                if (text.charAt(2) == 'j' || text.charAt(2) == 'J') {
                    System.out.println("You are using a superlative in Bosnian");
                }
            }
        } else {
            System.out.println("It's a regular word, " + text);
        }
        */


        System.out.println("Unesite 5 bojeva do 10");
        System.out.print("Prvi: ");
        int a = scanner.nextInt();
        System.out.print("Drugi: ");
        int b = scanner.nextInt();
        System.out.print("Treći: ");
        int c = scanner.nextInt();
        System.out.print("Četvrti: ");
        int d = scanner.nextInt();
        System.out.print("Peti: ");
        int e = scanner.nextInt();

        int avg = ((a + b + c + d + e) / 5);
        switch (avg) {
            case 5:
                System.out.println("The average is 5, you are not pass the exam.");
                break;
            case 6:
                System.out.println("The average is 6, you are pass the exam, but" + " you can do better.");
                break;
            case 7:
                System.out.println("The average is 7, you are pass the exam.");
                break;
            case 8:
                System.out.println("The average is 8, you are pass the exam, your effor t is good");
                break;
            case 9:
                System.out.println("The average is 9, you are pass the exam, we are proud of you.");
                break;
            case 10:
                System.out.println("The average is 10, you are pass the exam, yours exam was briliant.");
                break;
        }


        double weight, height;

        System.out.print("\nUnesite vaše kilograme\nKilogrami(kg)(npr.82.2): ");
        weight = scanner.nextDouble();
        System.out.print("Unesite vašu visinu u cm\nVisina(cm): ");
        height = scanner.nextDouble();

        double metres = height / 100;
        double bmi = weight / Math.pow(metres, 2);
        if (bmi < 18.5) {
            System.out.printf("Your BMI is -> %.2f You are under weight", bmi);
        } else if (bmi > 18.5 && bmi < 24.9) {
            System.out.printf("Your BMI is -> %.2f You are normal weight", bmi);
        } else if (bmi > 25 && bmi < 29.9) {
            System.out.printf("Your BMI is -> %.2f You are over weight", bmi);
        } else {
            System.out.printf("Your BMI is -> %.2f You are obesit", bmi);
        }

    }
}
