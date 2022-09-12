package matrizes;

import java.util.Random;

/*Gere e imprima uma matriz M 10x10 com valores aleatórios entre
0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
qual é o maior e o menor valor da coluna 7.*/

public class Exercicio02 {

	public static void main(String[] args) {
		int[][] matrizes = new int[10][10];
		int maiorI = 0, menorI = 9, maiorJ = 0, menorJ = 9;
		Random numeros = new Random();
		
		for(int i = 0; i < matrizes.length; i++) {
			for(int j = 0; j < matrizes.length; j++) {

				if(i == 4) {			
					matrizes[i][j] = numeros.nextInt(10);
					if(matrizes[i][j] > maiorI) {
						maiorI = matrizes[i][j];
					}
					if(matrizes[i][j] < menorI) {
						menorI = matrizes[i][j];
					}					
				}else if(j == 6) {
					matrizes[i][j] = numeros.nextInt(10);
					if(matrizes[i][j] > maiorJ) {
						maiorJ = matrizes[i][j];
					}
					if(matrizes[i][j] < menorJ) {
						menorJ = matrizes[i][j];
					}					
				}else {
					matrizes[i][j] = numeros.nextInt(10);
				}				
				System.out.print(matrizes[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nMaior da linha 5: "+maiorI+"\nMenor da linha 5: "+menorI+
							"\nMaior da coluna 7: "+maiorJ+"\nMenor da coluna 7: "+menorJ);
	}
}
