package Familia58;

import java.util.Scanner;

public class ListaExercicio_1 {
	public static void main(String[] args) {
		
		int v1, v2, v3;
		
		Scanner valores = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		v1 = valores.nextInt();
		
		System.out.println("Insira um valor: ");
		v2 = valores.nextInt();
		
		System.out.println("Insira um valor: ");
		v3 = valores.nextInt();
		
		if(v1 > v2 && v1 > v3) {
			System.out.println("Maior valor é: " + v1);
		} else if(v2 > v3) {
			System.out.println("Maior valor é: " + v2);
		} else {
			System.out.println("Maior valor é: " + v3);
		}
		
	}
}
