package Familia58;

import java.util.Scanner;

public class ListaExercicioArray_Ex1 {

	public static void main(String[] args) {

		int[] a = new int[6];
		int soma = 0, v0, v1,v2, v3, v4, v5;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		v0 = scan.nextInt();
		
		System.out.println("Insira um valor: ");
		v1 = scan.nextInt();
		
		System.out.println("Insira um valor: ");
		v2 = scan.nextInt();
		
		System.out.println("Insira um valor: ");
		v3 = scan.nextInt();
		
		System.out.println("Insira um valor: ");
		v4 = scan.nextInt();
		
		System.out.println("Insira um valor: ");
		v5 = scan.nextInt();
		
		a[soma] = (v0+v1+v5); 
		
		v3 = 100;
		
		System.out.println("\nA soma dos vetores 0, 1 e 5 é: " + soma);
		System.out.println("\nVetor 4 vale: " + v3);
		System.out.println("\nValores do vetor A é: " + "\n " + v0 + "\n " + v1 + "\n " + v2 
				+ "\n" + v3 + "\n" + v4 + "\n " + v5);
		
	}

}
