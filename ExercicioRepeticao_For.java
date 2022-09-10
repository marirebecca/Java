package Familia58;

import java.util.Iterator;
import java.util.Scanner;

public class ExercicioRepeticao_For {

	public static void main(String[] args) {
		
		int num, contPar=0, contImpar=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		num = ler.nextInt();
		
		for (int i = 0; i < 5; i++) {
			if(num % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
			
			System.out.println("Insira um numero: ");
			num = ler.nextInt();
		}
		
		System.out.println("\n Foi inserido " + contPar + " numeros pares");
		System.out.println("\n Foi inserido " + contImpar + " numeros impares");
	}
}
