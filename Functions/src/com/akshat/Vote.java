package com.akshat;

import java.util.Scanner;

public class Vote {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt ();
        if (age (a)) {
            System.out.println ("Eligible");
        } else {
            System.out.println ("Not Eligible");
        }
    }
    static boolean age(int a)
    {
        return a >= 18;
    }
}
