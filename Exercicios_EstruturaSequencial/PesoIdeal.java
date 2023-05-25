package com.anacamila.cursojava.pesoideal;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		System.out.println("Digite sua altura:");
		double altura = read.nextDouble();
		double pesoIdeal = (72.7 * altura) - 58;
		System.out.println("O seu peso ideal e " + pesoIdeal +" Kg");
	}

}
