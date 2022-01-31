package com.company;

import java.util.Scanner;

public class Limite_Ex4While {
    public static void main(String[] args) {
        int upperLimit;
        int decrementare;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul");
        upperLimit = scanner.nextInt();
        System.out.println("Introduceti valoarea de decrementare");
        decrementare = scanner.nextInt();
        System.out.println("Start counting");

        while(upperLimit >=0){
            System.out.println("Urmatorul numar este: " + upperLimit);
            upperLimit = upperLimit -decrementare;
        }
    }
}
