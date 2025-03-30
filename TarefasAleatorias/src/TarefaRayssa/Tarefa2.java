package TarefaRayssa;

import java.util.Scanner;

public class Tarefa2 {
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite o ano de nascimento: ");
		double n1 = teclado.nextDouble();
		
		System.out.println("\nDigite o ano atual: ");
		double n2 = teclado.nextDouble();
		
		System.out.println("Idade: " + idade(n1,n2));
		
		teclado.nextLine();
		
		if (idade(n1,n2) >= 18) {
			
			System.out.println("\nDigite seu nome: ");
			String nome = teclado.next();
			
			System.out.println(nome + ", sua entrada foi permitida");
		}
		else {
				System.out.println("\nEntrada negada");
			}
		teclado.close();
		
		}
	
	public static double idade (double n1, double n2) {
		double idadef = n2 - n1;
		return idadef;
	}
}
