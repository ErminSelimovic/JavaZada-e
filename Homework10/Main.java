package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("***********************\nImplicitni casting\n");
        byte num1 = 43;
        short num2 = num1;

        System.out.println("Byte to short: " + num2);

        int num3 = 243;
        double num4 = num3;
        System.out.println("Int to double " + num4);

        short num5 = 72;
        long num6 = num5;
        System.out.println("Short to long " + num6);

        double num7 = num1;
        System.out.println("Byte to double " + num7);

        short num8 = num5;
        System.out.println("Short to int " + num8);

        System.out.println("\n***********************\nEksplicitni casting\n");

        double ex1 = 23.4;
        int ex2 = 544;
        long ex3 = 1233;
        short ex4 = 21;
        float ex5 = 2384;

        System.out.println("Double to int " + ((int) ex1));
        System.out.println("Int to short " + ((short) ex2));
        System.out.println("Long to byte " + ((byte) ex3)); //Error
        System.out.println("Short to byte " + ((byte) ex4));
        System.out.println("Float to long " + ((long) ex5));

        System.out.println("\n***********************\nKorištenje wrapper klase\n");

        int wp1 = 4322;
        byte wp2 = 17;
        short wp3 = 82;
        String wp4 = "1224";
        String wp5 = "788992";

        Double wc1 = new Double(wp1);
        System.out.println("Int to double Wrapper class " + wc1);

        Short wc2 = new Short(wp2);
        System.out.println("Byte to Short Wrapper class " + wc2);

        Long wc3 = new Long(wp3);
        System.out.println("Short to Long wrapper class " + wc3);

        System.out.println("Int value from String " + Integer.valueOf(wp4));

        System.out.println("Long value from String " + Long.valueOf(wp5));

    }
}
