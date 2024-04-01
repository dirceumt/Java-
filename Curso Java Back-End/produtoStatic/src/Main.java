import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("INFORME O VALOR DO PRODUTO: ");
		double valorProduto = scan.nextDouble();
		scan.nextLine();
		System.out.println("INFORME A MARGEM DE LUCR0: ");
		double margemLucro = scan.nextDouble();
		scan.nextLine();
		double valorVenda = Matematic.valorVenda(valorProduto, margemLucro)+Matematic.precoEmbalagem;
		double lucroLiquido = Matematic.lucroLiquido(valorProduto, valorVenda);

		System.out.printf("VALOR DA COMPRA: %.2f%n", valorProduto);
		System.out.printf("VALOR DA EMBALAGEM: %.2f%n", Matematic.precoEmbalagem);
		System.out.printf("VALOR DA MARGEM: %.2f%n", margemLucro);
		System.out.printf("VALOR DA VENDA: %.2f%n", valorVenda);
		System.out.printf("VALOR DO LUCRO LIQUIDO: %.2f%n", lucroLiquido);
	}

}
