package com.company;

import java.util.Scanner;

public class dvijeDoubleVrijednosti {

    public static void unesiDoubleVrijednosti(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Unesite prvu double vrijednost:");
        double b1 = scan.nextDouble();
        System.out.print("Unesite drugu double vrijednost:");
        double b2 = scan.nextDouble();

        if (b1>0.0 && b1<=1.0 && b2>0.0 && b2<=1.0){
            System.out.println("Brojevi se nalaze između 0.0 i 1.0");
        }else{
            System.out.println("Brojevi nisu unutar traženih vrijednosti");
        }

    }

}
