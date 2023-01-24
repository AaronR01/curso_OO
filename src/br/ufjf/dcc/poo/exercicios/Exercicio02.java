package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		float LarguraT,ProfnT;
		float LarguraC,ProfnC;
		float areaC,areaT;
		Scanner teclado = new Scanner(System.in);

		System.out.println("digite a largura e depois a profundidade do terreno: ");
		LarguraT = teclado.nextFloat();
		ProfnT = teclado.nextFloat();
		System.out.println("digite a largura e depois a profundidade da casa: ");
		LarguraC = teclado.nextFloat();
		ProfnC = teclado.nextFloat();
		areaT = LarguraT * ProfnT ;
		areaC = LarguraC * ProfnC ;
		
		float area_restante = areaT-areaC;
		System.out.println("resta: " + (area_restante/areaT)*100 +"% do terreno livre" );
		
		
	}
}
