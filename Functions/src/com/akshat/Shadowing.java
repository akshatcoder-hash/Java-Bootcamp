package com.akshat;

public class Shadowing {
    static int x = 90; // this will be shadowed at line 8
    public static void main (String[] args) {
        System.out.println (x); // 90
        int x; // the class variable at line 4 is shadowed by this x
        // Scope will begin when the value is initialised
        x = 40;
        System.out.println (x); // 40
        fun ();
    }
    static void fun()
    {
        System.out.println (x);
    }
}
