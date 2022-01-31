package com.company;

import java.util.Scanner;

public class Ex2_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0;i <=n; i++)
            System.out.print(i + " ");

        System.out.println();

        for(int i = 0; i <=n ;i++){
            if(i%2 ==1){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        for(int i = n; i>0 ;i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        for(int i = 0; i<=n ;i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
