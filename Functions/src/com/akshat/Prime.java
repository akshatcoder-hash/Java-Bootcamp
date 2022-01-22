package com.akshat;

import java.util.Scanner;

public class Prime {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt ();
        System.out.println (prime (n));

    }
    static boolean prime(int n)
    {
        int c = 2;
        while (c * c <= n)
        {
            if (n % c == 0)
            {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
