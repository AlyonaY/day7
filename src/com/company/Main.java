package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

       /* String strInt = "123";
        String strDbl = "123.45";
        int x;
        double y;
        x = Integer.parseInt(strInt);
        y = Double.parseDouble(strDbl);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        strInt = String.valueOf(x +1);
        strDbl = String.valueOf(y + 1);
        System.out.println("strInt=" + strInt);
        System.out.println("strDbl=" + strDbl);
        String str;
        str = "num=" + 365;
        System.out.println(str);*/

        /*int[] a = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println(" ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
        System.out.println(" ");
        for (int i : a) {
            System.out.print(i);
        }
        System.out.println(" ");

        Arrays.stream(a)
                .map(s -> s * 2)
                .forEach(System.out::print);
        System.out.println(" ");

        System.out.println(Arrays.toString(a));*/

        /*int[][] a = {{1, 2, 3,},
                {4, 5, 6},
                {7, 8, 9,}};
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }*/

        int[] mas = {1, 5, 4, 6, 9, 7};
        int[] mas2 = {4, 8, 5, 6, 9};
        show(mas);
        invert(mas);
        show(mas);
        invert(mas2);
        show(mas2);

        bubble(mas);
        show(mas);
        bubble(mas2);
        show(mas2);
    }

    private static void bubble(int[] mas) {
        for (int bar = mas.length-1; bar >0; bar--) {
            for (int i = 0; i < bar; i++) {
                if (mas[i] > mas[i + 1]) {
                    int tmp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = tmp;
                }
            }
        }
    }

    private static void show(int[] mas) {
        for (int io : mas) {
            System.out.print(io + " ");
        }
        System.out.println(" ");
    }

    private static void invert(int[] mas) {
        for (int i = 0; i < mas.length/2; i++) {
            int tmp = mas[i];
            mas [i] = mas [mas.length - i -1];
            mas [mas.length - i -1] = tmp;
        }
    }
}
