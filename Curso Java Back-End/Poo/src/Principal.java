public class Principal {

	public static void main(String[] args) {

		Carro meuCarro = new Carro();
		Pessoa pessoa = new Pessoa();
		meuCarro.anoFabricacao = 2021;
		meuCarro.cor = "Preto";
		meuCarro.fabricante = "Honda";
		meuCarro.modelo = "HR-V";
		meuCarro.proprietario = pessoa;

	}

}