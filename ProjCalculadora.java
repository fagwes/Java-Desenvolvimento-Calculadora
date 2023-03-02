package calculadora;

import java.util.Scanner;

public class ProjCalculadora {

	static double resultado;
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Digite o primeiro algarismo 1: ");
		double num1 = sc.nextDouble();
		System.out.println("Digite o segundo algarismo  2: ");
		double num2 = sc.nextDouble();
		System.out.print(
				"Escolha uma das opções: \n 01: Somar \n 02: Subtrair \n 03: Multiplicar  \n 04: Dividir: \n Opção escolhida: ");
		int num3 = sc.nextInt();
		if (num3 < 5 && num3 > 0) {
			switch (num3) {

			case 1:
				resultado = num1 + num2;
				break;
			case 2:
				resultado = num1 - num2;
				break;
			case 3:
				resultado = num1 * num2;
				break;
			case 4:
				resultado = num1 / num2;
				break;

			}
			System.out.println("Resultado igual a: " + resultado);
		} else {
			// "Reinicie o programa e insira um número entre 1 a 4//
		}

	}
}
