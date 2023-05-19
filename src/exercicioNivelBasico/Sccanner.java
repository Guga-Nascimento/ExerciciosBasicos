package exercicioNivelBasico;
/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a 
 * soma desses números com uma mensagem explicativa, conforme exemplos.*/

import java.util.Locale;	
import java.util.Scanner;

public class Sccanner {
	
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	//declaração de viariáveis
	int n1,n2,soma=0;
	//entrada de dados
	System.out.println("Informe o primeiro número");
	n1 = sc.nextInt();
	System.out.println("Informe o Segundo Número");
	n2 = sc.nextInt();
	//processamento de dados
	soma= n1 + n2;
	//saída de dados
	System.out.println((String.format("A soma de %d + %d tem como resultado =%d",n1,n2,soma)));
	
	
	sc.close();
	}
}
