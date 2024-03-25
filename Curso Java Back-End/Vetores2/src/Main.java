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
			vetProdutos[i] = new Produtos(); //instancia objeto Produtos aponta p/posição referte ao numero i (índice)
			//toda ves que o loop inicia ele chama o construtor padrão Produtos na classe Produtos e cria um novo objeto
			System.out.printf("INFORME O NOME DO PRODUTO: %d%n", i + 1);
			String nome = scan.nextLine();
			System.out.printf("INFORME O VALOR DO PRODUTO: %d%n", i + 1);
			double valor = scan.nextDouble();
			scan.nextLine();
			vetProdutos[i].nome = nome;
			vetProdutos[i].preco = valor;
			//recebe o nome e o valor do produto e atribui aos parametros do objeto da classe Produto armazenados no
			// espaço referente ao índice i do vetor;
			soma += valor; //atribui a variavel soma o valor, sempre pegando soma = soma+ valor durante o loop
		}
		double media = soma / quantElementos; //calcula a média
		System.out.printf("A MEDIA DE PREÇO E: %.2f%n", media);
	}
}