package com.exerciciotdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromoTest {

    @Test
    public void deveRetornarTrueParaPalavraSimples() {
        assertTrue(ValidadorPalindromo.ehPalindromo("ana"));
        assertTrue(ValidadorPalindromo.ehPalindromo("ovo"));
    }

    @Test
    public void deveRetornarTrueParaFraseComEspacosEMaiusculas() {
        assertTrue(ValidadorPalindromo.ehPalindromo("Ame a ema"));
        assertTrue(ValidadorPalindromo.ehPalindromo("Socorram-me subi no ônibus em Marrocos"));
    }

    @Test
    public void deveRetornarFalseParaNaoPalindromos() {
        assertFalse(ValidadorPalindromo.ehPalindromo("banana"));
        assertFalse(ValidadorPalindromo.ehPalindromo("Isso não é um palíndromo"));
    }
}
