package com.akshat;

import java.util.Scanner;

public class Maximum {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter first number: ");
        int a = in.nextInt ();
        System.out.println ("Enter 2nd no.: ");
        int b = in.nextInt ();
        System.out.println ("3rd no: ");
        int c = in.nextInt ();

        int x = largest (a, b, c);
        int y = smallest (a, b, c);

        System.out.println ("Largest of 3 nos is " +largest (a, b, c));
        System.out.println ("Smallest is " +smallest (a, b, c));
    }
    static int largest(int a, int b, int c) {
        int max = a;
        if (b > max)
        {
            max = b;
        }
        if (c > max)
        {
            max = c;
        }
        return max;
    }

    static int smallest(int a, int b, int c)
    {
        int min = a;
        if (b < min)
        {
            min = b;
        }
        if (c < min)
        {
            min = c;
        }
        return min;
    }
}
