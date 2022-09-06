package arrays;

import java.text.DecimalFormat;

/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
raiz quadrada do respectivo elemento de A, ou seja:
B[i] = sqrt(A[i]). */

public class QuartoExercicio {

	public static void main(String[] args) {
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];
		DecimalFormat decimal = new DecimalFormat("####,###.##");
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = i;
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.print("Vetor A: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
		
		System.out.print("\nVetor B: ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(decimal.format(vetorB[i])+" ");
		}
	}
}
