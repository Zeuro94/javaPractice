package com.company;

import java.util.Scanner;

public class Ex3_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];
        int n = sc.nextInt();
        int counterPoz = 0;
        int counterNeg = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (array[i] >= 0) {
                counterPoz++;
            }
            else {
                counterNeg++;
            }
        }
        System.out.println("Numere pozitive: " + counterPoz);
        System.out.println("Numere negative: " + counterNeg);
    }
}
