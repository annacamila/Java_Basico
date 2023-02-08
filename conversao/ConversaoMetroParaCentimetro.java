package com.anacamila.cursojava.conversao;

import java.util.Scanner;

public class ConversaoMetroParaCentimetro {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		System.out.println("Digite o valor em metros:");
		double metro = read.nextDouble();
		double cm = 100 * metro;
		System.out.println("O valor equivale a " + cm + " centimetros");

	}

}
