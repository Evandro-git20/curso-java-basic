package aula17;

import java.util.Scanner;

public class Exercico05_scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = 0;
		double paisA;
		double paisB = -1;
		double taxaCrescimentoA = -1;
		double taxaCrescimentoB = -1;
		do {
			System.out.println("Digite a população do país A:");
			paisA = Double.parseDouble(scan.next());
			if(paisA < 0) {
				System.out.println("População deve ser maior que 0!");
			}
		}while(paisA < 0);
		do {
			System.out.println("Digite o valor da taxa de crescimento anual:");
			taxaCrescimentoA = Double.parseDouble(scan.next());
			if(taxaCrescimentoA < 0) {
				System.out.println("Taxa de crescimento deve ser maior que 0!");
			}
		}while(taxaCrescimentoA < 0);
		
		for(int i = 0; paisB < 0; i++) {
			System.out.println("Digite a população do país B:");
			paisB = Double.parseDouble(scan.next());
			if(paisB < 0) {
				System.out.println("População deve ser maior que 0!");
			}
			for(int j = 0; taxaCrescimentoB < 0; j++) {
				System.out.println("Digite o valor da taxa de crescimento anual:");
				taxaCrescimentoB = Double.parseDouble(scan.next());
				if(taxaCrescimentoB < 0) {
					System.out.println("Taxa de crescimento deve ser maior que 0!");
				}
				for(; paisB > paisA; c++) {
					paisA += (paisA/100)*taxaCrescimentoA;
					paisB += (paisB/100)*taxaCrescimentoB;
				}
			}
		}
		System.out.print("Quantidade de anos: "+c+" anos.");
		System.out.printf("\nPaís A: %.2f %n", paisA);
		System.out.printf("País B: %.2f %n", paisB);
	}
}
