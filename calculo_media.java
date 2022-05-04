package exercicios_prof_ohata;
import java.util.Scanner;

public class calculo_media {

	public static void main(String[] args) {
		//Titulo do exercicio
		System.out.print("Exercício - Calculando média das notas\n\n");
		
		//Declaracao de variaveis
		double ac1, ac2, ag, af;
		int resp = 0;
		
		//Declaracao de Scanner que sera usado para a entrada de dados
		Scanner input = new Scanner(System.in);
		
		//Looping para calcular nota de todos alunos
		do {
		//Entrada de dados ac1, ac2, ag, af;
		System.out.print("Qual foi sua nota em AC1 ? ");
		ac1 = input.nextFloat();
		
		System.out.print("Qual foi sua nota em AC2 ? ");
		ac2 = input.nextFloat();
		
		System.out.print("Qual foi sua nota em AG ? ");
		ag = input.nextFloat();
		
		System.out.print("Qual foi sua nota em AF ? ");
		af = input.nextFloat();
		
		//Atribuindo valores as variaveis ac1, ac2, ag, af;
		ac1 = ac1 * 0.15;
		ac2 = ac2 * 0.3; 
		ag = ag * 0.1;
		af = af * 0.45;
		
		//Conferindo resultado final das notas para saber se o 
		if (ac1 + ac2 + ag + af >= 5) {
			System.out.println("\nSua nota final foi " +(ac1 + ac2 + ag + af) +", você foi aprovado!\n");
		}
		else {
			System.out.println("\nSua nota final foi " +(ac1 + ac2 + ag + af) +", você foi reprovado!\n");
		} 
		
		System.out.println("Ainda existem alunos ? \nDigite:\nSim(0)\nNao(1)");
		resp = input.nextInt();
		
		}while (resp != 1);
		
		System.out.println("Até a próxima!!!");
	}
}
