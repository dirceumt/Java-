import java.util.ArrayList;

public class Cardapio {
	ArrayList<ItemCardapio> itens = new ArrayList<>();
	void adicionarItem(ItemCardapio item){
		itens.add(item);
	}
	void removerItem(int indice){
	itens.remove(indice);
	}
	void consultarPrecos(double precoMinimo, double precoMaximo){
		for (ItemCardapio item : itens) {
			if(item.intervaloPreco(precoMinimo,precoMaximo))
				item.imprimir();

		}
	}
	void imprimir(double precoMinimo, double precoMaximo){
		//logica
	}
}
