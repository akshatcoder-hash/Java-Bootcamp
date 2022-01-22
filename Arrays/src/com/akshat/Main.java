package com.akshat;

public class Main {

    public static void main(String[] args) {
	/*
	Syntax:
	datatype[] variable_name = new dataype[size];
	Q: Store 5 roll numbers:
	int[] rnos = new int[5];
	or directly
	int[] rnos2 = {23, 44, 5, 1, 3};
	 */
        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation: actually here, object is being created in the heap memory

        System.out.println (ros[1]);
        String[] arr = new String[4];
        System.out.println (arr[0]);

    }
}
