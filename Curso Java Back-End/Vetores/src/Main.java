import java.util.Locale;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	System.out.println("INFORME A QUANTIDADE DE NOTAS: ");
	int quantNotas = scan.nextInt(); //escaneia o valor atribuido a quantNotas
	scan.nextLine();
	double [] notas = new double[quantNotas];
		/*cria um vetor que recebe como argumento o numero atribido a quantNotas
		que a quantidade de membros é de acordo com a entrada do usuário loop
		for que vai rodar quantas vezes o usuário atribuir a variável*/
		for(int i=0;i<quantNotas; i++){
									         //quantNotas, i recebe zero (i=0), enquanto i< que o numero recebid com
										     //entrada do usuário (quantNotas), pega o valor de i e soma +(incremento i+1);
			System.out.printf("INFORME A NOTA %d%n", i+1); //solicita nota e da o valor do indice+1 como numero da nota
			notas[i] = scan.nextDouble(); //recebe do scan o valor digitado e armazena na posição i que tiver de acordo
										 //com o loop. cada rodada o usuario entra com o valor que vai sendo armazenado
		}
		double soma = 0; //cria uma variavel soma inicializando com zero (0);
		for(int i=0; i<quantNotas;i++){ //mesmo que o loop antetior;
			soma += notas[i]; //cada rodada do loop ele pega o valor da nota que foi inserida e armazenada no vetor
						      // e atribui a variável soma. o soma += pega o valor de soma (0) e soma com o valor da
					         // entrada do usuário que foi armazenado no vetor até o loop acabar (i);
		}
		double media = soma/3; //cria uma variavel media e atribui a ela o valor da soma e divide por 3;
		System.out.printf("SUA MÉDIA É: %.2f", media); //imprime o valor da media.
	}
}