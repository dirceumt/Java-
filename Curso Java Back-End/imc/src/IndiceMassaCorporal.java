import java.util.Scanner;
import java.util.Locale;
public class IndiceMassaCorporal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		CalculoImc calculoImc = new CalculoImc();
		System.out.println("INFORME SEU PESO: ");
		calculoImc.peso = scan.nextDouble();
		scan.nextLine();
		System.out.println("INFORME SUA ALTURA: ");
		calculoImc.altura = scan.nextDouble();
		scan.nextLine();
		System.out.printf("SEU IMC É: %.2f", calculoImc.imc());


	}
}