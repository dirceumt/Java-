import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Produtos produtos = new Produtos();
		System.out.println("=================CADASTRO DE PRODUTOS=================\n");
		System.out.println("INFORME A QUANTIDADE DE PRODUTOS QUE DESEJA CADASTRAR: \n");
		int quantElementos;
		quantElementos = scan.nextInt();
		scan.nextLine();

		Produtos[] vetProdutos = new Produtos[quantElementos];

		double soma = 0;
		for (int i = 0; i < quantElementos; i++) {
			vetProdutos[i] = new Produtos();
			System.out.printf("INFORME O NOME DO PRODUTO: %d%n", i + 1);
			String nome = scan.nextLine();

			System.out.printf("INFORME O VALOR DO PRODUTO: %d%n", i + 1);
			double valor = scan.nextDouble();
			scan.nextLine();
			vetProdutos[i].nome = nome;
			vetProdutos[i].preco = valor;
			soma += valor;

		}
		double media = soma / quantElementos;
		System.out.printf("A MEDIA DE PREÇO E: %.2f%n", media);


	}
}