package com.anacamila.cursojava.produtonumeros;

import java.util.Scanner;

public class ProdutoNumeros {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Digite o primeiro numero inteiro:");
		int num1 = read.nextInt();
		System.out.println("Digite o segundo numero inteiro:");
		int num2 = read.nextInt();
		System.out.println("Digite um numero real:");
		double num3 = read.nextDouble();
		int resultado1 = (num1 * 2) * (num2 / 2);
		double resultado2 = (num1 * 3) + num3;
		double resultado3 = Math.pow(num3, 3);
		System.out.println("O resultado um e " + resultado1);
		System.out.println("O resultado dois e " + resultado2);
		System.out.println("O resultado tres e " + resultado3);
	}

}
