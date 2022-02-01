package com.company;

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber(25);
        PrimeNumber(41);
    }

    public static void PrimeNumber(int nr) {
        boolean flag = false;
        for (int i = 2; i <= nr / 2; ++i) {
            if (nr % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(nr + " Nr nu este prim");
        else
            System.out.println(nr + " Nr este prim");
    }
}
