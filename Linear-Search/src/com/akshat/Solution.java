package com.akshat;


import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter a number");
        int n = in.nextInt ();
        if (n == 0)
        {
            System.out.println (n + "! = 0");
        }
        else
            System.out.println (Factorial (n));

    }
    static int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i < n; i++) {
            fact *= i;
        }
        return fact;
    }


}
