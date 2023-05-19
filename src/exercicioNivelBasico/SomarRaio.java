package exercicioNivelBasico;
/*Faça um programa para ler o valor do raio de um círculo, e depoi
 mostrar o valor da área deste círculo com quatro casas decimais 
 conforme exemplos.
 
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159*/

import java.util.Locale;
import java.util.Scanner;

public class SomarRaio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//declaração de viariáveis
		double raio,area=0,tt = 3.14159;
		//entrada de dados
		System.out.println("Informe o raio do círculo");
		raio = sc.nextDouble();
		//processamento de dados
		area = tt * (raio * raio); 
		//saída de dados
		System.out.println((String.format("O raio desse círculo informado é de %.4f",area)));
		sc.close();
	}

}
