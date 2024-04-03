
public class TamanhoMatriz {
	private int tamanho;
	private int matriz[];

	int getTamanho(){
		return tamanho;
	}
	void setTamanho(int novoTamanho){
		this.tamanho = novoTamanho;
		this.matriz = new int[novoTamanho];
	}
	void setMatriz(int posicao, int valor){
		this.matriz[posicao] = valor;
	}
	void exibirMatrix(){
		for (int i = 0; i < matriz.length; i++) {
			System.out.printf("Seus elementos são: %d%n", matriz[i]);

		}
		System.out.println();
	}
}


