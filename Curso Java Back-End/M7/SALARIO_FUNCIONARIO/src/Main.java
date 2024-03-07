import java.util.Locale;
import java.util.Scanner;
import entities.CalcSalario;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		CalcSalario calcSalario = new CalcSalario();
		System.out.println("INFORME O NOME DO FUNCIONÁRIO: ");
		calcSalario.nome = scan.nextLine();
		System.out.println("INFORME O SALÁRIO BRUTO: ");
		calcSalario.salarioBruto = scan.nextDouble();
		System.out.println("INFORME O DESCONTO DO IRPF: ");
		calcSalario.irpf = scan.nextDouble();
		System.out.printf("NOME: %s %n", calcSalario.nome);
		System.out.printf("SALÁRIO LÍQUIDO: %.2f", calcSalario.salarioLiquido());






	}
}