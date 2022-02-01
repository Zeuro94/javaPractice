package com.company;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibo(6));
        System.out.println(Fibo(5));
    }

    public static int Fibo(int nr){
        if(nr <= 1) {
            return nr;
        }
        return Fibo(nr - 1) + Fibo(nr -2);
    }
}
