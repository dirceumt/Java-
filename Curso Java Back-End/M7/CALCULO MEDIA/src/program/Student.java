package program;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.Locale;

public class Student {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Calcs calcs = new Calcs();
do {
	System.out.println();
	System.out.println("===============================");
	System.out.println("INFORME O NOME DO ALUNO:");
	System.out.println("===============================");
	String nome = scan.nextLine();
	System.out.println("===============================");
	System.out.println("INFORME AS TRÊS NOTAS DO ALUNO: ");
	System.out.println("===============================");
	System.out.println();

	System.out.println("PRIMEIRA NOTA: \n");
	double n1 = scan.nextDouble();
	System.out.println("SEGUNDA NOTA: \n");
	double n2 = scan.nextDouble();
	System.out.println("TERCEIRA NOTA: \n");
	double n3 = scan.nextDouble();
	double media = calcs.mediaTrimestre(n1, n2, n3);
	double diferenca = calcs.reprovacao();
	if (media >= 7) {
		System.out.println("====================================");
		System.out.printf("SUA MEDIA FOI: %.2f\n ALUNO APROVADO! \n", media);
		System.out.println("====================================");
	} else {
		System.out.println("==================================");
		System.out.printf("ALUNO REPROVADO POR %.2f PONTOS! \n", diferenca);
		System.out.printf("A MÉDIA FOI: %.2f ;\n", media);
		System.out.println("==================================");

	}

}while(true);
	}
}