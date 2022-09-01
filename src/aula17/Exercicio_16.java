package aula17;

/*A série de Fibonacci é formada pela seqüência
1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série
até o n−ésimo termo.*/
public class Exercicio_16 {

	public static void main(String[] args) {

		int f1 = 0;
		int f2 = 1;
		int resultado = 0;
		System.out.print(f2 + " ");
		for(int n = 0; n < 20; n++) {			
			resultado = f1 + f2;
			f1 = f2;
			f2 = resultado;
			System.out.print(resultado + " ");
		}
	}

}
