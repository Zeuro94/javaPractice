package com.company;

import java.util.Scanner;

public class SirNumere_Ex2While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int control = 0;
        int i = 1;

        while(control <= n)
        {
            System.out.print(control + " ");
            control++;
        }
        control =0;
        System.out.println("");

        while (control <=n ){
            if(control%2==1)
            System.out.print(control + " ");
            control++;
        }
        control =n;
        System.out.println("");

        while (control>=0){
            if(control%2==0){
                System.out.print(control + " ");}
            control--;
        }

        control =0;
        System.out.println("");

        while (n>=control){
            if(control%5==0)
                System.out.print(control + " ");
            control++;
        }
    }
}


