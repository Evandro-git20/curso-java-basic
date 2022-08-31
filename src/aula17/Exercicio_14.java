package aula17;

import java.util.Scanner;

/*Faça um programa que peça dois números, base e expoente, calcule e
mostre o primeiro número elevado ao segundo número. Não utilize a
função de potência da linguagem.*/

public class Exercicio_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int multiplicacao = 0;
		
		System.out.println("Digite um número como base:");
		int base = scan.nextInt();
		
		System.out.println("Digite outro número como expoente:");
		int expoente = scan.nextInt();
		int resultado = base;
		
		for(int i = 1; i < expoente ; i++) {
			multiplicacao = resultado;
			resultado = multiplicacao * base;
		}
		System.out.println("Base " + base + " elevado a " + expoente + "º potência é: " + resultado);
	}
}
