package br.ufjf.dcc.poo.exemplos;
import java.util.Scanner;

public class Triangulo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Insira o valor da base do triangulo: ");
    double base = scanner.nextDouble();
    System.out.print("Insira o valor da altura do triangulo: ");
    double altura = scanner.nextDouble();

    double area = (base * altura) / 2;
    System.out.println("A area do triangulo e: " + area);
    scanner.close();
  }
}