package com.anacamila.cursojava.temperatura;

import java.util.Scanner;

public class FarenheitCelsius {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Informe a temperatura em farenheit:");
		double F = read.nextDouble();
		double C = (5 * (F-32) / 9);
		System.out.println("A temperatura F em graus C e " + C +"C");

	}

}
