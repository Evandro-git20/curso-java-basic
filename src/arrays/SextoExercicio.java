package arrays;

/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a soma dos respectivos
elementos em A e B, ou seja:
C[i] = A[i] + B[i].*/

public class SextoExercicio {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorB.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = i;
			vetorB[i] = vetorA[i];
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		System.out.print("Vetor A: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
		System.out.print("\nVetor B: ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i]+" ");
		}
		System.out.print("\nVetor C: ");
		for(int i =0; i < vetorC.length; i++) {
			System.out.print(vetorC[i]+" ");
		}
	}
}
