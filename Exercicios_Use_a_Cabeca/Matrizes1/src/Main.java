public class Main {
	public static void main(String[] args) {
		Livros[] nomeLivros = new Livros[3];
		for (int i = 0; i < nomeLivros.length; i++) {//faz um loop for que percorre o array
			nomeLivros[i] = new Livros();//e a cada iteração ele cria um objeto e armazena no indice referente a
			// posição i
		}

		nomeLivros[0].titulo = "Dom Casmurro";
		nomeLivros[0].autor = "Machado Diassis";
		nomeLivros[0].Valor = 30;

		nomeLivros[1].titulo = "Bíblia";
		nomeLivros[1].autor = "vários autores";
		nomeLivros[1].Valor = 80;

		nomeLivros[2].titulo = "Deus Está Morto";
		nomeLivros[2].autor = "Frederich Nietzsche";
		nomeLivros[2].Valor = 35;

		for (Livros nomeLivro : nomeLivros) {
			System.out.printf("Livro: %s;%n", nomeLivro.titulo);
			System.out.printf("Autor: %s;%n", nomeLivro.autor);
			System.out.printf("Valor: %.2f.%n", nomeLivro.Valor);
			System.out.println();
		}
	}
}



