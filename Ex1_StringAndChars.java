package com.company;

public class Ex1_StringAndChars {
    public static void main(String[] args) {
        String str = "This game was fun to play!";
        char array[] = str.toCharArray();
        int[] frecventa = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            frecventa[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (array[i] == array[j]) {
                    frecventa[i]++;
                    array[j] = 0;
                }
            }
        }

        for (int i = 0; i < frecventa.length; i++) {
            if(array[i] != 0)
            System.out.println("Character:" + array[i] + " appears: " + frecventa[i]);
        }
    }
}
