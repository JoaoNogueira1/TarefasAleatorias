package Tarefa1;

import java.util.Scanner;

public class num5 {
	public static void main (String [] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite seu número: ");
		double n1 = teclado.nextDouble();
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println(n1 + " X " + (i + 1) + "= " + (n1 * (i + 1)));
		}
	}
}
