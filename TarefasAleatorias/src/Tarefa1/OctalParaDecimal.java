package Tarefa1;

import java.util.Scanner;

public class OctalParaDecimal {
	public static void main (String [] args) {
		Scanner teclado = new Scanner(System.in);
		long num_octal, num_decimal = 0;
		int i = 0;
		
		System.out.println("Digite seu numero octal: ");
		num_octal = teclado.nextLong();
		
		while (num_octal != 0) {
			num_decimal = (long) (num_decimal + (num_octal % 10) * Math.pow(8, i++));
			num_octal = num_octal/10;
		}
		
		System.out.println("Octal em decimal: " + num_decimal);
		
	}
}
