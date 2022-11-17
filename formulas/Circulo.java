package exercicios.formulas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		DecimalFormat num = new DecimalFormat("#.00");
		Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a medida do raio:\r\n");
        double raio = entrada.nextDouble();
        double area = Math.PI*Math.pow(raio, 2);
        System.out.println("\nA medida da área é " + num.format(area) + "\r");
        entrada.close();
	}

}
