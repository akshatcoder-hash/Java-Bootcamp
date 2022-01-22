package com.akshat;


import java.util.Scanner;

public class Palindrome {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt ();
        int son = 0;
        while (n != 0) {


            int rem = n / 10;
            son = son + n;
        }

        System.out.println (isPalindrome (n));

    }




        static boolean isPalindrome(int son)
        {
            int sum = 0, temp = son;
            while (son != 0)
            {
               int r = son % 10;
                sum = (sum*10) + r;
                son = son / 10;
            }
            return (temp == sum);
        }

}
