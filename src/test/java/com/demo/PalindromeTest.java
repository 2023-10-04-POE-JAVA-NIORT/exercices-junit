package com.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest
{
    @Test
    public void testPalindrome1Kayak(){
        assertTrue(Palindrome.isPalindrome1("kayak"));
    }
    @Test
    public void testPalindrome1Toto(){
        assertFalse(Palindrome.isPalindrome1("toto"));
    }
    @Test
    public void testPalindrome1Emme(){
        assertTrue(Palindrome.isPalindrome1("emme"));
    }
    @Test
    public void testPalindrome1Null(){
        assertFalse(Palindrome.isPalindrome1(null));
    }

    @Test
    public void testPalindrome1PhraseGilles(){
        // ésope reste ici et se repose
        assertTrue(Palindrome.isPalindrome1("Esope reste ici et se repose"));
    }

    @Test
    public void testPalindrome1PhraseArnaud(){
        assertTrue(Palindrome.isPalindrome1("Madam, in Eden I'm Adam"));
    }
}
