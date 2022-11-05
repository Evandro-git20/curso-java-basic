package matrizes;

/*Modifique o programa anterior de maneira a guardar os
compromissos de todo o ano, organizados por mês, dia e hora
(só 8 horas por dia).*/

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String [][][] matriz = new String [12][31][8];
		String compromisso;
		boolean sair = false;
		int opcao = 0, mes = 0, dia = 0, hora = 0;
		
		while(!sair) {
			System.out.println("1 Cadastrar");
			System.out.println("2 Consultar");
			System.out.println("0 Sair");
			opcao = entrada.nextInt();
			
			if(opcao == 1) {
				boolean mesValido = false;
				while(!mesValido) {
					System.out.println("Entre com o mês");
					mes = entrada.nextInt();
					if(opcao >= 1 && opcao <= 12) {
						mesValido = true;
					}else {
						System.out.println("MÊS INVÁLIDO!");
					}
				}
				
				boolean diaValido = false;
				while(!diaValido) {
					System.out.println("Entre com o dia");
					dia = entrada.nextInt();
					if(opcao >= 1 && opcao <= 31) {
						diaValido = true;
					}else {
						System.out.println(""
								+ "DIA INVÁLIDO!");
					}
				}
				
				boolean horaValida = false;
				while(!horaValida) {
					System.out.println("Entre com a hora");
					hora = entrada.nextInt();
					if(opcao >= 1 && opcao <= 8) {
						horaValida = true;
					}else {
						System.out.println("HORA INVÁLIDO!");
					}
				}
				System.out.println("Entre com o compromisso");
				compromisso = entrada.next();
				
				matriz[mes][dia][hora] = compromisso;
				System.out.println();
				
			}else if(opcao == 2) {
				boolean mesValido = false;
				mesValido = false;
				while(!mesValido) {
					System.out.println("Entre com o mês");
					mes = entrada.nextInt();
					if(opcao >= 1 && opcao <= 12) {
						mesValido = true;
					}else {
						System.out.println("MÊS INVÁLIDO!");
					}
				}
				
				boolean diaValido = false;
				diaValido = false;
				while(!diaValido) {
					System.out.println("Entre com o dia");
					dia = entrada.nextInt();
					if(opcao >= 1 && opcao <= 31) {
						diaValido = true;
					}else {
						System.out.println(""
								+ "DIA INVÁLIDO!");
					}
				}
				
				boolean horaValida = false;
				horaValida = false;
				while(!horaValida) {
					System.out.println("Entre com a hora");
					hora = entrada.nextInt();
					if(opcao >= 1 && opcao <= 8) {
						horaValida = true;
					}else {
						System.out.println("HORA INVÁLIDO!");
					}
				}
				
				System.out.println();
				if(matriz[mes][dia][hora] != null) {
					System.out.println("O compromisso é "+matriz[mes][dia][hora]+".");
				}else {
					System.out.println("Não há registro de acordo com o mês, dia e hora digitados!");
				}
				System.out.println();
				
			}else if(opcao == 0) {
				sair = true;
				System.out.println("PROGRAMA ENCERRADO COM SUCESSO!");
			}else {
				System.out.println("\nOPÇÃO INVÁLIDA, DIGITE UM NÚMERO ENTRE 0 E 2!");
				System.out.println();
			}
		}
	}

}
