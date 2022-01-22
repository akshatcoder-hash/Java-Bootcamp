package com.akshat;

public class Swap {
    public static void main (String[] args) {
        int a = 10;
        int b = 20;

        // swap two numbers
//        int temp = a;
//        a = b;
//        b = temp;
        swap (a, b);

        System.out.println (a + " " + b);

        String name = "Akshat";
        changeName(name);
        System.out.println (name);
        // String is immutable

    }

     static void changeName (String name) {
        name = "Ojus";
    }

    static void swap(int a , int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
}
