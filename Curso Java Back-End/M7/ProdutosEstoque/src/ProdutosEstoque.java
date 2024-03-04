import entidades.Produto;
import java.util.Locale;
import java.util.Scanner;

public class ProdutosEstoque {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Produto produto = new Produto();
		String opcao;
		do {
			System.out.println("""
					=============================================
					|          GERENCIAMENTO DE ESTOQUE         |""");
			System.out.println("""
					=============================================
					|1 - DIGITE ( Q ) QUANTIDADE PRODUTO;        |
					|2 - DIGITE ( R ) REMOVER PRODUTO;          |
					|3 - DIGITE ( E ) CONSULTAR VALOR  ESTOQUE; |
					|4 - DIGITE ( S ) SAIR.                     |
					=============================================
					""");
			System.out.println("DIGITE A OPÇÃO DESEJADA: ");
			opcao = scan.next();

			switch (opcao){
				case 'Q':
				case 'q':
					String cadastro = produto.nome;
					break;
				case 'R':
				case 'r':
					int remov = produto.remover;
					break;
				case 'E':
				case 'e':
					double valor = produto.valorEstoque;
					break;

			}

		} while (!opcao.equalsIgnoreCase("S"));
	}
}