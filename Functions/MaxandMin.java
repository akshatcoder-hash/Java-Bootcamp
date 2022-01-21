package com.akshat;


import java.util.Scanner;

public class MaxandMin {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Enter number 1");
        int a = in.nextInt ();
        System.out.println ("Enter number 1");
        int b = in.nextInt ();
        System.out.println ("Enter number 1");
        int c = in.nextInt ();

        System.out.println ("Largest among 3 is : ");
        System.out.println (Max (a,b,c));
        System.out.println ("Minimum is: ");
        System.out.println (Min (a, b, c));

    }
    static int Max(int a, int b, int c)
    {
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

    static int Min(int a, int b, int c)
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

