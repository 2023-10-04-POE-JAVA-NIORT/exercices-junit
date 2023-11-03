package com.demo;

public class Palindrome {

    // pour virer les caracteres spéciaux :
    // mot = mot.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    public static boolean isPalindrome1(String phrase){

        if(phrase == null)
            return false;

        phrase = phrase.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int indexDebut = 0;
        int indexFin = phrase.length()-1;

        while(indexDebut < indexFin){
            if(phrase.charAt(indexDebut) != phrase.charAt(indexFin))
                return false;

            indexDebut++;
            indexFin--;
        }
        return true;
    }

    public static boolean isPalindrome2(String phrase){

        return new StringBuilder(phrase.replaceAll("\\s", ""))
                .reverse()
                .toString()
                .equalsIgnoreCase(phrase.replaceAll("\\s", ""));

    }
}
