package com.company;

import java.util.Scanner;

public class Ex1_For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr;
        String mesaj;


        System.out.println("Mesaj");
        mesaj = scanner.nextLine();

        System.out.println("Nr");
        nr= scanner.nextInt();

        for(int i = 1;i <= nr;i++){
            System.out.println(i + "." + " " + mesaj);
        }
    }
}
