package aula17;

import java.util.Scanner;

/*Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
*/
public class Exercicio_17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int resultado;
		int fatorial;
		int copia;
		
		System.out.println("Digite um número:");
		int numero = scan.nextInt();
		fatorial = copia = numero;
		//int copia = numero;
		
		for(int i = numero - 1; i > 0; i--) {
			resultado = fatorial * i;
			fatorial = resultado;
		}
		System.out.print("\nO fatorial de " + numero + " é = " + fatorial + "\n\nFórmula:\n");
		
		System.out.print(copia);
		for(int cont = numero-1; cont > 0; --cont) {
			if(cont >= 1) {
				System.out.print(" x ");
			}
			System.out.print(cont);
			if(cont == 1) {
				System.out.print(" = " + fatorial);
			}
			
		}
		
	}

}
