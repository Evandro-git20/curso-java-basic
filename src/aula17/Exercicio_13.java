package aula17;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
numero ele deseja ver a tabuada. A saída deve ser conforme o
exemplo abaixo:

o Tabuada de 5:
o 5 X 1 = 5
o 5 X 2 = 10
o ...
o 5 X 10 = 50

*/

public class Exercicio_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		int multiplicacao;
		
		for(int cont = 0; numero == 0 || numero > 10; cont++){
			System.out.println("Digite um número entre 1 a 10:");
			numero = scan.nextInt();
			if(numero > 0 && numero <= 10) {
				System.out.println("Tabuada de " + numero + ":");
				for(int i = 1; i < 11; i++) {
					multiplicacao = numero * i;
					System.out.println(numero + " x " + i + " = " + multiplicacao);
				}
			}		
		}
	}
}
