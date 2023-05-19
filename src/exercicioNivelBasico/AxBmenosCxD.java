package exercicioNivelBasico;
/*Fazer um programa para ler quatro valores inteiros A, B, C e D.
 *  A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: 
DIFERENCA = (A * B - C * D).*/

import java.util.Locale;
import java.util.Scanner;

public class AxBmenosCxD {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número");
		int A = sc.nextInt();
		System.out.println("Informe o segundo número");
		int B = sc.nextInt();
		System.out.println("Informe o terceiro número");
		int C = sc.nextInt();
		System.out.println("Informe o quarto número");
		int D = sc.nextInt();
		
		int somaAB = A*B;
		int somaCD = C*D;
		int diferenca = somaAB - somaCD;
		
		System.out.println(String.format
		("A diferença do produto solicitada no programe é %d", diferenca));		
		
		sc.close();
	}

}
