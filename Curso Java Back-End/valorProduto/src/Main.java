import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Produto produto = new Produto();

		System.out.println("===============================");
		System.out.println("===CALCULO DE VALOR DE VENDA===");
		System.out.println("===============================");
		System.out.println("INFORME O VALOR DE CUSTO: ");
		produto.precoCusto = scan.nextDouble();
		scan.nextLine();
		System.out.println("INFORME A MARGEM DE LUCRO DESEJADA (%): ");
		produto.margemLucro = scan.nextDouble();
		scan.nextLine();
		double precoTotalVenda = produto.calcularPrecoVenda()+Produto.custoEmbalagem;
		//chama custo de embalagem diretamente chamando a classe Produto e a variavel global custoEmbalagem (global)
		System.out.printf("-> O VALOR DE CUSTO DE SEU PRODUTO É DE: %.2f%n", produto.precoCusto);
		System.out.printf("-> SUA MARGEM DE LUCRO É DE: %.2f%n", produto.margemLucro);
		System.out.printf("-> O VALOR DA EMBALAGEM É DE: %.2f%n", Produto.custoEmbalagem);
		//chama custo de embalagem diretamente chamando a classe Produto e a variavel global custoEmbalagem (global)
		System.out.printf("-> O VALOR DE VENDA DO PRODUTO É DE: %.2f%n", precoTotalVenda);
		System.out.printf("-> SEU LUCRO LÍQUIDO É DE: %.2f%n", produto.lucroLiquido());


	}
}