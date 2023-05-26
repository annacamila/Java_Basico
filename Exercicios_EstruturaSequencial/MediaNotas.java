package com.anacamila.cursojava.media;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		System.out.println("Digite a primeira nota:");
		double nota1 = read.nextDouble();
		System.out.println("Digite a segunda nota:");
		double nota2 = read.nextDouble();
		System.out.println("Digite a terceira nota:");
		double nota3 = read.nextDouble();
		System.out.println("Digite a quarta nota:");
		double nota4 = read.nextDouble();
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A media das notas e " + media);

	}

}
