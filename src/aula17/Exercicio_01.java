package aula17;

import java.util.Scanner;

/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.*/
public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner notas = new Scanner(System.in);
		int nota = 0;
		while(nota <= 10) {
			System.out.println("Digite uma nota: ");
			nota = notas.nextInt(); 
		}
			System.out.println("Programa encerrado!");

	}

}
