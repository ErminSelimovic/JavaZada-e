package com.company;

import java.util.Scanner;

public class ProvjeraDvaStringa {

    public static void unesiDvaStringa(){

        Scanner scans = new Scanner(System.in);
        System.out.println("Unesite prvi string");
        String string1 = scans.nextLine();

        System.out.println("Unesite drugi string");
        String string2 = scans.nextLine();

        String[] arrString1 = string1.split(" ");
        String[] arrString2 = string2.split(" ");

        int brojIstih = 0;
        for (int i = 0; i < arrString1.length;i++){

            for (int j = 0;j<arrString2.length;j++){
                if (arrString1[i].contentEquals(arrString2[j])){
                    brojIstih++;
                }
            }


        }
        if (brojIstih>2){
            System.out.println("Prvi string sadrži drugi");
        }else{
            System.out.println("Prvi string ne sadrži drugi");
        }


    }


}
