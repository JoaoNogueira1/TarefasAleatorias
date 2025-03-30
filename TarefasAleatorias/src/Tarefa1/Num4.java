package Tarefa1;

import java.util.Scanner;


public class Num4 {
	public static void main (String [] args){
		Scanner resposta = new Scanner (System.in);
		
		System.out.println("Digite seu primeiro número: ");
		double n1 = resposta.nextDouble();
		
		System.out.println("Digite seu segundo número: ");
		double n2 = resposta.nextDouble();
		
		
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
		System.out.println(n1 + " X " + n2 + " = " + (n1 * n2));
		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
		System.out.println(n1 + " mod " + n2 + " = " + (n1 % n2));
	}
}
