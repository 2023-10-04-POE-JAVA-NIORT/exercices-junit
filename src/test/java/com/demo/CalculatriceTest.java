package com.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatriceTest
{
    @Test
    public void testAdditioner(){

        assertEquals(5, Calculatrice.additionner(2, 3));
    }

    @Test
    public void testSoustraire(){

        assertEquals(2, Calculatrice.soustraire(5, 3));
    }

    @Test
    public void testMultiplier(){

        assertEquals(15, Calculatrice.multiplier(5, 3));
    }

    @Test
    public void testDiviser(){

        assertEquals(3,Calculatrice.diviser(6,2));
    }
    @Test
    public void testDiviser2(){

        assertEquals(2.5,Calculatrice.diviser(5,2));
    }

    @ParameterizedTest
    @CsvSource({ "2,8,8", "20,8,20", "6,6,6", "-2,8,8", "-2,-6,-2" })
    public void testMax(int a, int b, int resultat){
        assertEquals(resultat, Calculatrice.max(a,b));
    }

    @Test
    public void testDiviserParZero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculatrice.diviserInteger(2,0);
        });
    }

    @Test
    public void testGetNombresImpairs(){
        ArrayList<Integer> nombresImpairs = Calculatrice.getNombresImpairs(5);
        assertEquals(3, nombresImpairs.size());
        assertTrue(nombresImpairs.contains(3));
        assertFalse(nombresImpairs.contains(2));
    }
}
