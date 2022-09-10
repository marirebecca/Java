package Familia58;

import java.util.Scanner;

public class ExercicioRepeticao_While {

	public static void main(String[] args) {
		
		int idade, contIdade_21=0, contIdade_50=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira uma idade: ");
		idade = scan.nextInt();
		
		while (idade != -99) {
			
			if (idade <= 21) {
				contIdade_21++;
			} else if (idade <= 50) {
				contIdade_50++;
			}
			
			System.out.println("Insira uma idade: ");
			idade = scan.nextInt();
		}
		
		System.out.println("\n A quantidade de idades inseridas de até 21 anos foi de: " + contIdade_21);
		System.out.println("\n A quantidade de idades inseridas de ate 50 anos foi de: " + contIdade_50);
	}
}
