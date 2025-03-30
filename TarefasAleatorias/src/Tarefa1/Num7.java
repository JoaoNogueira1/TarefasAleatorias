package Tarefa1;

import java.util.Scanner;

public class Num7 {
	public static void main (String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double n1 = teclado.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double n2 = teclado.nextDouble();
		
		System.out.println("Digite o terceiro numero: ");
		double n3 = teclado.nextDouble();
		
		double resultado = (n1 + n2 + n3)/3;
		System.out.println("Resultado: " + resultado);
		
	}
}
