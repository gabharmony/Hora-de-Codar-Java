package exercicios.formulas;

import java.util.Scanner;

public class Trapézio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        System.out.println("\nInforme a medida da base maior\r");
        double baseMaior = entrada.nextDouble();
        System.out.println("\nInforme a medida da base menor\r");
        double baseMenor = entrada.nextDouble();
        System.out.println("\nInforme a medida da altura\r");
        double altura = entrada.nextDouble();
        double area = ((baseMaior+baseMenor)*altura)/2;
        System.out.println("\nA medida da área é " + area + "\r");
        entrada.close();

	}

}
