package aula17;
/*Faça um programa que imprima na tela apenas os números ímpares
entre 1 e 50.*/
public class Exercicio09 {

	public static void main(String[] args) {
		int[] numeros = new int[100]; 
		int divisao;
		int i = 0;
		
		for(; i < 100; i++) {
			if(i < 50) {
				divisao = i % 2;
				if(divisao == 1) {
					System.out.println(i);
				}
			}

		}System.out.println("Total de  números foi " + i);

	}

}
