package entidades;
public class Produto {
	public String nome;
	public int quantidade;
	public double valor;
	public double valorEstoque (int valor){
		double total =  valor * quantidade;
		return total;
	}
	public void addProduto(int quantidade){
		this.quantidade += quantidade;
	}
	public void remover (int quantidade){
		this.quantidade -= quantidade;
	}

}
