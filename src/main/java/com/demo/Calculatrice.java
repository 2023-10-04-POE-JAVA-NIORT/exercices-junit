package com.demo;

import java.util.ArrayList;

public class Calculatrice {

    public static int additionner(int a, int b){
        return a + b;
    }

    public static int soustraire(int a, int b){
        return a - b;
    }

    public static int multiplier(int a, int b) {
        return a * b;
    }

    public static int max(int a, int b){
        return a > b ? a : b;
    }

    public static double diviser(double a, double b){
        return a / b;
    }

    public static double diviserInteger(int a, int b){
        return a / b;
    }

    public static ArrayList<Integer> getNombresImpairs(int max){
        ArrayList<Integer> nombresImpairs = new ArrayList<>();

        for(int i=0; i<=max; i++){
            if(i % 2 != 0) { // nombre pair car modulo est égal à zéro
                nombresImpairs.add(i);
            }
        }

        return nombresImpairs;
    }
}
