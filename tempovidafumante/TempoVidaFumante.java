package com.anacamila.cursojava.tempovidafumante;

import java.util.Scanner;

public class TempoVidaFumante {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double cigarroDia, anosFumo, qtDias, qtCigarro, minutosPerdidos, menosDias;
		
		System.out.println("Digite quantos cigarros voce fuma por dia");
		cigarroDia = read.nextDouble();
		
		System.out.println("Digite ha quantos anos voce fuma");
		anosFumo = read.nextDouble();
		
		qtDias = anosFumo * 365;
		qtCigarro = qtDias * cigarroDia;
		minutosPerdidos = qtCigarro * 10;
		menosDias = minutosPerdidos / 1440;
		
		System.out.println("Voce ja perdeu " + menosDias + " dias de vida");

	}

}
