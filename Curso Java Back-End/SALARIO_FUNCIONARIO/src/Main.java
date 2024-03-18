import java.util.Locale;
import java.util.Scanner;
import entities.CalcSalario;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		CalcSalario calcSalario = new CalcSalario();
		do {
			System.out.println("PARA CALCULAR SALÁRIO LÍQUIDO (C);\nPARA CALCULAR AUMENTO (A);\n(S) PARA SAIR.\n");
			String opcao = scan.next().toUpperCase();
			switch (opcao){
				case "C":
					calc(calcSalario, scan);
					break;
				case "A":
					System.out.println("INFORME O PERCENTUAL DO AUMENTO: \n");
					double percentualAumento = scan.nextDouble();
					calcSalario.setAumento(percentualAumento);
					double salarioAumentado = calcSalario.aumentoSalario();
					System.out.printf("SEU SALÁRIO COM AUMENTO É: %.2f%n", salarioAumentado);

					break;
				case "S":
					System.exit(0);
				break;
				default:
					System.out.println("OPÇÃO INVÁLIDA!");
			}
		} while(true);
	}
		public static void calc(CalcSalario calcSalario, Scanner scan){
		System.out.println("INFORME O NOME DO FUNCIONÁRIO: ");
			scan.nextLine();
		calcSalario.nome = scan.nextLine();
		System.out.println("INFORME O SALÁRIO BRUTO: ");
		calcSalario.salarioBruto = scan.nextDouble();
		System.out.println("INFORME O DESCONTO DO IRPF: ");
		calcSalario.irpf = scan.nextDouble();
		System.out.printf("NOME: %s %n\n", calcSalario.nome);
		System.out.printf("SALÁRIO LÍQUIDO: %.2f\n", calcSalario.salarioLiquido());
	}

}