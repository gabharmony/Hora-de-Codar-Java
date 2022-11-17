package exercicios;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;

public class HoraCodae {
	
	static DecimalFormat num = new DecimalFormat("#.00");

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe qual exerc�cio\n 1) Baby Steps\n 2) Hello Clarice\n 3) A Bit of Information\n 4) Um pouco de Geometria\n 5) 1, 2 e 3\n 6) Qual o maior?\n 7) Qual o maior? (4 vezes pior)\n 8) Qual o qu�?\n 9) 5 vezes?\n 10) Enquanto isso\n 11) Cansar de Digitar\n 12) Parab�ns\n 13) BOOOOMMM\n 14) 10, 9, 8, 7, 6, 5, 4, 3, 2, 1...\n 15) De quanto at� quanto?\n 16) Passou no Teste?\n 17) Sair" + "\r\n");
		int escolha = entrada.nextInt();
		
		switch(escolha) {
			case 1: 
				ExercicioUm();
				break;
			case 2: 
				ExercicioDois();
				break;
			case 3:
				ExercicioTres();
				break;
			case 4:
				ExercicioQuatro();
				break;
			case 5:
				ExercicioCinco();
				break;
			case 6:
				ExercicioSeis();
				break;
			case 7:
				ExercicioSeisUm();
				break;
			case 8:
				ExercicioSete();
				break;
			case 9:
				ExercicioSeteUm();
				break;
			case 10:
				ExercicioOito();
				break;
			case 11:
				ExercicioNove();
				break;
			case 12:
				ExercicioDez();
				break;
			case 13:
				ExercicioOnze();
				break;
			case 14:
				ExercicioDoze();
				break;
			case 15:
				ExercicioTreze();
				break;
			case 16:
				ExercicioCatorze();
				break;
			case 17:
				MainSair();
				break;
			default:
				ErroMain();
				break;
		}
		
		entrada.close();
	}
	
	public static void ExercicioUm() {
		/* Escreva um programa em Java e crie uma vari�vel chamada "Planeta" e atribua-a um valor "Plut�o". 
		 * Exiba o valor para o usu�rio. */
		
		System.out.println("Escreva um programa em Java e crie uma vari�vel chamada \"Planeta\" e atribua-a um valor \"Plut�o\". Exiba o valor para o usu�rio." + "\r\n");
		String planeta = "Plut�o";
	    System.out.println(planeta + "\n\r");
	     
	     main(null);
	}
	
	public static void ExercicioDois() {
		/*Escreva um programa em Java em que o usu�rio informe o seu nome e exiba a mensagem 
		 * "Ol�, [NomeDoUsuario]".*/
		Scanner entrada = new Scanner(System.in);
		System.out.println("\rQual o seu nome?\r");
        String nome = entrada.nextLine();
        System.out.println("\nOl�! " + nome);
        
        main(null);
        entrada.close();
	}
	
	public static void ExercicioTres() {
		/* Escreva um programa em Java em que o usu�rio informe o seu nome e em seguida o programa perguntar� 
		 * a idade do usu�rio. Agora o programa deve exibir a mensagem "Ol�, [NomeDoUsuario], sua idade
		 *  � [idade]". */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("\rEscreva seu nome?\r");
        String nome = entrada.nextLine();
        System.out.println("\rEscreva sua idade:\r");
        int idade = entrada.nextInt();
        System.out.println("\rOl�, " + nome + ", sua idade � " + idade + "\r");
        
        main(null);
        entrada.close();
	}
	
	public static void ExercicioQuatro() {
		
		/* Considerando a figura acima, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas �reas.
		 * O usu�rio ir� informar os valores de cada vari�vel. Crie um arquivo para cada f�rmula e poste os  arquivos no GitHub. */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nEscolha um c�lculo de �rea: \n 1- Ret�ngulo\n 2 - Quadrado\n 3 - Losango\n 4 - Trap�zio\n 5 - Paralelogramo\n 6 - Tri�ngulo\n 7 - C�rculo\n 8 - Sair\r");
		int escolha = entrada.nextInt();
		
		switch (escolha) {
		case 1:
			QuatroRetangulo();
			break;
		case 2:
			QuatroQuadrado();
			break;
		case 3:
			QuatroLosango();
			break;
		case 4:
			QuatroTrapezio();
			break;
		case 5:
			QuatroParalelogramo();
			break;
		case 6:
			QuatroTriangulo();
			break;
		case 7:
			QuatroCirculo();
			break;
		case 8:
			QuatroSair();
			break;
		default:
			ErroExQuatro();
			break;
		}
		
		entrada.close();
	}
	
	public static void QuatroRetangulo() {
		/* �rea do Ret�ngulo */
		Scanner entrada = new Scanner(System.in);
		System.out.println("\n�rea do Ret�ngulo \r");
        System.out.println("\nEscreva a medida da base do ret�ngulo?\r");
        double base = entrada.nextDouble();
        System.out.println("\nEscreva a medida da altura do ret�ngulo?\r");
        double altura = entrada.nextDouble();
        double area = base*altura;
        System.out.println("\nA �rea do ret�ngulo � " + num.format(area) + "\r");
        ExercicioQuatro();
        entrada.close();
	}
	
	public static void QuatroQuadrado() {
		/* �rea do Quadrado */
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nInforme a medida do lado do quadrado?\r");
        double lado = entrada.nextDouble();
        double area = lado*lado;
        System.out.println("\nA �rea do quadrado � " + num.format(area) + "\r");
        ExercicioQuatro();
        entrada.close();
	}
	
	public static void QuatroLosango() {
		/* �rea do Losango */
		Scanner entrada = new Scanner(System.in);
        System.out.println("\nInforme a medida da diagonal maior\r");
        double diagMaior = entrada.nextDouble();
        System.out.println("\nInforme a medida da diagonal menor\r");
        double diagMenor = entrada.nextDouble();
        double area = (diagMaior*diagMenor)/2;
        System.out.println("\nA �rea do losango � " + num.format(area) + "\r");
		ExercicioQuatro();
		entrada.close();
	}
	
	public static void QuatroTrapezio() {
		// �rea do Trap�zio
		Scanner entrada = new Scanner(System.in);
        System.out.println("\nInforme a medida da base maior\r");
        double baseMaior = entrada.nextDouble();
        System.out.println("\nInforme a medida da base menor\r");
        double baseMenor = entrada.nextDouble();
        System.out.println("\nInforme a medida da altura\r");
        double altura = entrada.nextDouble();
        double area = (baseMaior+baseMenor)*altura/2;
        System.out.println("\nA medida da �rea � " + num.format(area) + "\r");
        ExercicioQuatro();
        entrada.close();
	}
	
	public static void QuatroParalelogramo() {
		// �rea do Paralelogramo
		Scanner entrada = new Scanner(System.in);
        System.out.println("\nInforme a medida da base\r");
        double base = entrada.nextDouble();
        System.out.println("\nInforme a medida da altura\r");
        double altura = entrada.nextDouble();
        double area = base*altura;
        System.out.println("\nA medida da �rea � " + num.format(area) + "\r");
        ExercicioQuatro();
        entrada.close();
	}
	
	public static void QuatroTriangulo() {
		// �rea do Tri�ngulo
		Scanner entrada = new Scanner(System.in);
        System.out.println("\nInforme a medida da base\r");
        double base = entrada.nextDouble();
        System.out.println("\nInforme a medida da altura\r");
        double altura = entrada.nextDouble();
        double area = (base*altura)/2;
        System.out.println("\nA medida da �rea � " + num.format(area) + "\r");
        ExercicioQuatro();
        entrada.close();
	}

	public static void QuatroCirculo() {
		// �rea do C�rculo
		Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a medida do raio:\r\n");
        double raio = entrada.nextDouble();
        double area = Math.PI*Math.pow(raio, 2);
        System.out.println("\nA medida da �rea � " + num.format(area) + "\r");
        ExercicioQuatro();
        entrada.close();
	}
	
	
	
	public static void ExercicioCinco() {
		/* Fa�a um programa que leia um valor informado pelo usu�rio e diga se o valor informado � positivo, negativo ou neutro. */
		
		Scanner entrada = new Scanner(System.in);
        System.out.println("\nInforme um n�mero \r");
        int num = entrada.nextInt();
        
        if(num == 0){
        	System.out.println("\nO n�mero � neutro\n");
        	main(null);
        	entrada.close();
        }else {
        	if(num > 0){
                System.out.println("\nO n�mero � positivo\n");
                main(null);
                entrada.close();
            }else {
            	System.out.println("\nO n�mero � negativo\n");
            	main(null);
            	entrada.close();
            }
        }
	}
	
	public static void ExercicioSeis() {
		/* Fa�a um programa para ler 3 valores (considere que n�o ser�o informados valores iguais) e escrever o maior deles. */
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nInforme o primeiro n�mero" + "\r");
		int numUm = entrada.nextInt();
	    System.out.println("\nInforme o segundo n�mero" + "\r");
	    int numDois = entrada.nextInt();
	    System.out.println("\nInforme o terceiro n�mero" + "\r");
	    int numTres = entrada.nextInt();
	    
	    int maiorNum = Math.max(numUm, Math.max(numDois, numTres));
	    
	    System.out.println("O maior n�mero �: " + maiorNum + "\r");
	    main(null);
	    entrada.close();
	    
	}
	
	public static void ExercicioSeisUm() {
		/* Fa�a um programa para ler 4 valores (considere que n�o ser�o informados valores iguais) e escrever o maior deles. */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nInforme o primeiro n�mero" + "\r");
		int numUm = entrada.nextInt();
	    System.out.println("\nInforme o segundo n�mero" + "\r");
	    int numDois = entrada.nextInt();
	    System.out.println("\nInforme o terceiro n�mero" + "\r");
	    int numTres = entrada.nextInt();
	    System.out.println("\nInforme o quarto n�mero" + "\r");
	    int numQuatro = entrada.nextInt();
	    
	    int verificaMaior = Math.max(numUm, Math.max(numDois, numTres));
	    
	    int numMaior = Math.max(verificaMaior, numQuatro);
	    
	    System.out.println("O maior n�mero digitado foi o " + numMaior + "\r");
	    
	    main(null);
	    entrada.close();
	}
	
	public static void ExercicioSete() {
		/* Fa�a um programa que leia  3 valores (considere que n�o ser�o informados valores iguais) e escrever a soma dos 2 maiores.  */
		
		Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro n�mero");
        int numUm = entrada.nextInt();
        System.out.println("Informe o segundo n�mero");
        int numDois = entrada.nextInt();
        System.out.println("Informe o terceiro n�mero");
        int numTres = entrada.nextInt();
        int menorNum = Math.min(numUm, Math.min(numDois, numTres));
        int soma = (numUm + numDois + numTres) - menorNum;
        
        System.out.println("A soma dos dois maiores n�meros � " + soma);
        
        main(null);
        entrada.close();
	}
	
	public static void ExercicioSeteUm() {
		/* Fa�a um programa que leia 5  valores (considere que n�o ser�o informados valores iguais) e escrever a soma dos 2 maiores */
		
		int soma = 0;
		int maior = 0;
		int numMaior = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nInforme o primeiro n�mero" + "\r");
		int numUm = entrada.nextInt();
	    System.out.println("\nInforme o segundo n�mero" + "\r");
	    int numDois = entrada.nextInt();
	    System.out.println("\nInforme o terceiro n�mero" + "\r");
	    int numTres = entrada.nextInt();
	    System.out.println("\nInforme o quarto n�mero" + "\r");
	    int numQuatro = entrada.nextInt();
	    System.out.println("\nInforme o quinto n�mero" + "\r");
	    int numCinco = entrada.nextInt();
	    
	    int verificaMaior = Math.max(numUm, Math.max(numDois, Math.max(numTres, Math.max(numQuatro, numCinco))));
	    
	    soma += verificaMaior;
	    
	    if(verificaMaior == numUm) {
	    	maior = Math.max(numDois, Math.max(numTres, numQuatro));
	    	numMaior = Math.max(numCinco, maior);
	    	
	    	soma += numMaior;
	    	System.out.println("\nA soma dos dois maiores � " + soma + "\r");
	    	
	    }else if(verificaMaior == numDois) {
	    	maior = Math.max(numUm, Math.max(numTres, numQuatro));
	    	numMaior = Math.max(numCinco, maior);
	    	
	    	soma += numMaior;
	    	System.out.println("A soma dos dois maiores � " + soma + "\r");
	    	
	    }else if(verificaMaior == numTres) {
	    	maior = Math.max(numUm, Math.max(numDois, numQuatro));
	    	numMaior = Math.max(numCinco, maior);
	    	
	    	soma += numMaior;
	    	System.out.println("A soma dos dois maiores � " + soma + "\r");
	    	
	    }else if(verificaMaior == numQuatro) {
	    	maior = Math.max(numUm, Math.max(numDois, numTres));
	    	numMaior = Math.max(numCinco, maior);
	    	
	    	soma += numMaior;
	    	System.out.println("A soma dos dois maiores � " + soma + "\r");
	    	
	    }else {
	    	maior = Math.max(numUm, Math.max(numDois, numTres));
	    	numMaior = Math.max(numQuatro, maior);
	    	
	    	soma += numMaior;
	    	System.out.println("A soma dos dois maiores � " + soma + "\r");
	    }
	    
	    main(null);
	    entrada.close();
	    
	}
	
	public static void ExercicioOito() {
		/* Fa�a um programa para ler 2 valores informados pelo usu�rio e se o segundo valor informado for neutro, deve ser lido um novo 
		 * valor - ou seja, para o segundo valor n�o pode ser aceito o valor zero nem um valor negativo. O programa deve imprimir 
		 * o resultado da divis�o do primeiro valor lido pelo segundo valor lido.  */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nDigite o primeiro n�mero:\r");
		double numUm = entrada.nextDouble();
		System.out.println("\nDigite o segundo n�mero:\r");
		double numDois = entrada.nextDouble();
		
		while(numDois <= 0) {
			System.out.println("\nDigite o segundo n�mero:\r");
			numDois = entrada.nextDouble();
		}
		
		double divisao = numUm/numDois;
		
		System.out.println("A resultado da divis�o entre o primeiro e o segundo � " + divisao);
		
		main(null);
		entrada.close();
	}
	
	public static void ExercicioNove() {
		/* Fa�a um programa que leia 10 valores informados pelo usu�rio, calcule, exiba os n�meros informados e escreva a m�dia aritm�tica 
		 * desses valores lidos. */
		
		Scanner entrada = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		int contagem = 1;
		double soma = 0;
		int numUser = 0;
		double media = 0;
		
		while(contagem <= 10) {
			System.out.println("\nDigite o n�mero " + contagem + ":\r");
			numUser = entrada.nextInt();
			nums.add(numUser);
			soma += numUser;
			contagem ++;
		}
		
		media = soma/10;
		
		System.out.println("\nA m�dia aritm�tica dos valores " + nums + " � " + media + "\r");
		main(null);
		entrada.close();
		
	}
	
	public static void ExercicioDez() {
		/* Escreva um programa para ler as notas das 4 avalia��es de um aluno no semestre, calcular e escrever a m�dia do semestre e a 
		 * seguinte mensagem: PARAB�NS! Voc� foi aprovado! somente se o aluno foi aprovado (considere 6.0 a m�dia m�nima para aprova��o
		 *  e 4 notas informadas).  */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nInforme a primeira nota: \r");
		double notaUm = entrada.nextDouble();
		System.out.println("\nInforme a segunda nota: \r");
		double notaDois = entrada.nextDouble();
		System.out.println("\nInforme a terceira nota: \r");
		double notaTres = entrada.nextDouble();
		System.out.println("\nInforme a quarta nota: \r");
		double notaQuatro = entrada.nextDouble();
		
		double media = (notaUm+notaDois+notaTres+notaQuatro)/4;
		
		if(media >= 6.0) {
			System.out.println("\nPARAB�NS! Voc� foi aprovado!\r");
		}else {
			System.out.println("\nInfelizmente voc� foi reprovado!\r");
		}
		
		main(null);
		entrada.close();
	}
	
	public static void ExercicioOnze() {
		/* Crie uma bomba rel�gio (usando somente c�digo - para deixar claro!) cuja contagem regressiva v� de 30 a 0. 
		 * Utilize "document.write" para escrever em tela e no final da repeti��o escreva "EXPLOS�O". */
		
		int contagem = 30;
		
		while(contagem >= 0) {
			System.out.println(contagem + "...");
			contagem--;
		}
		
		System.out.println("\nEXPLOS�O\r");
		main(null);
	}
	
	public static void ExercicioDoze() {
		/* Escreva um algoritmo para imprimir os n�meros de 1 (inclusive) a 10 (inclusive) em ordem decrescente. */
		
		int contagem = 10;
		
		while(contagem > 0) {
			System.out.println(contagem);
			contagem--;
		}
		main(null);
	}
	
	public static void ExercicioTreze() {
		/* Fa�a um algoritmo que calcule e escreva a m�dia aritm�tica dos dois n�meros inteiros informados pelo usu�rio e todos os 
		 * n�meros inteiros entre eles. Considere que o primeiro sempre ser� menor que o segundo. */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nInforme o primeiro n�mero");
		int numInicio = entrada.nextInt();
		System.out.println("\nInforme o segundo n�mero");
		int numFinal = entrada.nextInt();
		double soma = numInicio+numFinal;
		double mediaNumInform = soma/2;
		int contagemEntre = numInicio + 1;
		int divisor = 0;
		double somaEntre = 0;
		double mediaEntre = 0;
		
		System.out.println("\nA m�dia dos dois n�meros informados � " + mediaNumInform);
		
		while(contagemEntre < numFinal) {
			somaEntre += contagemEntre;
			contagemEntre++;
			divisor++;
		}
		
		mediaEntre = somaEntre/divisor;
		
		System.out.println("\nA m�dia dos n�meros entre " + numInicio + " e " + numFinal + " � " + mediaEntre + "\r");
		main(null);
		entrada.close();
		
	}
	
	public static void ExercicioCatorze() {
		/* Escreva um programa para ler 2 notas de um aluno, calcular e imprimir a m�dia final. Considere que a nota de aprova��o � 6,5. 
		 * Logo ap�s escrever a mensagem "Calcular a m�dia de outro aluno Sim/N�o?" e solicitar um resposta. Se a resposta for "S", o programa 
		 * deve ser executado novamente, caso contr�rio deve ser encerrado exibindo a quantidade de alunos aprovados.  */
		
		Scanner entrada = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String verificaContinua = "S";
		int quantAprovados = 0;
		
		while(verificaContinua.equals("S")) {
			System.out.println("\nDigite a primeira nota\r");
			double notaUm = entrada.nextDouble();
			System.out.println("\nDigite a segunda nota\r");
			double notaDois = entrada.nextDouble();
			double media = (notaUm+notaDois)/2;
			System.out.println("\nA m�dia final desse aluno � " + media);
			
			System.out.println("\nCalcular a m�dia de outro aluno? Digite 'S' para Sim e 'N' para N�o.");
			verificaContinua = sc.nextLine().toUpperCase();
			if(media >= 6.5) {
				quantAprovados++;
			}
		}
		
		System.out.println("A quantidade de alunos aprovados � " + quantAprovados);
		main(null);
		entrada.close();
		sc.close();
	}
	
	
	public static void QuatroSair() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nVoc� quer voltar para o Menu Principal?\n\rDigite 'S' para Sim e 'N' para N�o. \r");
		String resposta = entrada.nextLine().toUpperCase();
		
		if(resposta.equals("S")) {
			main(null);
			entrada.close();
		}else if(resposta.equals("N")) {
			System.out.println("Voc� quer sair?\n\rDigite 'S' para Sim e 'N' para N�o. \r");
			String confirmaSaida = entrada.nextLine().toUpperCase();
			
			if(confirmaSaida.equals("S")) {
				System.out.println("Saindo....");
				System.exit(1);
				entrada.close();
			}
			else if(confirmaSaida.equals("N")) {
				main(null);
				entrada.close();
			}else {
				QuatroSair();
			}
			
		}else {
			QuatroSair();
		}
		
	}
	
	public static void MainSair() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Voc� quer sair?\n\rDigite 'S' para Sim e 'N' para N�o. \r");
		String confirmaSaida = entrada.nextLine().toUpperCase();
		
		if(confirmaSaida.equals("S")) {
			System.out.println("Saindo....");
			System.exit(1);
			entrada.close();
		}
		else if(confirmaSaida.equals("N")) {
			main(null);
			entrada.close();
		}else {
			MainSair();
		}
	}
	
	public static void ErroMain() {
		System.out.println("Informe um n�mero de 1 a 17.");
		main(null);
	}
	
	public static void ErroExQuatro() {
		System.out.println("Informe um n�mero de 1 a 8.");
		ExercicioQuatro();
	}
}
