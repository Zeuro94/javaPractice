package com.company;

import java.util.ArrayList;

public class PalindromString {
    public static void main(String[] args) {
        String str1 = "adda";
        if(isPalindrom(str1))
            System.out.println("Palindrom");
        else System.out.println("Not Palindrom");
    }

    static boolean isPalindrom(String str)
    {
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
