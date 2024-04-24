import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Calendario calendario = new Calendario();//instancia a classe Calendario
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("INFORME O NUMERO DO MÊS");
			int numeroMes = scan.nextInt(); //declara a var numeroMes do tipo int e recebe o Scanner
			String nome = calendario.obterNomeMes(numeroMes); //cria uma var nome que recebe o metodo obterNomeMes e
			// atribui ao parâmetro numeroMes o valor recebido pela var numeroMes;
			System.out.printf("O MÊS SELECIONADO É: %s%n", nome);
			//imprime o nome do mes que vai ser atribuido a var nome de acordo com o valor recebido da var numeroMes que
			// corresponde ao String armazenado no indice do array mes da classe Calendario.
		}while(true);

	}
}