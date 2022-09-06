package arrays;

 /*Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os elementos do vetor A multiplicados
por 2, ou seja: B[i] = A[i] * 2.*/

public class SegundoExercicio {

	public static void main(String[] args) {
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = i;
			vetorB[i] = vetorA[i] * 2;
		}
		System.out.print("Vetor A: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
		System.out.print("\nVetor B: ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i]+" ");
		}
	}
}
