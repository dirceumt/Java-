import entidades.FunctionProduct;
import java.util.Scanner;
import java.util.Locale;
public class Program {
	public static void main (String[]args){
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		FunctionProduct produto = new FunctionProduct();
		while (true){
				 produto.voltarMenu();
			String entrada = scan.next();

			
			switch (entrada.toUpperCase()){
				case "C":
					produto.cadastroProduto();
					break;
				case "R":
					System.out.println("VEM O MÉTODO REMOVER!");
					break;
				case "E":
					System.out.println("VEM O MÉTODO CONSULTAR!");
					break;
				case "S":
					System.out.println("PROGRAMA ENCERRADO!");
					//codigo encerrar
					return;
				default:
					System.out.println("OPÇÃO INVÁLIDA, TENTE NOVAMENTE!");
					continue;

			}

		}
	}
}
