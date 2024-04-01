package entidades;
public class Produtos { //CRIA A CLASSE PRODUTOS
	private String nome;//nome1
	private double preco;
	private int quantidade;//DECLARA AS VARIÁVEIS CECLARANDO A CHAVE DE ACESSO, TIPO E NOME DA VARIÁVEL;
	public Produtos (String nome, double preco, int quantidade){//cria o construtor Produtos e declarando como atributos
		//as variáveis criadas "Tipo parametro";
		this.nome = nome;//nome2
		// this quer dizer que vc está se referindo ao atributo da clase, no caso nome2 se refere ao nome1 ao usar
		//this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
}
