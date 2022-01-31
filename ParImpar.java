package com.company;

import java.util.ArrayList;

public class ParImpar {
    public static void main(String[] args) {
        int numbers[] = {1,2,4,6,8,10,100,101};

        System.out.println("par: " + par(numbers));
        System.out.println("impar: " + impar(numbers));
     }

    public static ArrayList<Integer> par(int[] nrs){
        ArrayList<Integer> nrpar = new ArrayList<Integer>();

        for(int i=0; i<nrs.length; i++){
            if(nrs[i] % 2 == 0)
                nrpar.add(nrs[i]);
        }
        return nrpar;
    }

    public static ArrayList<Integer> impar(int[] nrs){
        ArrayList<Integer> nrimpar = new ArrayList<Integer>();

        for(int i=0; i<nrs.length; i++){
            if(nrs[i] % 2 == 1)
                nrimpar.add(nrs[i]);
        }
        return nrimpar;
    }
}
