package exercicios.formulas;

import java.util.Scanner;

public class Paralelogramo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        System.out.println("\nInforme a medida da base\r");
        double base = entrada.nextDouble();
        System.out.println("\nInforme a medida da altura\r");
        double altura = entrada.nextDouble();
        double area = base*altura;
        System.out.println("\nA medida da área é " + area + "\r");
        entrada.close();

	}

}
