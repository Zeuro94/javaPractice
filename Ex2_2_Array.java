package com.company;

import java.util.Arrays;

public class Ex2_2_Array {
    public static void main(String[] args) {

        int[] A = {2, 100, 4, 18, 23};
        int[] B = {1, 9, 15, 100, 98, 18, 34, 44};
        reuniune(A, B);


    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void reuniune(int[] arr, int[] arr2) {
        sort(arr);
        sort(arr2);
        boolean flag = true;
        //int i = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.print(arr[i] + " ");
            flag = true;
        }
    }
    public static void printSort(int arr[]) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
