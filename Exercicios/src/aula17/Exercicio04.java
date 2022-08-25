package aula17;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		String nome = "";
		String sexo = "";
		String civil = "";
		int idade = -1;
		double salario = -1;
		boolean flag = false;
		
		do {
			do {
				System.out.println("Digite seu nome:");
				nome = scan.next();
				if(nome.length()<=3) {
					System.out.println("Nome deve ser acima de 3 caracteres!");
				}
			}while(nome.length()<=3);
			do {
				System.out.println("Digite sua idade:");
				idade = scan.nextInt();
				if(idade<0||idade>150) {
					System.out.println("Idade inválida!");
				}
			}while(idade<0||idade>150);
			do {
				System.out.println("Digite seu salário:");
				salario = scan.nextDouble();
				if(salario<0) {
					System.out.println("Salário inválido!");
				}
			}while(salario<0);
			do {
				System.out.println("Digite seu sexo: (M ou F)");
				sexo = scan.next();
				if(sexo.equalsIgnoreCase("m")||sexo.equalsIgnoreCase("f")){
					sexo = sexo;
				}else {
					System.out.println("Sexo inválido!");
					sexo = "";
				}
			}while(sexo == "");
			do {
				System.out.println("Digite seu estado civíl:");
				civil = scan.next();
				if( civil.equalsIgnoreCase("s")||
					civil.equalsIgnoreCase("c")||
					civil.equalsIgnoreCase("v")||
					civil.equalsIgnoreCase("d")){
					civil = civil;
				}else {
					System.out.println("Estado civil inválido!");
					civil = "";
				}
			}while(civil == "");
			flag = true;
		}while(!flag);
		System.out.println("Fim do programa!!!");
	}
}
