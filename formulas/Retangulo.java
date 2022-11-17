package exercicios.formulas;

import java.util.Scanner;

public class Retangulo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\n¡rea do Ret‚ngulo \r");
        System.out.println("\nEscreva a medida da base do ret‚ngulo?\r");
        double base = entrada.nextDouble();
        System.out.println("\nEscreva a medida da altura do ret‚ngulo?\r");
        double altura = entrada.nextDouble();
        double area = base*altura;
        System.out.println("\nA ·rea do ret‚ngulo È " + area + "\r");
        entrada.close();
	}
}
