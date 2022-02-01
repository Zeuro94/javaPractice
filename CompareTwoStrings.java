package com.company;
   /*
    3. Implementeaza o metoda int compareTwoStrings(String str1, String str2)
    care primeste ca parametri 2 siruri de caractere si compara cele 2 String-uri.
     Metoda va avea un comportament similar cu metoda int compareTo(String anotherString)
     adica trebuie sa returneze:
o valoare negativa (ex: -1) daca str1 < str2
0 daca str1 == str2
o valoare pozitiva (ex: +1) daca str1 > str2
In implementarea metodei nu poti folosi metodele de comparare ale clasei String.
3.1. Implementeaza de aceasta data metoda int compareTwoStringsIgnoreCase(String str1, String str2).
Specificatiile de functionare si constrangerile anterioare se mentin.
     */


public class CompareTwoStrings {
    public static void main(String[] args) {

        System.out.print(compareTwoStrings("ssda", "sds2a"));


    }

    public static int compareTwoStrings(String str1, String str2) {
        int contor = 0;
        int contor2 = 0;
        char[] Array = str1.toCharArray();
        char[] Array2 = str2.toCharArray();

        for (int i = 0; i < Array.length; i++) {
            contor++;
        }
        for (int i = 0; i < Array2.length; i++) {
            contor2++;
        }

        if (contor < contor2)
            return -1;
        else if (contor == contor2)
            return 0;
        else
            return 1;
    }
}
