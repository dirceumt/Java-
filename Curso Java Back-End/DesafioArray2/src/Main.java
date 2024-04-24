import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		Cardapio cardapio = new Cardapio();

		ItemCardapio item1 = new ItemCardapio();
		item1.nomeProduto = "OVO";
		item1.preco = 1;

		ItemCardapio item2 = new ItemCardapio();
		item2.nomeProduto = "Feijão";
		item2.preco = 8;

		ItemCardapio item3 = new ItemCardapio();
		item3.nomeProduto = "Arroz";
		item3.preco = 5;

		ItemCardapio item4 = new ItemCardapio();
		item4.nomeProduto = "Rapadura";
		item4.preco = 4.5;

		cardapio.adicionarItem(item1);
		cardapio.adicionarItem(item2);
		cardapio.adicionarItem(item3);
		cardapio.adicionarItem(item4);

		ArrayList<ItemCardapio> precoItens = cardapio.


	}
}