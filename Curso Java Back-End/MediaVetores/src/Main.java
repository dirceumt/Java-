import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
				System.out.println("INFORME A QUANTIDADE DE NOTAS: ");
		double media = Calculadora.calcularMedia();

		scan.nextLine();

	}
}