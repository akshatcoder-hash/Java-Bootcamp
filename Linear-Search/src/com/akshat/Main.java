package com.akshat;

public class Main {

    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -2, 16, 11, 28};
        int target = 19;
        int ans  = linearSearch (nums, target);
        System.out.println (ans);
	// write your code here
    }

    // search the target and return true or false
    static boolean linearSearch2(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return false;
        }

        // run a for loop
        for (int element : arr) {
            // check for element at every index if it is = target
            if (element == target) {
                return true;
            }

        }

        return false;
        // this line will execute if none of the return statements above have executed
        // hence the target not found

    }



    // search in the array: return the index if item found
    // otherwise return -1
    static int linearSearch(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++)
        {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target)
            {
                return index;
            }

        }

        return -1;
        // this line will execute if none of the return statements above have executed
        // hence the target not found
    }
}
