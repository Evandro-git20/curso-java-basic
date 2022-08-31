package aula17;

import java.util.Scanner;

/*Faça um programa que peça 10 números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números impares.*/

public class Exercicio_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int primeiroNumero = 0;
		int segundoNumero = 0;
		int[] numeros = new int[11];
		int pares = 0;
		int impares = 0;
		
		for(int i = 0; i == 0; i++) {
			
			System.out.println("digite o 1º número:");
			primeiroNumero = scan.nextInt();
			
			if(primeiroNumero % 2 == 0) {
				pares += 1;
			}else {
				impares += 1;
			}
			
			if(primeiroNumero > 0) {
				for(int j = 2; j < 11; j++) {
					System.out.println("Digite o " + j + "º número:");
					segundoNumero = scan.nextInt();
					if(segundoNumero % 2 == 0) {
						pares += 1;
					}else {
						impares += 1;
					}
					numeros[j] += segundoNumero;
				}
			}
		}
		System.out.println("Você digitou:");
		System.out.print(primeiroNumero + " ");
		for(int cont = 2; cont < 11; cont++) {
			System.out.print(numeros[cont] + " ");
		}
		System.out.println("\nQuantidade de números pares: " + pares);
		System.out.println("Quantidade de números impares: " + impares);
	}
}
