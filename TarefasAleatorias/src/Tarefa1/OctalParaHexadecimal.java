	package Tarefa1;
	
	import java.util.Scanner;
	
	public class OctalParaHexadecimal {
		public static void main (String [] args) {
			Scanner teclado = new Scanner(System.in);
			long num_octal, num_hexa = 0;
			int i = 0;
			
			System.out.println("Digite seu número octal: ");
			num_octal = teclado.nextLong();
			
			while (num_octal != 0) {
				num_hexa = (long) (num_hexa + (num_octal % 100) + Math.pow(8, i++));
				num_octal = num_octal/100;
			}
			System.out.println("Numero hexadecimal: " + num_hexa);
			
		}
		//TA ERRRRRAAADOOOO
	}