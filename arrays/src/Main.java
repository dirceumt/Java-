import java.util.Comparator;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		int[] notas = {7, 5, 8, 10, 8};
		
		double media = Calculadora.calcularMedia(notas);
		System.out.println(media);

	}
}