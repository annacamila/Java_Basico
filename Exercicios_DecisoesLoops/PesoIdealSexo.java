package com.anacamila.cursojava.pesoidealsexo;

import java.io.IOException;
import java.util.Scanner;

public class PesoIdealSexo {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner (System.in);
		char sexo;
		double altura, pesoIdeal;
		
		System.out.println("Digite o sexo (M ou F):");
		sexo = (char) System.in.read();
		System.out.println("Digite a altura em metros:");
		altura = ler.nextDouble();
		
		if ((sexo == 'M') || (sexo == 'm'))
			pesoIdeal = (72.7 * altura) - 58;
		else 
			pesoIdeal = (62.1 * altura) - 44.7;
		
		System.out.println("O peso ideal desta pessoa e " + pesoIdeal +" Kg");
			
	}

}
