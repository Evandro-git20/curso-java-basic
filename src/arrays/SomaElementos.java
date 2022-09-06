package arrays;

/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que determine a soma dos elementos armazenados neste vetor que
são múltiplos de 5.*/

public class SomaElementos {

	public static void main(String[] args) {
		int[] vetorA = new int[21];
		int soma = 0;
		int divisao;
		
		System.out.print("Números divisiveis por 5: ");
		for(int i = 1; i < vetorA.length; i++) {
			vetorA[i] = i;
			divisao = vetorA[i]%5;
			if(divisao == 0) {
				soma += vetorA[i];
				System.out.print(vetorA[i]+" ");
			}
		}
		System.out.print("\nSoma dos números divisiveis por 5: "+soma);
	}
}
