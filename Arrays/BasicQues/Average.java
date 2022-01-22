package com.akshat;


import java.util.Scanner;

public class Average {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter the numbers of data:");
        int N = in.nextInt ();
        float[] arr = new float[N];
        int i;
        int sum = 0;
        for (i = 0; i < arr.length; i++) {
            System.out.print ("Enter number: ");
            arr[i] = in.nextFloat ();

            sum += arr[i];
        }

        
        float avg = sum / N;
        System.out.println (avg);

    }







}
