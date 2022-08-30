package aula17;

import java.util.Scanner;

/*. Faça um programa que leia 5 números e informe a soma e a média
dos números.*/

public class Exercicio_09 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		String numero;
		String numero2;
		double media;
		double soma = 0;
		double[] numeros = new double[5];
		for(int i = 0; i == 0; i++) {
			System.out.println("Digite um número:");
			numero = scan.next();
			numeros[i] += Double.parseDouble(numero);
			soma += numeros[i];
			for(int j = 1; j < 5; j++) {
				System.out.println("Digite outro número:");
				numero2 = scan.next();
				numeros[j] += Double.parseDouble(numero2); 
				soma += numeros[j];
			}
		}
		media = soma/5;
		System.out.println("A soma dos 5 números digitados é " + soma + ", e a média é " + media);
	}
}
