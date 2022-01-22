package com.akshat;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        // Syntax
        ArrayList <Integer> list = new ArrayList<> (10);

//        list.add (67);
//        list.add (627);
//        list.add (675);
//        list.add (647);
//        list.add (671);

//        list.remove (2);



        //input
        for (int i = 0; i < 5; i++)
        {
            list.add (in.nextInt());
        }
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println (list.get (i));
        }
    }
}
