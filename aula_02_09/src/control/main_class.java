//1. Crie um programa para ler a matrícula e o salário de dois empregados. Descontar
//5% no salário do primeiro e acrescentar 9% no salário do segundo. Informar: o
//valor do desconto do primeiro; o valor do acréscimo do segundo; o salário
//final do primeiro; o salário final do segundo.

package control;
import java.util.Scanner;
import java.text.DecimalFormat;

public class main_class {
	
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		DecimalFormat df = new DecimalFormat("0.00");
//		
//		System.out.println("Matricula: ");
//		int matricula = sc.nextInt();
//		System.out.println("Salario: ");
//		double salario = sc.nextFloat();
//
//		
//		System.out.println("Matricula: ");
//		int matricula2 = sc.nextInt();
//		System.out.println("Salario: ");
//		int salario2 = sc.nextInt();
//		
//		double desconto = salario * 0.05;
//		double salarioAjuste = salario - desconto;
//		
//		System.out.println("Desconto: R$" + df.format(desconto));
//		System.out.println("funcionario: [" + matricula + "] salario: R$" + df.format(salarioAjuste));
//		
//		double acrescimo = salario * 0.09;
//		double salarioAjuste2 = salario2 + acrescimo;
//		
//		System.out.println("Acrescimo: R$" + df.format(acrescimo));
//		System.out.println("funcionario: [" + matricula2 + "] salario: R$" + df.format(salarioAjuste2));
//		sc.close();
//	}	
	
	
//	2. Faça um programa que dado o valor da temperatura em graus FARENHEIT, calcular
//	e escrever o valor da temperatura em graus CELSIUS.
//	Fórmula: C = 5/9 * (F - 32)
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Temp em °F: ");
//		double F = sc.nextDouble();
//		
//		double C = (F- 32) * 5 / 9;
//		
//		System.out.print("Temp em °C: "+ C);
//		sc.close();
//	}
	
//	3. Faça um programa para solicitar o código, a quantidade de alunos do sexo
//	masculino, a quantidade de alunos do sexo feminino e a quantidade de alunos
//	aprovados de uma determinada turma.
//	Calcular e informar: a porcentagem de alunos do sexo masculino; a porcentagem
//	de alunos do sexo feminino; a porcentagem de alunos reprovados; o total de
//	alunos da turma.
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Codigo da turma: ");
//		int cod_Turma = sc.nextInt();
//		
//		System.out.print("N° alunos M: ");
//		int alunos_M = sc.nextInt();
//		
//		System.out.print("N° alunos F: ");
//		int alunos_F = sc.nextInt();
//		
//		System.out.print("N° alunos aprovados: ");
//		int alunos_Aprovados = sc.nextInt();
//
//		int alunos_Total = alunos_M + alunos_F;
//		int alunos_Reprovados = alunos_Total - alunos_Aprovados;
//		int percentual_Reprovados= (alunos_Reprovados*100) / alunos_Total; 
//		int percentual_M = (alunos_M*100) / alunos_Total;
//		int percentual_F = (alunos_F*100) / alunos_Total;
//		
//		System.out.println("Turma: "+ cod_Turma);
//		System.out.println("alunos reprovados: " +percentual_Reprovados +"%");
//		System.out.println("alunos masculinos: " +percentual_M +"%");
//		System.out.println("alunos femininos: " +percentual_F +"%");
//		System.out.println("alunos na turma: " +alunos_Total);
//		sc.close();
//	}
}
