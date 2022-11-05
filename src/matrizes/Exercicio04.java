package matrizes;

import java.util.Scanner;

/*Faça um programa para armazenar em uma matriz os
compromissos de uma agenda pessoal. Cada dia do mês deve
conter 24 horas, onde para cada uma destas 24 horas podemos
associar um tarefa específica (compromisso agendado). O
programa deve ter um menu onde o usuário indica o dia do mês
que deseja alterar e a hora, entrando em seguida com o
compromisso, ou então, o usuário pode também consultar a
agenda, fornecendo o dia e a hora para obter o
compromisso armazenado.*/

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String [][] matriz = new String [31][24];
		String compromisso;
		boolean sair = false;
		int opcao = 0, dia = 0, hora = 0;
		
		while(!sair) {
				
			System.out.println("1 cadastrar");
			System.out.println("2 Consultar");
			System.out.println("0 SAIR");
			
			opcao = entrada.nextInt();
			
			if(opcao == 1) {
				boolean diaValido = false;
				while(!diaValido) {
					System.out.println("Entre com o dia: ");
					dia = entrada.nextInt();
					if(dia >= 1 && dia <= 31) {
						diaValido = true;
					}else {
						System.out.println("Dia inválido!");
					}
				}
				
				boolean horaValida = false;
				while(!horaValida) {
					System.out.println("Entre com a hora do dia: ");
					hora = entrada.nextInt();
					if(hora >= 1 && hora <= 24) {
						horaValida = true;
					}else {
						System.out.println("Hora inválida!");
					}
				}
				
				System.out.println("Entre com o compromisso: ");
				compromisso = entrada.next();
				
				matriz[dia][hora] = compromisso;
				System.out.println();
				
			}else if(opcao == 2) {
				boolean diaValido = false;
				while(!diaValido) {
					System.out.println("Entre com o dia: ");
					dia = entrada.nextInt();
					if(dia >= 1 && dia <= 31) {
						diaValido = true;
					}else {
						System.out.println("Dia inválido!");
					}
				}
				
				boolean horaValida = false;
				while(!horaValida) {
					System.out.println("Entre com a hora do dia: ");
					hora = entrada.nextInt();
					if(hora >= 1 && hora <= 24) {
						horaValida = true;
					}else {
						System.out.println("Hora inválida!");
					}
				}
				
				System.out.println();
				if(matriz[dia][hora] != null) {
					System.out.println("O compromisso é "+matriz[dia][hora]+".");
				}else {
					System.out.println("Não há registro de acordo com o dia e hora digitados!");
				}
				System.out.println();
			}else if(opcao == 0) {
				sair = true;
				System.out.println("Programa encerrado com sucesso!");
			}else {
				System.out.println("\nOpção inválida, digite entre 0 e 2!");
				System.out.println();
			}
		}
	}
}
