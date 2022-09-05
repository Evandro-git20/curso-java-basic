package aula17;

import java.util.Scanner;

/*Faça um programa que, dado um conjunto de N números, determine o
menor valor, o maior valor e a soma dos valores.*/

public class Exercicio_18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] numero = new int[10];
		int maiorNumero = Integer.MIN_VALUE;
		int numeroMenor = Integer.MAX_VALUE;
		int soma = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println("digite um número:");
			numero[i] = scan.nextInt();
			if(numero[i] > maiorNumero) {
				maiorNumero = numero[i];
			}
			if(numero[i] < numeroMenor) {
				numeroMenor = numero[i];
			}
			soma += numero[i];			
		}
		System.out.println("Número maior: "+maiorNumero+"\nNúmero menor: "+numeroMenor+"\nSoma dos números: "+soma);
	}
}
