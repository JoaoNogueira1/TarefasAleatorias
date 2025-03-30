package Tarefa1;

import java.util.Scanner;

public class Num8 {
	public static void main (String args []) {
		Scanner input = new Scanner (System.in);
		int num1;
		int num2;
		
		System.out.println("Digite seu primeiro número: ");
		num1 = input.nextInt();
		
		System.out.println("Digite seu segundo número: ");
		num2 = input.nextInt();
		
		if(num1 == num2) 
			System.out.printf("%d = %d\n", num1, num2);
		if(num1 != num2)
			System.out.printf("%d != %d\n", num1, num2);
		if(num1 < num2)
			System.out.printf("%d < %d\n", num1, num2);
		if(num1 > num2)
			System.out.printf("%d > %d\n", num1, num2);
		if(num1 <= num2)
			System.out.printf("%d <= %d\n", num1, num2);
		if(num1 >= num2)
			System.out.printf("%d >= %d\n", num1, num2);
	}
}
