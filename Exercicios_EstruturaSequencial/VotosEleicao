package com.anacamila.cursojava.eleicao;

import java.util.Scanner;

public class VotosEleicao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int eleitores, candidato1, candidato2, votosNulo;
		double percentualCand1, percentualCand2, percentualVotosNulos;
		
		System.out.println("Informe o numero total de eleitores:");
		eleitores = ler.nextInt();
		System.out.println("Informe o numero de votos do candidato um:");
		candidato1 = ler.nextInt();
		System.out.println("Informe o numero de votos do candidato dois:");
		candidato2 = ler.nextInt();
		System.out.println("Informe o numero de votos nulo:");
		votosNulo = ler.nextInt();
		percentualCand1 = ((double)candidato1 / eleitores) * 100;
		percentualCand2 = ((double)candidato2 / eleitores) * 100;
		percentualVotosNulos = ((double)votosNulo / eleitores) * 100;
		
		System.out.println("O percentual de votos do candidato um foi " + percentualCand1);
		System.out.println("O percentual de votos do candidato dois foi " + percentualCand2);
		System.out.println("O percentual de votos nulos foi " + percentualVotosNulos);
		
	}

}
