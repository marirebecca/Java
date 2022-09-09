package Familia58;

import java.util.Scanner;

public class ListaExercicio_3 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner valores = new Scanner(System.in);
		
		System.out.println("Insira uma idade: ");
		idade = valores.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Infantil");
		} else if(idade >= 15 && idade <= 17) {
			System.out.println("Juvenil");
		} else if(idade >= 18 && idade <= 25) {
			System.out.println("Adulto");
		} else {
			System.out.println("Insira uma idade entre 10 anos e 25 anos");
		}
	}
}
