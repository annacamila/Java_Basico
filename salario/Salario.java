package com.anacamila.cursojava.salario;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	
	double salHora , horasTrab, salBruto, ir, inss, sindicato, totalDesc, salLiquido;
	
	System.out.println("Informe quanto voce ganha por hora:");
	salHora = read.nextDouble();
	
	System.out.println("Informe quantas horas voce trabalhou no mes:");
	horasTrab = read.nextDouble();
	
	salBruto = salHora * horasTrab;
	ir = (salBruto / 100) * 11;
	inss = (salBruto / 100) * 8;
	sindicato = (salBruto / 100) * 5;
	totalDesc = ir + inss + sindicato;
	salLiquido = salBruto - totalDesc;
	
	System.out.println("Salario Bruto " + salBruto);
	System.out.println("IR " + ir);
	System.out.println("INSS " + inss);
	System.out.println("Sindicato " + sindicato);
	System.out.println("Total de Descontos " + totalDesc);
	System.out.println("Salario Liquido " + salLiquido);
	
	}

}
