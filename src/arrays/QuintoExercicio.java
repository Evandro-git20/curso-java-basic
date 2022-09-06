package arrays;

/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o respectivo elemento de A multiplicado por sua posição (ou
índice), ou seja:
B[i] = A[i] * i.*/

public class QuintoExercicio {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i =0; i < vetorA.length; i++) {
			vetorA[i] = i;
			vetorB[i] = vetorA[i] * i;
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
