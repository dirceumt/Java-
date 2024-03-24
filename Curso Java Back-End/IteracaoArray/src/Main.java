import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Calculos calculos = new Calculos();
		double [] notasProvas = new double[3];
		System.out.println("INFORME A PRIMEIRA NOTA: ");
		notasProvas[0] = scan.nextDouble();
		System.out.println("INFORME A SEGUNDA NOTA: ");
		notasProvas[1] = scan.nextDouble();
		System.out.println("INFORME A TERCEIRA NOTA: ");
		notasProvas[2] = scan.nextDouble();
		double media = calculos.calcularMedia();
		System.out.println(media);
	}
}