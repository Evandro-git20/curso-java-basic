package aula17;

import java.util.Scanner;

/*Faça um programa que leia 5 números e informe o maior número.*/

public class Exercicio_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double numero;
		double numero2;
		double numeroMaior = Integer.MIN_VALUE;
		double[] numeros = new double[5]; 
		for(int i = 0; i == 0; i++) {
			System.out.println("Digite um número:");
			numero = scan.nextDouble();
			numeros[i] += numero;
			if(numeros[i] > numeroMaior) {
				numeroMaior = numeros[i];
			}
			for(int j = 1; j < 5; j++) {
				System.out.println("Digite outro número:");
				numero2 = scan.nextDouble();
				numeros[j] += numero2;
				if(numeros[j] > numeroMaior) {
					numeroMaior = numeros[j];
				}
			}
		}
		System.out.println("O maior número digitado foi "+numeroMaior);
	}
}
