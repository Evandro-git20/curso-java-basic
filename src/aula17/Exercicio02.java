package aula17;

import java.util.Scanner;

/*
Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações. 
*/
public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = false;
		
		do {
			System.out.println("Digite seu nome: ");
			String nome = scan.next();
			
			System.out.println("Digite sua senha:");
			String senha = scan.next();
			
			if(nome.equalsIgnoreCase(senha)) {
				System.out.println("A senha não pode ser igual ao seu nome!");
			}else {
				flag = true;
				System.out.println("Login!");
			}
		}while(!flag);	
	}
}
