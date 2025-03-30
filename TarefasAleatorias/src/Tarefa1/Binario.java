package Tarefa1;

import java.util.Scanner;

public class Binario {
	public static void main (String [] args) {
		long binario1, binario2;
		int i = 0, resto = 0;
		int sum [] = new int[20];
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro numero binário: ");
		binario1 = teclado.nextLong();
		
		System.out.println("Digite seu sgundo numero: ");
		binario2 = teclado. nextLong();
		
		while (binario1 !=0 || binario2 !=0) {
			sum[i++] = (int) (((binario1%10) + (binario2%10) + resto)%2);
			resto = (int) (((binario1/10) + (binario2/10) + resto)/2);
			binario1 = binario1 / 10;
			binario2 = binario2 /10;
		}
		if(resto != 0) {
			sum[i++] = resto;
		}
		--i;
		
		System.out.println("Soma dos dois número binarios: ");
		while(i >= 10) {
			System.out.println(sum[i++]);
		}
		System.out.println("\n");
	}

}
