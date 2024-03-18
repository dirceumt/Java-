import entidades.Calc;
import java.util.Scanner;
import java.util.Locale;
public class CalcBinario {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		do {
			System.out.println("DIGITE UM NÚMERO DECIMAL: ");
			int decimal = scan.nextInt();
			entidades.Calc calcular = new entidades.Calc();

			String binario = calcular.converter(decimal);
			System.out.printf("O NÚMERO EQUIVALENTE A %d EM BINÁRIO É %s", decimal, binario);
			System.out.println("DESEJA OUTRA CONVERSÃO? S/N?");
			String resposta = scan.next().toUpperCase();
			if (resposta == "N") {
				break;
			}
		} while(true);
		System.out.println("programa encerrado! ");
		scan.close();

	}
}