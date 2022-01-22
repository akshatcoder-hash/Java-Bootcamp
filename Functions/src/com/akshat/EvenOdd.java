package com.akshat;

import java.util.Scanner;

public class EvenOdd {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt ();
        System.out.println (even (a));
    }
    static boolean even(int a) {
        boolean result = false;
        if (a % 2 == 0) {
            result = true;
        }
        return result;
    }
}
