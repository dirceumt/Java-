package entidades;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;
public class FunctionProduct {
	public List<Produtos> ListaProdutos;

	public FunctionProduct(){
		this.ListaProdutos = new ArrayList<>();
	}
		public void novoProduto() {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.println("DIGITE O NOME DO PRODUTO: ");
		String name = scan.next();
		System.out.println("DIGITE O PREÇO DO PRODUTO: ");
		double price = scan.nextDouble() ;
		System.out.println("DIGITE A QUANTIDADE DO PRODUTO: ");
		int quantity = scan.nextInt();
		System.out.println("PRODUTO CADASTRADO COM SUCESSO! ");
		System.out.println("DIGITE ( N ) PARA CADASTRAR UM NOVO PRODUTO OU ( V ) PARA VOLTAR AO MENU PRINCIPAL. ");
		String resposta = scan.next();
		if ("V".equalsIgnoreCase(resposta)){
			voltarMenu();
		}
		else{
			novoProduto();
		}

	}

	public void consultarEstoque(){
		System.out.println("""
=============================================
|             CONSULTA DE ESTOQUE            |""");
		System.out.println("""
================================================================
for (Produto produto : ListaProdutos){
|System.out.println("NOME: " + produto.getNome());             |
|System.out.println("PREÇO: " + produto.getPreco()");          |
|System.out.println("QUANTIDADE: " + produto.getQuantidade()");|
================================================================
""");
	}
		public void voltarMenu(){
		System.out.println("""
=============================================
|          GERENCIAMENTO DE ESTOQUE         |""");
		System.out.println("""
=============================================
|1 - DIGITE ( C ) PARA CADASTRAR UM PRODUTO;|
|2 - DIGITE ( R ) PARA REMOVER UM PRODUTO;  |
|3 - DIGITE ( E ) PARA CONSULTAR O ESTOQUE; |
|4 - DIGITE ( S ) PARA SAIR.                |
=============================================
""");

	}

public List<Produtos> getListaProdutos(){
	return ListaProdutos;
	}
}