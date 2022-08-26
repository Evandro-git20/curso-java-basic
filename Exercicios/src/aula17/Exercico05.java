package aula17;
/*
Supondo que a população de um país A seja da ordem de 80000
habitantes com uma taxa anual de crescimento de 3% e que a
população de B seja 200000 habitantes com uma taxa de crescimento
de 1.5%. Faça um programa que calcule e escreva o número de anos
necessários para que a população do país A ultrapasse ou iguale a
população do país B, mantidas as taxas de crescimento.
*/

public class Exercico05 {

	public static void main(String[] args) {

		double paisA = 80.000;
		double paisB = 200.000;
		double taxaDeCrescimentoA = 3;
		double taxaDeCrescimentoB = 1.5;
		int anos = 0;
		
		while(paisB > paisA) {
			paisA += (paisA/100)*taxaDeCrescimentoA;
			paisB += (paisB/100)*taxaDeCrescimentoB;
			anos++;
		}
		System.out.printf("Quantidades de anos necessários é de "+anos+" anos.\nPaís A %.2f %n",paisA);
		System.out.printf("País B %.2f %n",paisB);
	}

}
