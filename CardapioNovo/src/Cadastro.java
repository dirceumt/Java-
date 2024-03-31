import java.util.ArrayList;

public class Cadastro {

	ArrayList<Produtos> itens = new ArrayList<>();
	//cria uma arraylist do tipo Produtos instanciando a classe Produtos.
	//variavel itens aponta para o arraylist

	void adicionarItem(Produtos item) {//cria metodo adicionarItem passando como parametro o objeto item
		itens.add(item); //chama a var itens que aponta para o arraylist e usa o metodo .add para
		// adicionar o objeto item ao arraylist
	}

	void removerItem(int indice) {//cria o metodo removerItem e pasa como parametro o objeto indice do tipo int
		itens.remove(indice); //chama var itens que aponta para o array e usa o metodo .remove o objeto que
		//vai está na no indice determinado;
	}

	void imprimirProdutos(double precoMinimo, double precoMaximo) {
		for (Produtos item : itens) {
			if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
				item.imprimir();
			}
		}
	}

	ArrayList<Produtos> consultarItensPorPreco(double precoMinimo, double precoMaximo) {
		ArrayList<Produtos> itensEncontrados = new ArrayList<>();

		for (Produtos item : itens) {
			if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
				itensEncontrados.add(item);
			}
		}

		// boa prática
		return itensEncontrados;

		// má prática
		// return itensEncontrados.isEmpty() ? null : itensEncontrados;
	}

}