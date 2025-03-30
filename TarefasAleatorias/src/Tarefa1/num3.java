package Tarefa1;

import java.util.Scanner;

public class num3 {

	public static void main (String [] args) {
		Scanner resposta = new Scanner (System.in);
		
		System.out.println("Digite seu primeiro número: ");
		double n1 = resposta.nextDouble();
		
		System.out.println("Digite seu segundo número: ");
		double n2 = resposta.nextDouble();
		
		System.out.println(n1 + " * "+ n2 + " = "+ n1 * n2);
	}
}
