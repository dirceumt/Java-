public class Calculos {
	static double calcularMedia(int[] notas) {
		notas = new int[3];
		//declaro o metodo calcularMedia e ponho o array
		// notas como argumento do método
		double soma = 0;
		//crio uma variável do tipo double e atribuo o valor inicial 0;
		for (int i = 0; i < 3; i++) {
			//uso o loop for para percorrer o array;
			//inicio com a variável de controle i = 0;
			//enquanto i<3, pegue o valor de i e some 1 (i++ é a mesma coisa de i+1;
			soma += notas[i];

		}
		return soma / 3;

	}
}
