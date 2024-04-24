public class ItemCardapio {
	String nomeProduto;
	double preco;
	boolean intervaloPreco(double precoMinimo, double precoMaximo){
		return preco >= precoMinimo && preco <= precoMaximo;
		//cria metodo que recebe como parametro a faixa de preco e retorna os valores entre essa faixa
	}
	void imprimir(){
		System.out.printf("%s - R$%.2f%n", nomeProduto, preco);
	}
}
