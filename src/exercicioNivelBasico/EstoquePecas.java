package exercicioNivelBasico;
/*Fazer um programa para ler o código de uma peça 1,
 *o número de peças 1, o valor unitário de cada peça 1,
 *o código de uma peça 2, o número de peças 2 e o 
 *valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/
import java.util.Locale;
import java.util.Scanner;

import entidades.Peca;

public class EstoquePecas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("informe Código, valor e quantidade da peça");
		Peca peca1 = new Peca(sc.nextInt(),sc.nextDouble(),sc.nextInt());
		System.out.println("informe Código, valor e quantidade da peça");
		Peca peca2 = new Peca(sc.nextInt(),sc.nextDouble(),sc.nextInt());
		
		System.out.println("Código: "+peca1.getCod());
		System.out.println("Quantidade: "+peca1.getQuantidade());
		System.out.println("Valor Unitário: "+peca1.getValor());
		System.out.println("Código: "+peca2.getCod());
		System.out.println("Quantidade: "+peca2.getQuantidade());
		System.out.println("Valor Unitário: "+peca2.getValor());
		System.out.println("Total a pagar: "+(peca1.calculo()+peca2.calculo()));
		
		
		
		
		sc.close();
	}

}
