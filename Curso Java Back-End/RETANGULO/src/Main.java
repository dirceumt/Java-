import java.util.Locale;
import java.util.Scanner;
import entities.Calculos;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Calculos calculos = new Calculos();
		System.out.println("INFORME A LARGURA DO RETÂNGULO: ");
		calculos.largura = scan.nextFloat();
		System.out.println("INFORME O COMPRIMENTO DO RETÂNGULO: ");
		calculos.comprimento = scan.nextFloat();
		System.out.printf("A ÁREA DO RETÂNGULO É: %.2f%n", calculos.area());
		System.out.printf("O PERÍMETRO DO RETÂNGULO É:  %.2f%n", calculos.perimetro());
		System.out.printf("A DIAGONAL DO RETÂNGULO É:  %.2f%n", calculos.diagonal());


		
		
		
	

	}
}