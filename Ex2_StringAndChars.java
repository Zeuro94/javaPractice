package com.company;

import java.util.Scanner;

public class Ex2_StringAndChars {
    public static void main(String[] args) {
        String text;
        String oldWord;
        String newWord;
        int appear = 0;

        Scanner scanner = new Scanner(System.in);

        text = scanner.nextLine();
        String[] textarray = text.split(" ");
        int[] control = new int[textarray.length];
        oldWord = scanner.nextLine();
        newWord = scanner.nextLine();

        for (int i = 0; i < textarray.length; i++) {
            for (int j = i; j < textarray.length; j++) {
                if (textarray[i].compareTo(textarray[j]) == 0) {
                    control[i]++;
                }

            }

        }
        /// test
        int[] idx = {0,0};
        boolean flagFirst = false, flagLast = false;
        for(int i =0; i < textarray.length/2 ; i++)
        {
            if(textarray[i].compareTo(oldWord) == 0 &&
                flagFirst == false)
            {
                flagFirst = true;
                idx[0]= i;
            }
            if(textarray[textarray.length-i -1].compareTo(oldWord) == 0 &&
                    flagFirst == false)
            {
                flagLast = true;
                idx[1]= textarray.length-i - 1;
            }

        }
        System.out.print("idx = " + idx[0]);
        System.out.print("idx = " + idx[1]);
        for(int i =0; i < textarray.length; i++)
        {
            if(textarray[i].compareTo(oldWord) == 0 &&
               idx[0] != i &&
                idx[1] != i )
            {
                textarray[i] = newWord;
            }
        }


        for (int i = 0; i < textarray.length; i++) {
            System.out.print(textarray[i] + " " + control[i]);
        }

    }
}



