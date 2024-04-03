import java.util.Scanner;

public class AcessoMatrizes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("INFORME O TAMANHO DA MATRIZ DESEJADA: ");
		int novoTamanho = scan.nextInt();
		scan.nextLine();
		TamanhoMatriz tamanhoMatriz = new TamanhoMatriz();
		tamanhoMatriz.setTamanho(novoTamanho);
		System.out.println("INFORME QUAIS OS ELEMENTOS DA MATRIZ: ");
		for (int i = 0; i < novoTamanho; i++) {
			System.out.printf("informe o elemento %d%n", i);
			int valor = scan.nextInt();
			tamanhoMatriz.setMatriz(i, valor);
			System.out.printf("Sua matriz tem %d índices\n", tamanhoMatriz.getTamanho());
		}
		System.out.println("Os elementos de sua matriz são: \n");
		tamanhoMatriz.exibirMatrix();

	}
}