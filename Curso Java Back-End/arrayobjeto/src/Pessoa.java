public class Pessoa {
	private String nome;
	private int idade;

	public Pessoa(String n, int i){
		this.setNome(n);
		this.setIdade(i);
	}
	public String getNome(){
		return nome;
	}

	public int getIdade(){
		return idade;
	}

}
