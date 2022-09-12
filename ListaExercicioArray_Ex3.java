//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui

package Familia58;

import java.util.Scanner;

public class ListaExercicioArray_Ex3 {

	public static void main(String[] args) {

		int[][] numero = new int [3][3];
		int valores = 0, linha, coluna;
		
		Scanner ler = new Scanner(System.in);
		
		for (linha= 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				
				System.out.println("Entre com um numero: ");
				numero[linha][coluna] = ler.nextInt();
				
				if (numero[linha][coluna] > 10) {
					valores++;
				}
			}
		}
		
		System.out.println("A quantidade de valores inseridos maiores que 10 é de: " + valores);
	}

}
