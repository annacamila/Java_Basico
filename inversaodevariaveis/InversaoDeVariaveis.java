package com.anacamila.cursojava.inversaodevariaveis;

public class InversaoDeVariaveis {

	public static void main(String[] args) {
		int a = 7, b = 9;

		System.out.println("Antes da troca ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		int temp = a;
		a = b;
		b = temp;

		System.out.println("Depois da troca ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
