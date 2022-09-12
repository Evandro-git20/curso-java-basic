package matrizes;

import java.util.Scanner;

/*Capture do teclado valores para preenchimento de uma matriz M
3x3. Após a captura imprima a matriz criada e encontre a
quantidade de números pares, a quantidade de números ímpares.*/

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matrizes = new int[3][3];
		int pares = 0, impares = 0, numeros, divisao;
		
		for(int i = 0; i < matrizes.length; i++) {
			for(int j = 0; j < matrizes.length; j++) {
				System.out.println("Digite um número:");
				numeros = scan.nextInt();
				matrizes[i][j] = numeros;
				
				divisao = matrizes[i][j] % 2;
				if(divisao == 0) {
					pares++;
				}
				else {
					impares++;
				}				
			}		
		}
		System.out.println();
		for(int i = 0; i < matrizes.length; i++) {
			for(int j = 0; j < matrizes.length; j++) {
				System.out.print(matrizes[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Pares: "+pares+"\nImpares: "+impares);
	}
}
