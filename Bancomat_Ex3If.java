package com.company;

import java.util.Scanner;

public class Bancomat_Ex3If {
    public static void main(String[] args) {
        final int pinCorect = 1234;
        int soldCont = 7500;
        int sumaDeExtras;
        int pinClient;
        int alegere = 0;

        System.out.println("Introduceti cod pin: ");
        Scanner scanner = new Scanner(System.in);
        pinClient = scanner.nextInt();
        if (pinClient == pinCorect) {
            System.out.println("PIN Corect");
        } else {
            System.out.println("Pin Incorect");
            System.exit(0);
        }


        System.out.println("Introduceti suma de extras: ");
        sumaDeExtras = scanner.nextInt();
        while (sumaDeExtras == 0) {
            System.out.println("Suma: " + sumaDeExtras + " lei nu poate fi extrasa");
            System.out.println("Introduceti o noua suma: ");
            sumaDeExtras = scanner.nextInt();
        }

        if (sumaDeExtras <= soldCont) {
            System.out.println("Tranzactie in curs de procesare...");
            soldCont = soldCont - sumaDeExtras;
        } else {
            System.out.println("Fonduri insuficiente");
            System.exit(0);
        }

        System.out.println("Doriti afisarea noii balante a contului curent? Raspundeti cu 0 (NU) sau 1 (DA)");
        alegere = scanner.nextInt();
        if (alegere == 1) {
            System.out.println("Noul sold este: " + soldCont);
        }
        else
            System.out.println("Multumim pentru ca ati ales Banca DevBank");

    }
}

