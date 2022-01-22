package com.akshat;

public class Overloading {
    public static void main (String[] args) {
       // fun (67);
        //fun ("Akshat");
        int ans = sum (3,4);
        System.out.println (ans);
    }

    static int sum(int a, int b)
    {
        return a + b;
    }
    static void fun(int a)
    {
        System.out.println ("First One");
        System.out.println (a);
    }

    static void fun(String name)
    {
        System.out.println ("Second one");
        System.out.println (name);
    }
}
