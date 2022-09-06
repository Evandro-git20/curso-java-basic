package arrays;

/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a quantidade de elementos armazenados neste
vetor que são pares.*/

public class ParesVetor {

	public static void main(String[] args) {
		int[] vetorA = new int[11];
		int[] pares = new int[11];
		int resultado, soma = 0;		
		
		for(int i = 1; i < vetorA.length; i++) {
			vetorA[i] = i;
			resultado = vetorA[i] % 2;
			if(resultado == 0) {
				pares[i] = i;
				soma ++;
			}
		}
		
		System.out.print("Números pares: ");
		for(int i = 1; i < vetorA.length; i++) {
			if(pares[i] != 0) {
				System.out.print(pares[i]+" ");
			}
		}
		System.out.print("\nQuantidade de números pares: "+soma);
	}
}
