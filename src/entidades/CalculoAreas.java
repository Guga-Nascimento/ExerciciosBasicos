package entidades;
/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/

import java.util.Locale;
import java.util.Scanner;



public class CalculoAreas  {

	private double A,B,C;
	private static double tt=3.14159;
	

	public CalculoAreas(double a, double b, double c) {
		A = a;
		B = b;
		C = c;
	}

	public double getA() {
		return A;
	}

	public void setA(double a) {
		A = a;
	}

	public double getB() {
		return B;
	}

	public void setB(double b) {
		B = b;
	}

	public double getC() {
		return C;
	}

	public void setC(double c) {
		C = c;
	}
	public void dadosRecebidos() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe A");
		A = sc.nextDouble();
		System.out.println("Informe B");
		B = sc.nextDouble();
		System.out.println("Informe C");
		C = sc.nextDouble();
		
		sc.close();
	}
	public void triangulo() {
		//multiplicar o comprimento da base e da altura e dividir por dois.
		double area = (A * C) / 2;		
		System.out.println(String.format("A area do triângulo é %.2f",area));
	}
	public void circulo() {
		//Fórmula da área: area = π . raio2
		double area = tt * (C*C);
		System.out.println(String.format("A area do círculo é %.2f",area));		
	}
	public void trapazio() {
		//somar a base maior e base menor, multiplicar pela altura e depois,
		//basta dividir o resultado por dois.
		double area = ((A+B)*C)/2;
		System.out.println(String.format("A area do trapézio é %.2f",area));
	}
	public void quadrado() {
		double area = B*B;
		System.out.println(String.format("A area do quadrado é %.2f",area));
	}
	public void retangulo() {
		double area = A * B;
		System.out.println(String.format("A area do retângulo é %.2f",area));
		
	}
	
	

}
