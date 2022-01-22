package com.akshat;

public class Scope {
    public static void main (String[] args) {
        int a = 10;
        int b = 20;
        String name = "Akshat";
        {
               // int a = 78;           // already initialised outside the block in the same method
            a = 100;
            name = "Ojus"; // reassign the original reference variable to some other value
            int c = 99;
                 // values initialized in this block will remain upto this only
        }
        System.out.println (a);
        System.out.println (name);
        // scoping in for loops
        for (int i = 0; i < 4; i++)
        {
            System.out.println (i);
        }

    }
    static void random(int marks)
    {
        int num = 67;
        System.out.println (num);
        System.out.println (marks);
    }
}
