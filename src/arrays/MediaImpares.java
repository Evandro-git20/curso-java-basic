package arrays;

/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a média aritmética simples dos elementos
ímpares armazenados neste vetor.*/

public class MediaImpares {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int[] impares = new int[vetorA.length];
		int divisao, media, soma = 0, quantidade = 0;
		
		for(int i = 0; i< vetorA.length; i++) {
			vetorA[i] = i;
			divisao = vetorA[i] % 2;
			if(divisao == 1) {
				impares[i] = vetorA[i];
				soma += impares[i];
				quantidade++;				
			}
		}
		media = soma/quantidade;
		System.out.print("Números ímpares: ");
		for(int i = 0; i < vetorA.length; i++) {
			if(impares[i] != 0) {
				System.out.print(impares[i]+" ");
			}
		}
		System.out.print("\nMédia dos números ímpares: "+media);
	}
}
