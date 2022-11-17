package exercicios.formulas;

import java.util.Scanner;

public class Losango {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        System.out.println("\nInforme a medida da diagonal maior\r");
        double diagMaior = entrada.nextDouble();
        System.out.println("\nInforme a medida da diagonal menor\r");
        double diagMenor = entrada.nextDouble();
        double area = (diagMaior*diagMenor)/2;
        System.out.println("\nA área do losango é " + area + "\r");
        entrada.close();

	}

}
