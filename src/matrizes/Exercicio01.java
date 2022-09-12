package matrizes;

import java.util.Random;

/*Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
9. Após isso determine o maior número da matriz e a sua posição
(linha, coluna).*/

public class Exercicio01 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		int maior = 0;
		int menor = 9;
		int maiorL = 0, maiorC = 0, menorL = 0, menorC = 0;
		Random numeroRandom = new Random();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = numeroRandom.nextInt(9);
				if(matriz[i][j]>maior) {
					maior = matriz[i][j];
					maiorL = i;
					maiorC = j;
				}
				if(matriz[i][j] < menor) {
					menor = matriz[i][j];
					menorL = i;
					menorC = j;
				}
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Maior número: "+maior+" na posição "+maiorL+" x "+maiorC+
							"\nMenor número: "+menor+" na posição "+menorL+" x "+menorC);
	}
}
