package Tarefa1;

import java.util.Scanner;

public class AreaPoligono {
	public static void main (String [] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de lado do poligono: ");
		double n = teclado.nextDouble();
		
		System.out.println("Digite o comprmento de um lado do polígono: ");
		double s = teclado.nextDouble();
		
		double resultado = (n * Math.pow(s, 2) / (4 * Math.tan(Math.PI/n)));
		
		System.out.println("A área é: " + calculo(n, s));
	}
	
	public static double calculo(double n, double s ) {
		double resultado = (n * Math.pow(s, 2) / (4 * Math.tan(Math.PI/n)));
		return resultado;
	}
}
