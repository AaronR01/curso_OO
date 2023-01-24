package br.ufjf.dcc.poo.exemplos;
import java.util.Scanner;

public class CalculaMedia {
	public static void main(String[] args) {
		float val1,val2,val3;
		Scanner scanner = new Scanner(System.in);
    	System.out.print("Primeiro valor: ");
    	val1 = scanner.nextFloat();
    	System.out.print("Segundo valor: ");
    	val2 = scanner.nextFloat();
    	System.out.print("Terceiro valor: ");
    	val3 = scanner.nextFloat();
    	double area = (val1+val2+val3) / 3;
    	System.out.println("A media dos Valores é: " + area);
    	scanner.close();
	}
}
