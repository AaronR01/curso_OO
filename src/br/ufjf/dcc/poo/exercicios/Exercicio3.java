package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		float a,b,c;
	Scanner teclado = new Scanner(System.in);
		System.out.println("digite os coeficientes a b c da equacao");
		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();
		double delta = b*b-4*a*c;
		System.out.println("as raizes sao: "+(-b + Math.sqrt(delta))/(2*a) + " " +(-b  -Math.sqrt(delta))/(2*a));
	}

}
