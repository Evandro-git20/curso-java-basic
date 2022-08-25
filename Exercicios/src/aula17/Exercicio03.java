package aula17;

import java.util.Scanner;

/*
Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';
Obs.: Não passar para próxima pergunta enquanto a informação não for verdadeira.
*/
public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String nome = "";
		String sexo = "";
		String sexof = "f";
		String sexom = "m";
		String civil = "";
		int idade = -1;
		float salario = -1;
		for(int n = 0; nome.length()<=3; n++) {
			System.out.println("Digite seu nome:");
			nome = scan.next();
			if(nome.length()<=3) {
				System.out.println("Digite um nome acima de 3 caracteres! ");
			}else {
				for(int i = 0; idade < 0 || idade>150; i++) {
					System.out.println("Digite sua idade:");
					idade = scan.nextInt();
					if(idade < 0 || idade>150) {
						System.out.println("Idade inválida! ");
					}else {
						for(int s = 0; salario<0; s++) {
							System.out.println("Digite seu salário:");
							salario = scan.nextFloat();
							if(salario<0) {
								System.out.println("Salário inválido! ");
							}else {
								for(int j = 0; sexo.equalsIgnoreCase(""); j++) {
									System.out.println("Digite seu sexo:\n[M ou m] Masculino\n[F ou f] Feminino");
									sexo = scan.next();
									if(sexo.equalsIgnoreCase(sexom)||sexo.equalsIgnoreCase(sexof)) {
										sexo = sexo;
									}else {
										System.out.println("Sexo inválido! ");
										sexo = "";
									}
								}
								for(int e = 0; civil.equalsIgnoreCase(""); e++) {
									System.out.println("Digite seu estado civil:");
									civil = scan.next();
									if(civil.equalsIgnoreCase("s")||civil.equalsIgnoreCase("c")||civil.equalsIgnoreCase("v")||civil.equalsIgnoreCase("d")) {
										civil = civil;
									}else {
										System.out.println("Estado civil inválido! ");
										civil = "";
									}
								}
							}
						}			
					}
				}
			}
		}System.out.println("Fim do programa!");					
	}

}
