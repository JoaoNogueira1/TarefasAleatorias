package Tarefa1;

import java.util.Scanner;

public class AreaHexagono {
	public static void main (String [] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite o comprimento de um lado do hexagono: ");
		double S = teclado.nextDouble();
		
		System.out.println("A área do hexagono é: " + calculo(S));
		
		}
	
	public static double calculo(double S) {
		double resultado = (6 * Math.pow(S, 2) / (4 * Math.tan(Math.PI / 6)));
		return resultado;
	}
}
