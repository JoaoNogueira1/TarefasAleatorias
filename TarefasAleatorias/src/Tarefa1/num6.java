package Tarefa1;

import java.util.Scanner;

public class num6 {
	private static final double raio = 7.5;
	
	public static void main(String [] args) {
		double perimetro = 2 * Math.PI * raio;
		
		double area = Math.PI * raio * raio;
		
		System.out.println("Perímetro é: " + perimetro);
		System.out.println("Area é: " + area);
		
	}
}
