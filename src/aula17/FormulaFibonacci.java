package aula17;

public class FormulaFibonacci {
	public static int fibonacci(int numero) {
		if(numero < 2) {
			return 1;
		}
		return fibonacci(numero - 1) + fibonacci(numero - 2);
	}
}
