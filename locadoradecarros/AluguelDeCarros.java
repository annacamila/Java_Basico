package com.anacamila.cursojava.locadoradecarros;

import java.util.Scanner;

public class AluguelDeCarros {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double km, dias, precoDia, precoKm, precoTotal;
		
		System.out.println("Digite quantos km o carro pecorreu");
		km = read.nextDouble();
		
		System.out.println("Digite a quantidade de dias que o carro foi alugado");
		dias = read.nextDouble();
		
		precoDia = 90 * dias;
		precoKm = 0.20 * km;
		precoTotal = precoDia + precoKm;
		
		System.out.println("O valor total a pagar pelo aluguel do carro e: R$" + precoTotal);
		

	}

}
