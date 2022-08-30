package aula17;

import java.util.Scanner;

/*Faça um programa que receba dois números inteiros e gere os
números inteiros que estão no intervalo compreendido por eles.*/
public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int primeiroNumero = 0;
		int segundoNumero = 0;

		System.out.println("Digite o primeiro número:");
		primeiroNumero = scan.nextInt();

		System.out.println("Digite o segundo número:");
		segundoNumero = scan.nextInt();
		
		if(primeiroNumero < segundoNumero) {
			System.out.print("Números compreendidos na ordem entre os digitados: ");
			for(int i = primeiroNumero; i < segundoNumero; i++) {
				if(i > primeiroNumero) {
					System.out.print(i+" ");
				}			
			}
		}else if(primeiroNumero > segundoNumero) {
			System.out.print("Números compreendidos na ordem entre os digitados: ");
			for(int i = primeiroNumero; i > segundoNumero; i--) {
				if(i < primeiroNumero) {
					System.out.print(i+" ");
				}
			}
		}
			
		System.out.println("\nFim!");
	}

}
