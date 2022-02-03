package com.akshat;

public class OrderAgnosticBS {
    public static void main (String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int ans = orderAgnosticBS (arr, 22);
        System.out.println (ans);
    }

    static int orderAgnosticBS(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;

        // find whether array is ascending or descending
        boolean isAsc;
        isAsc = arr[start] < arr[end];


        while (start <= end)
        {
            //find the middle element
            // might be possible that (start+end) exceed integer range in Java.
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                if (target < arr[mid]) {
                    end = mid - 1;
                }  else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
