import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Cadastro cadastro = new Cadastro();

		Produtos item1 = new Produtos();
		item1.descricao = "Dipirona";
		item1.preco = 5.00;

		Produtos item2 = new Produtos();
		item2.descricao = "Ibuprofeno";
		item2.preco = 10.00;

		Produtos item3 = new Produtos();
		item3.descricao = "Fralda G";
		item3.preco = 50.00;

		cadastro.adicionarItem(item1);
		cadastro.adicionarItem(item2);
		cadastro.adicionarItem(item3);

		ArrayList<Produtos> itensBaratos = cadastro.consultarItensPorPreco(0, 100);

		for (Produtos item : itensBaratos) {
			System.out.printf("%s x R$%.2f%n", item.descricao, item.preco);
		}
	}

}