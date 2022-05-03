package com.company;

import java.util.Scanner;

public class CetriCijelaBroja {


    public static void unesi4cijelaBroja() {
        Scanner scan = new Scanner(System.in);
        int[] broj = new int[4];
        for (int i = 0; i < 4; i++) {
            broj[i] = scan.nextInt();
        }

        provjeriBrojeve(broj);
    }

    private static void provjeriBrojeve(int[] broj) {
        if (broj[0] != broj[1]) {
            System.out.println("Brojevi nisu isti");

        } else if (broj[2] != broj[3]) {
            System.out.println("Brojevi nisu isti");

        } else if (broj[1] != broj[2]) {
            System.out.println("Brojevi nisu isti");

        } else {
            System.out.println("Brojevi su isti");
        }
    }


}
