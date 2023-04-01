/* João Papo-de-Pescador, homem de bem, comprou um
microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido
pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
você faça um programa que leia a variável peso (peso de peixes) e
verifique se há excesso. Se houver, gravar na variável excesso e na
variável multa o valor da multa que João deverá pagar.*/

package com.anacamila.cursojava.papodepescador;

import java.util.Scanner;

public class PapoDePescador {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double pesoPeixes, multa, pesoExcesso = 50;
		
		System.out.println("Digite o peso dos peixes:");
		pesoPeixes = ler.nextDouble();
		
		if	(pesoPeixes > 50) {
		    pesoExcesso = pesoPeixes - 50;
			multa = 4 * pesoExcesso;
			System.out.println("Hoje Joao pescou " + pesoPeixes + " Kg de peixes " +  pesoExcesso + " Kg a mais que o estabelecido pelo regulamento, e isso gerou uma multa de R$ " + multa);
		
		} else 
			System.out.println("Hoje João pescou " + pesoPeixes + " Kg de peixes e esta dentro do limite estabelecido pelo regulamento");
	}

}
