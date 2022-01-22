package com.akshat;

import java.util.Scanner;

public class Sum {
    public static void main (String[] args) {

//        int ans = sum2 ();
//        System.out.println (ans);
        int ans = sum3 (20,30);
        System.out.println (ans);

        /*
         return_type name() {
        // body
        return statement;
        }
         */
        // return the value
    }
    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b)
    {
        int sum = a + b;
        return sum;
    }


    static int sum2()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println ("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num2 + num1;
        return sum;

    }

    static void sum()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println ("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num2 + num1;
        System.out.println ("The sum = "+ sum);
    }
}
