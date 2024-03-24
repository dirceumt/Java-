public class Main {
	public static void main(String[] args) {

		int[] notas = new int[5];
		//usar quando se sabe só a quantidade de índices que deseja, tem que instanciar o objeto com o new;

		//índice inicia com 0, no caso do array acima é 0  1  2  3  4
												     // 0  0  0  0  0
		int[] notas1 = {7,8,5,6,4};
		//usar quando se sabe os valores, ja são alocados autimaticamente nos índices
		System.out.println(notas1);

		//[I@5f184fc6 imprime somente o endereço na memória do objeto (array);
		System.out.println(notas1[0]);
		System.out.println(notas1[1]);
		System.out.println(notas1[2]);
		System.out.println(notas1[3]);
		System.out.println(notas1[4]);

		// 0  1  2  3  4
		// 7  8  5  6  4
		notas1 [0] = 10;
		double media = (notas1 [0] + notas1 [1] + notas1 [2])/3;
		System.out.printf("MEDIA: %.2f", media);

	}
}