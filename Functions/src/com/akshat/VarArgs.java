package com.akshat;

import java.util.Arrays;

public class VarArgs {
    public static void main (String[] args) {
        fun (2,3, 4, 5, 67, 57);
        multiple (2, 3, "Akshat", "Ojus");

    }

    static void demo(int ...v)
    {
        System.out.println (Arrays.toString (v));
    }

    static void multiple(int a, int b, String ...v)
    {
        System.out.println (Arrays.toString (v));
    }

    static void fun(int ...v) // internally, taking an array of integers
    {
        System.out.println (Arrays.toString (v));
    }
}
