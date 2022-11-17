package exercicios.formulas;

import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nInforme a medida do lado do quadrado?\r");
        double lado = entrada.nextDouble();
        double area = lado*lado;
        System.out.println("\nA área do quadrado é " + area + "\r");
        entrada.close();
	}

}
