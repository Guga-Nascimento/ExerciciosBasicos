package exercicioNivelBasico;
/*Fazer um programa que leia o número de um funcionário, 
 * seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre
 o número e o salário do funcionário, com duas casas
decimais.*/

import java.util.Locale;
import java.util.Scanner;

public class CalculoSalario {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod,horasTrabalhadas;
		String nome;
		double valorHoraTrabalhada;
		
		System.out.println("Informe o nome do colaborador");
		nome = sc.nextLine();
		System.out.println("Informe o código do colaborador");
		cod = sc.nextInt();
		System.out.println("Informe a quantidade de horas trabalhadas");
		horasTrabalhadas = sc.nextInt();
		System.out.println("Informe o valor da hora trabalhada");
		valorHoraTrabalhada= sc.nextDouble();
		
		double soma = horasTrabalhadas * valorHoraTrabalhada;
		
		System.out.println(String.format
		("Bem Vindo: %s%n"
				+ "Código do colaborador: %d%n"
				+ "Quantidade de horas trabalhadas: %d%n"
				+ "Salário Bruto: %.2f%n"
				+ "Obrigado!!! ",nome,cod,horasTrabalhadas,soma));		
		sc.close();
	}

}
