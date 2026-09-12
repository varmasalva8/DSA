package com.cgf;

public class DEMOLinearsearch {
    public static void main(String[] args) {
        int[]arr=new int[100];
       // int[] arr = { 10, 20, 30, 40, 50 };
        int target = 40;
        int result = linearSearch(arr, target);
        int result1 = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }


    }

    public static int linearSearch(int[] arr, int target) {
int step=0;
        for (int i = 0; i < arr.length; i++) {
            step++;
            if (arr[i] == target) {
                System.out.println("Linear Search: " + step);
                return i;
            }
        }
        System.out.println("Linear Search: " + step);
        return -1;
    }
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int step=0;

        while (low <= high) {
                step++;
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("Step Binary Search: " + step);
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Step Binary Search: Element" + step);
        return -1;
    }
}
