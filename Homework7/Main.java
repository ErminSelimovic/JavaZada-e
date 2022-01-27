package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.print("\nCalculating the area and volume of squares\n");
        System.out.print("int a=3; \nV=a*a*a; \nV=3*3*3 \nV=27;\n");

        String bookName = "Origin";
        String authorName = "Dan Brown";

        System.out.println("\nBook name " + bookName + " - " + "Author name " + authorName);

        ////////Provjera da li je string numerički
        System.out.println("\n");
        String strNumber1 = "2022";
        String strNumber2 = "20nn";
        boolean ceckIsDigit1 = isNumberic(strNumber1);
        boolean ceclOsDigit2 = isNumberic(strNumber2);

        if (ceckIsDigit1) {
            System.out.println("String je numerički i njegova vrijednost je "+strNumber1);
        } else {
            System.out.println("String nije numerički i on izgleda ovako "+strNumber1);
        }

        if (ceclOsDigit2) {
            System.out.println("String je numerički i njegova vrijednost je "+strNumber2);
        } else {
            System.out.println("String nije numerički i on izgleda ovako "+strNumber2);
        }


    }

    private static boolean isNumberic(String strNumber) {
        if (strNumber == null || strNumber.length() == 0) {
            return false;
        }
        return strNumber.chars().allMatch(Character::isDigit);
    }
}
