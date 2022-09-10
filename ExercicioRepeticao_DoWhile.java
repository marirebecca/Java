package Familia58;

import java.util.Scanner;

public class ExercicioRepeticao_DoWhile {

	public static void main(String[] args) {
		
		int num, somarNum=0, cont=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		num = scan.nextInt();
		
		do {
			if (num == 0) {
				System.out.println("\n Saindo do sistema pois foi digitado o valor 0");
			} else {
				if (num >  0) {
					somarNum += num;
					cont++;
				}
				
				System.out.println("Insira um numero: ");
				num = scan.nextInt();
			}
			
		} while (num != 0);
		
		System.out.println("\n A soma dos numeros digitados é de: " + somarNum);
	}
}
