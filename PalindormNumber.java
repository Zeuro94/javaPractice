package com.company;

public class PalindormNumber {
    public static void main(String[] args) {
        Palindrom(5555);
        Palindrom(432423);
        Palindrom(010);
    }

    public static void Palindrom(int nr) {
        int buffer = nr;
        int rest;
        int suma = 0;
        while (nr > 0) {
            rest = nr % 10;
            suma = (suma * 10) + rest;
            nr = nr / 10;
        }
        if (buffer == suma)
            System.out.println("Nr este palindrom");
        else
            System.out.println("Nr nu este palindrom");
    }
}
