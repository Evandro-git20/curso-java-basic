package aula17;

import java.util.Scanner;

/*Altere o programa anterior para mostrar no final a soma dos números.*/

public class Exercicio_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int primeiroNumero = 0;
		int segundoNumero = 0;
		int soma = 0;

		System.out.println("Digite o primeiro número:");
		primeiroNumero = scan.nextInt();

		System.out.println("Digite o segundo número:");
		segundoNumero = scan.nextInt();
		
		if(primeiroNumero < segundoNumero) {
			System.out.print("Números compreendidos na ordem entre os digitados: ");
			for(int i = primeiroNumero; i < segundoNumero; i++) {
				if(i > primeiroNumero) {
					System.out.print(i+" ");
					soma += i;
				}			
			}
		}else if(primeiroNumero > segundoNumero) {
			System.out.print("Números compreendidos na ordem entre os digitados: ");
			for(int i = primeiroNumero; i > segundoNumero; i--) {
				if(i < primeiroNumero) {
					System.out.print(i+" ");
					soma += i;
				}
			}
		}
		System.out.println("\nA soma entre esses números é: " + soma);
		System.out.println("\nFim!");
	}
}
